/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coderdojojava101;

import javax.swing.JOptionPane;

/**
 *
 * @author tucot
 */
public class CoderdojoJava101 
{

    public static void main(String[] args) 
    {
        String name = JOptionPane.showInputDialog("What is your name");
        System.out.print("Hello ");
        System.out.println(name);
        
        System.out.println("Hello " + name + " is my name");
        
        String input1 = JOptionPane.showInputDialog("Enter a number");
        String input2 = JOptionPane.showInputDialog("Enter a number");

        String answerinput1 = JOptionPane.showInputDialog("Enter the multiplication answer");
        
        int number1 = Integer.parseInt(input1);
        int number2 = 4;
        int sum;
        sum = number1 * number2;
        System.out.println(sum);
        System.out.println(number1 + " * " + number2 + " = " + sum);
        
    }
    
}
