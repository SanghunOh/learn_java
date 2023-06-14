public class Breaks {
    public static void main(String[] args) {
        // Try Catch문 사용
        try {
            // break문에 대한 사용법 알기
            for (int first=0;first < 4;first=first+1) {
                if (first == 2) {   // first값이 2이면 for문 종료
                    break;
                }
                System.out.println();
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
