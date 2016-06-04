/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Tomide James
 */
public class MathProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arithmetic arithmetic = new Arithmetic();
        String x = JOptionPane.showInputDialog("Enter Number 1:");
        String y = JOptionPane.showInputDialog("Enter Number 2:");

        int a = Integer.parseInt(x);  // conversion
        int b = Integer.parseInt(y);  // 

        int answer1 = arithmetic.add(a, b);
        int answer2 = arithmetic.subtract(a, b);
        int answer3 = arithmetic.division(a, b);

        System.out.println("===================================================================");
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        JOptionPane.showMessageDialog(null, "Add result --> " + answer1);
        JOptionPane.showMessageDialog(null, "Substract result --> " + answer2);
        JOptionPane.showMessageDialog(null, "Division result -->  " + answer3);

    }

}
