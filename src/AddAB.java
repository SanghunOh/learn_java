// 문제
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
// refer : https://www.acmicpc.net/problem/1000
import java.util.Scanner;
public class AddAB{
    public static void main(String[] args){
// 입력
// 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
           
// 출력
// 첫째 줄에 A+B를 출력한다.
        System.out.println(A+B);
        in.close();
    }
}