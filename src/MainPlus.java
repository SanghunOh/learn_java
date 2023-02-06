import java.util.Scanner;

/*
- 문제 파악
두 정수 A와 B를 입력받은 다음, A+B를 출력
입력값은 (0 < A, B < 10) 따라야 한다.

- 유추 파악
두 정수를 입력해 합을 출력.

- 주요 단어 영문 이름 선정
입력	input
정수	decimal
출력	output
합	plus
 */
public class MainPlus {
    // 두 정수 합 구함.
    public int plus(int input_first, int input_second) {
        int output_plus = input_first + input_second;
        return output_plus;
    }
    public static void main(String[] args) {
        /*
        - 테스트 케이스
        3 + 5 = 8
        20 + 50 = 70
        -1 + 5 = 	error
         */                
       //- 프로그래밍 순서
        //입력
        Scanner scanner = new Scanner(System.in);
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        scanner.close();

        //처리
        MainPlus main = new MainPlus();
        int output_plus = main.plus(input_first, input_second) ;

        //출력
        System.out.println(output_plus);
    }
}
