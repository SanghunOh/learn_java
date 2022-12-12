package inheritances;
public class ExtendsCalcaultions extends Calculations{
    ExtendsCalcaultions(){
        System.out.println("ExtendsCalcaultions - constructor");
    }

    // multiply
    public int multiplication(int first, int second){
        int result = first * second;
        return result;
    }

    // Public Methods subtraction 
    public int subtraction(int first,int second){
        int result = second - first;
        return result;
    }
}
