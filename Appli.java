import javax.swing.JOptionPane;

public class Appli {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Entrez votre nom");

        JOptionPane.showMessageDialog(null, "Good afternoon " + name);

        int num = Integer.parseInt(JOptionPane.showInputDialog("Entrez un nombre"));

        JOptionPane.showMessageDialog(null, "Voici le nombre que vous avez choisi " + num);

        for(int i=1; i<13; i++) {
            JOptionPane.showMessageDialog(null, "Multiplication de votre nombre : " + num + "*" + i + " = " + num * i);
        }
    }
}
