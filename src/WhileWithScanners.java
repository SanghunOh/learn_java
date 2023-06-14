import java.util.Scanner;

public class WhileWithScanners {
    // 콜센터 업무 안내 작성
    public static void main(String[] args) {
        // Try Catch문 사용
        try {
            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            String answer = "";
            System.out.println("안내입니다.");
            boolean loops = true;
            while (loops) {
                System.out.println(" 1-대출, 2-예금, 3~9-종료");
                System.out.print(" 입력 하세요 : ");
                answer = myObj.nextLine();
                if (answer.equals("1")) {
                    System.out.println("대출 업무입니다.");
                } else if (answer.equals("2")) {
                    System.out.println("예금 업무입니다.");
                } else {
                    System.out.println("업무가 종료됩니다.");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println();
        } finally {
            System.out.println();
        }
        System.out.println();
        // return 0;
    }
}
