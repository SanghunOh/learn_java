package inheritances;
public class Calculations extends Object{
    int _first = 0;
    int _second = 0;
    // Constructor 
    Calculations(){
        System.out.println("Calculations - constructor");
    }

    Calculations(int first, int second){
        this._first = first;
        this._second = second;
        System.out.println("Calculations - constructor with params");
    }
    // multiplication
    public int multiplication(){
        int result = this._first * this._second;
        return result;
    }

    // Public Methods addition
    public int addition(int first,int second){
        int result = first + second;
        return result;
    }
    // Public Methods subtraction 
    public int subtraction(int first,int second){
        int result = first - second;
        return result;
    }
}
