public class ClassFirsts {
    public int second = 0;
    ClassFirsts(){
        System.out.println();
    }
    ClassFirsts(int first){
        this.second = first;
        System.out.println(first);
    }

    public int getSecond(){
        return this.second;
    }
}
