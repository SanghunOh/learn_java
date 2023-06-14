public class MethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x에 +1
    public int F(int x) // x = 0
    {
        int result = x * 1;
        return result;
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            MethodBasics methodBasics = new MethodBasics();
            y = methodBasics.F(x);

            y = y + 1; // 변수에 + 1
            MethodBasics methodBasics_first = new MethodBasics();
            y = methodBasics_first.F(y);  // F(0)
            y = methodBasics_first.F(y);  // F(0)

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
