import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// terminal java 코드 작성
// - Mysql 사용, 스키마는 위에 있는 것 사용
// - 종료 전까지 계속 설문 진행
// - 기능 구성 : 설문자 선택, 설문 진행, 설문한 통계 보기
// - 기능 구성은 method로 작성
// - 설문자 선택  기능 : 재 설문 시 이전 설문자 정보 삭제
// - 설문 진행 기능 : 순서대로 설문 내용과 답변 받기
// - 설문한 통계 기능 : 총 설문자 표시와 문항마다 최대 선택 번호

public class Survey_chatGPT {

    private static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/survey";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    private static Connection connection;
    private static PreparedStatement preparedStatement;
    private static ResultSet resultSet;

    public static void main(String[] args) throws Exception {

        // 드라이버 로드
        Class.forName(DRIVER_CLASS_NAME);

        // 연결 생성
        connection = DriverManager.getConnection(URL, USER, PASSWORD);

        // 설문자 선택
        selectSurveyer();

        // 설문 진행
        startSurvey();

        // 설문한 통계 보기
        showSurveyStatistics();

        // 연결 종료
        connection.close();
    }

    private static void selectSurveyer() throws Exception {

        // 설문자 정보를 삭제합니다.
        preparedStatement = connection.prepareStatement("DELETE FROM surveyer");
        preparedStatement.execute();

        // 설문자를 선택합니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("설문자를 선택하세요.");
        String name = scanner.next();

        // 설문자를 저장합니다.
        preparedStatement = connection.prepareStatement("INSERT INTO surveyer (name) VALUES (?)");
        preparedStatement.setString(1, name);
        preparedStatement.execute();
    }

    private static void startSurvey() throws Exception {

        // 설문 내용을 가져옵니다.
        preparedStatement = connection.prepareStatement("SELECT question, answer FROM question");
        resultSet = preparedStatement.executeQuery();

        // 설문을 진행합니다.
        while (resultSet.next()) {
            System.out.println(resultSet.getString("question"));
            String answer = scanner.next();

            // 답변을 저장합니다.
            preparedStatement = connection.prepareStatement("INSERT INTO answer (surveyer_id, question_id, answer) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, 1); // 설문자 ID
            preparedStatement.setInt(2, resultSet.getInt("question_id")); // 문항 ID
            preparedStatement.setString(3, answer); // 답변
            preparedStatement.execute();
        }
    }

    private static void showSurveyStatistics() throws Exception {

        // 설문한 통계를 가져옵니다.
        preparedStatement = connection.prepareStatement("SELECT COUNT(*) AS total_surveyer, COUNT(DISTINCT question_id) AS total_question, MAX(answer) AS max_answer FROM answer");
        resultSet = preparedStatement.executeQuery();

        // 설문한 통계를 출력합니다.
        while (resultSet.next()) {
            System.out.println("총 설문자: " + resultSet.getInt("total_surveyer"));
            System.out.println("총 문항: " + resultSet.getInt("total_question"));
            System.out.println("최대 답변: " + resultSet.getString("max_answer"));
        }
    }
}