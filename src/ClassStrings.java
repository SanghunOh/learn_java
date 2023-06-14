public class ClassStrings {
    public static void main(String[] args) {
        try {
            String name = "Sang hun Oh";
            name.equalsIgnoreCase("Sang hun Oh"); //true
            name.equalsIgnoreCase("Sang hun"); //false

            String name_second = new String("Friend Jane !");
            name_second.equals("Friend Jane !");    //true
            name_second.length();       // 13
            name_second = name_second.replaceAll("e", "a"); //"Friand Jana !"
            String[] arrays = name_second.split(" ");
            String name_substring = name_second.substring(3, 11);   //"and Jana"
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
