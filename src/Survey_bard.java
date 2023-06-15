import java.sql.*;

// terminal java 코드 작성
// - Mysql 사용, 스키마는 위에 있는 것 사용
// - 종료 전까지 계속 설문 진행
// - 기능 구성 : 설문자 선택, 설문 진행, 설문한 통계 보기
// - 기능 구성은 method로 작성
// - 설문자 선택  기능 : 재 설문 시 이전 설문자 정보 삭제
// - 설문 진행 기능 : 순서대로 설문 내용과 답변 받기
// - 설문한 통계 기능 : 총 설문자 표시와 문항마다 최대 선택 번호

public class Survey_bard {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/survey_db";
    private static final String DB_USERNAME = "your_username";
    private static final String DB_PASSWORD = "your_password";

    private static final String RESPONDENTS_TABLE = "RESPONDENTS";
    private static final String STATISTICS_TABLE = "STATISTICS";
    private static final String QUESTIONS_TABLE = "QUESTIONS";
    private static final String CHOICE_TABLE = "CHOICE";
    
    private static Connection conn;
    private static Statement stmt;
    private static PreparedStatement prepStmt;

    public static void main(String[] args) {
        try {
            // Connect to the database
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            
            // Create a statement object
            stmt = conn.createStatement();

            // Select the surveyor
            selectSurveyor();

            // Conduct the survey
            conductSurvey();

            // Display surveyed statistics
            displayStatistics();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connections and resources
            closeResources();
        }
    }

    private static void selectSurveyor() throws SQLException {
        System.out.println("Surveyor Selection");
        System.out.println("-------------------");

        // Delete previous surveyor information
        stmt.executeUpdate("DELETE FROM " + RESPONDENTS_TABLE);

        // Get surveyor details from the user
        String surveyorName = getInput("Enter the surveyor name: ");
        String surveyorCode = generateSurveyorCode();

        // Insert surveyor details into the RESPONDENTS table
        prepStmt = conn.prepareStatement("INSERT INTO " + RESPONDENTS_TABLE + " (RESPONDENTS, RESPONDENTS_ID) VALUES (?, ?)");
        prepStmt.setString(1, surveyorName);
        prepStmt.setString(2, surveyorCode);
        prepStmt.executeUpdate();

        System.out.println("Surveyor selected: " + surveyorName + " (Code: " + surveyorCode + ")\n");
    }

    private static void conductSurvey() throws SQLException {
        System.out.println("Survey Progress");
        System.out.println("---------------");

        ResultSet questionsResult = stmt.executeQuery("SELECT QUESTIONS_ID, QUESTIONS FROM " + QUESTIONS_TABLE);
        
        while (questionsResult.next()) {
            String questionId = questionsResult.getString("QUESTIONS_ID");
            String question = questionsResult.getString("QUESTIONS");

            System.out.println("Question: " + question);

            // Get answer choices for the current question
            ResultSet choicesResult = stmt.executeQuery("SELECT CHOICE_ID, CHOICE FROM " + CHOICE_TABLE);
            while (choicesResult.next()) {
                String choiceId = choicesResult.getString("CHOICE_ID");
                String choice = choicesResult.getString("CHOICE");
                System.out.println(choiceId + ". " + choice);
            }

            // Get the answer from the user
            String selectedChoice = getInput("Enter your answer (Choice ID): ");

            // Insert the survey response into the STATISTICS table
            prepStmt = conn.prepareStatement("INSERT INTO " + STATISTICS_TABLE + " (STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID) VALUES (?, ?, ?, ?)");
            prepStmt.setString(1, generateStatisticsId());
            prepStmt.setString(2, getSurveyorCode());
            prepStmt.setString(3, questionId);
            prepStmt.setString(4, selectedChoice);
            prepStmt.executeUpdate();

            System.out.println("Response recorded.\n");
        }
    }

    private static void displayStatistics() throws SQLException {
        System.out.println("Surveyed Statistics");
        System.out.println("-------------------");

        ResultSet questionsResult = stmt.executeQuery("SELECT QUESTIONS_ID, QUESTIONS FROM " + QUESTIONS_TABLE);
        
        while (questionsResult.next()) {
            String questionId = questionsResult.getString("QUESTIONS_ID");
            String question = questionsResult.getString("QUESTIONS");

            System.out.println("Question: " + question);

            // Get the total surveyed count for the current question
            ResultSet countResult = stmt.executeQuery("SELECT COUNT(*) AS total FROM " + STATISTICS_TABLE + " WHERE QUESTIONS_ID = '" + questionId + "'");
            countResult.next();
            int totalSurveyed = countResult.getInt("total");
            System.out.println("Total Surveyed: " + totalSurveyed);

            // Get the maximum selection number for the current question
            ResultSet maxResult = stmt.executeQuery("SELECT CHOICE_ID, COUNT(*) AS selection_count FROM " + STATISTICS_TABLE + " WHERE QUESTIONS_ID = '" + questionId + "' GROUP BY CHOICE_ID ORDER BY selection_count DESC LIMIT 1");
            maxResult.next();
            String maxSelectionChoice = maxResult.getString("CHOICE_ID");
            int maxSelectionCount = maxResult.getInt("selection_count");
            System.out.println("Maximum Selection: " + maxSelectionChoice + " (" + maxSelectionCount + " selections)\n");
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        return System.console().readLine();
    }

    private static String generateSurveyorCode() {
        return "S" + System.currentTimeMillis();
    }

    private static String generateStatisticsId() {
        return "ST" + System.currentTimeMillis();
    }

    private static String getSurveyorCode() throws SQLException {
        ResultSet surveyorResult = stmt.executeQuery("SELECT RESPONDENTS_ID FROM " + RESPONDENTS_TABLE);
        surveyorResult.next();
        return surveyorResult.getString("RESPONDENTS_ID");
    }

    private static void closeResources() {
        try {
            if (prepStmt != null) {
                prepStmt.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
