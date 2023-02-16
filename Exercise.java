import java.util.Arrays;

public class Exercise {
    public static void mySwap(int x, int y) {
        System.out.println("La valeur de x avant le changement était ==> " + x);
        System.out.println("La valeur de y avant le changement était ==> " + y);
        int z = y;

        y = x;
        x = z;

        System.out.println("La valeur de x après le changement est ==> " + x);
        System.out.println("La valeur de y après le changement est ==> " + y);
      }

      public double hyp(double a, double b) {
        double hypothenus = a*a + b*b;
        return Math.sqrt(hypothenus);
      }

      static void table(int[] params) {
        Arrays.sort(params);
        System.out.println(Arrays.toString(params));
      }

      static void more(String params) {
        // Arrays.sort(params);
        String[] tableau = params.split(" ");

        int[] array = new int[tableau.length];
        for(int i = 0; i<array.length; i++) {
            array[i] = Integer.parseInt(tableau[i]);
        }
        for(int i = 0; i<array.length; i++) {
            for(int j = i+1; j<array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                
            }
        }

        // int[] tableau_cast = (int[]) tableau;
        // Arrays.sort(tableau);
        System.out.println(Arrays.toString(array));
        int first = array[0];
        int last = array[array.length-1];
        System.out.println(first + " " + last);
      }
    public static void main(String[] args) {
        // mySwap(5, 6);

        // Exercise myObj = new Exercise();

        // System.out.println("La longueur de l'hypothenus est ==> " + myObj.hyp(3, 4));
        // int[] myNumbers = {1,9,3,2};
        // table(myNumbers);

        String text = "1 -5 -9 0 3 787 987 14 19 2 5";
        more(text);
    }
}
