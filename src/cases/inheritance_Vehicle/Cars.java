package cases.inheritance_Vehicle;

public class Cars extends Vehicles{
    int _oneway_count = 0;

    Cars(int oneway_count){
        this._oneway_count = oneway_count;
  
    }
    
    public int speed(int kms, int hours){
        int result = ((kms / hours) + _oneway_count);
        System.out.println("speed : " + result);
        return result;
   
    }
    
}
