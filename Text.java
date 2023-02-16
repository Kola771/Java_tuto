public class Text {
    // int x=5;
    int x;

    // public void myMethod() {
    //     System.out.println("Hello World");
    // }

    public Text() {
        x = 10;
    }
    public static void main(String[] args) {
        Text obj = new Text();
        // System.out.println(obj.x);
        // obj.myMethod();
        System.out.println(obj.x);

        String car = "     barbier kola";
        // System.out.println(car.toCharArray());
        System.out.println(car.trim().toUpperCase());
    }
}
