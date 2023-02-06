import java.util.Scanner;

public class App {
    public int Minus(int first, int second){
        int result = first - second;
        return result;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        scanner.close();
        App main = new App();
        int result = main.Minus(first, second);
        System.out.println(result);
    }
}
