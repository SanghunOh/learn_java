public class MethodsSwitchs {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    public String today(int day){
        String str = "";
        try {
            switch (day) {
                case 1:
                    str = "Monday";
                    break;
                case 2:
                    str = "Tuesday";
                    break;
                case 3:
                    str = "Wednesday";
                    break;
                case 4:
                    str = "Thursday";
                    break;
            }            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return str;
    }
    public static void main(String[] args) {
        try {
            int day = 4; // 1 ~ 4 가능
            String str = "";

            MethodsSwitchs methodsSwitchs = new MethodsSwitchs();
            String returnResult = methodsSwitchs.today(day);
            System.out.println(returnResult);
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
