package inheritances;
public class InheritanceMain {
    public static void main(String[] args) {
        // InheritanceObject inheritanceObject = new InheritanceObject();
        Calculations calculations = new Calculations();
        Calculations calculationsWithParams = new Calculations(6,7);
        ExtendsCalcaultions extendsCalcaultions = new ExtendsCalcaultions();
        System.out.println("Done");
    }
}

// {   // calcuations
//     first = 0;
//     {   // Calculations()
//         this.first = 1;
//     }
//     {   // addtion()
//         this.first = 2;
//     }
// }