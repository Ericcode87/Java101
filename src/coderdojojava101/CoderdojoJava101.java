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
        AreYouOlderThan18();
        //Greaterthanexample();
        //mathguessexample(args);
    }

    public static void AreYouOlderThan18()
    {
        String ageInput = JOptionPane.showInputDialog("what age are you?");
        int age = Integer.parseInt(ageInput);
        if (age > 18)
        {
            System.out.println("You're older than 18,you can vote");
        } else if (age == 18)
        {
            System.out.println("GET A JOB!");
        } else
        {
            System.out.println("Bugger off");
        }
    }

    public static void Greaterthanexample()
    {
        System.out.println("Greaterthanexample");
    }

    public static void mathguessexample(String[] args)
    {
        String name = JOptionPane.showInputDialog("What is your name");
        System.out.print("Hello ");
        System.out.println(name);

        System.out.println("Hello " + name + " is my name");

        String input1 = JOptionPane.showInputDialog("Enter a number");
        String input2 = JOptionPane.showInputDialog("Enter a number");

        String answerinput1 = JOptionPane.showInputDialog("Enter the multiplication answer");
        int guessanswer = Integer.parseInt(answerinput1);
        int number1 = Integer.parseInt(input1);
        int number2 = 4;
        int sum;
        sum = number1 * number2;

        if (guessanswer == sum)
        {
            System.out.println("you guessed correctly");
        } else
        {
            System.out.println("you got that wrong" + guessanswer + " is wrong. " + sum + " Is the right answer.");
        }
        System.out.println(sum);
        System.out.println(number1 + " * " + number2 + " = " + sum);
        int ans = add(64, 5);
        int ans1 = add2(5, 5);
        System.out.println(ans);
    }

    public static int add(int number1, int number2)
    {

        return number1 + number2;
    }

    public static int add2(int number3, int number4)

    {
        return number3 * number4;
    }
}
