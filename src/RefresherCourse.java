import javax.swing.*;
import java.awt.*;

public class RefresherCourse {

    public static void main(String[] args) {
        System.out.println("Hello World \nWelcome to Java\n24");
        JOptionPane.showMessageDialog((Component)null, "Satisfied?");

        int i;
        for(i = 1; i <= 5; ++i) {
            System.out.println("Welcome to Java");
        }

        System.out.println("       J        A      V           V      A");
        System.out.println("       J      A   A      V       V      A   A");
        System.out.println(" J     J    AAAAAAAAA      V   V      AAAAAAAAA");
        System.out.println("   J J    A           A      V      A           A");

        for(i = -1; i <= 8; ++i) {
            System.out.println(i + 1);
            System.out.println("Edit Check");
            System.out.println("Another Edit Check");

        }

    }
}
