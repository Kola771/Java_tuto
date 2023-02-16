public class Essai {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethode(String fname) {
        System.out.println(fname + " Doe");
    }

    static int myMethodes(int x) {
        return 5 + x;
    }

    static void checkAge(int age) {
        if(age < 18) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }

    int x = 5;
    
    public void call() {
        System.out.println("Coucou");
    }

    int y;
    public Essai() {
        y = 19;
    }
    public static void main(String[] args) {
        // myMethod();
        // myMethode("John");
        // System.out.println(myMethodes(29));
        // checkAge(19);

        Essai myObj = new Essai();
        // System.out.println(myObj.x);
        // myObj.call();
        System.out.println(myObj.y);

        // System.out.println("Hello World");
        // String carName = "Volvo";
        // System.out.println(carName);
        // int maxSpeed = 120;
        // System.out.println(maxSpeed);

        // int x = 5;
        // int y = 10;
        // System.out.println(x+y);

        // String[] cars = {"Volvo", "BMW", "Ford"};
        // for(String i : cars) {
        //     System.out.println(i);
        // }

        // for(int i = 0; i<10; i++) {
        //     if(i==5) {
        //         break;
        //     }
        //     System.out.println(i);
        // }

        // for(int i = 0; i<10; i++) {
        //     if(i==4) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        
    }
}
