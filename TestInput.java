import java.util.Arrays;
import java.util.Scanner;

public class TestInput {

    public static void array(String params) {
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
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez les données de votre tableau");
        String tab = input.nextLine();
        array(tab);

    }
}
