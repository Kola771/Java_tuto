import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre nom");
        String username = scanner.nextLine();
        System.out.println("Votre username est : " + username);
        // int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Entrez votre age");
        int age = scanner.nextInt();
        System.out.println("Votre age est : " + age + " ans.");

        System.out.println("Entrez votre taille");
        double taille = scanner.nextDouble();
        System.out.println("Votre taille est : " + taille + " mètre.");
    }
}
