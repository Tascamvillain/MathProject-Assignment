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
        
        int answer1 = arithmetic.add(5000000, 8666353);
        int answer2 = arithmetic.subtract(552, 866788);
        int answer3 = arithmetic.division(543462, 8677326);
        
        System.out.println("Answer1 -->  " + answer1);
        System.out.println("Answer2 -->  " + answer2);
        System.out.println("Answer3 -->  " + answer3);
        
        String a = JOptionPane.showInputDialog(null, "Number 1:");
        String b = JOptionPane.showInputDialog(null, "Number 2:");
        System.out.println("===================================================================");
        System.out.println(a + b);
        
        
        

    }

}
