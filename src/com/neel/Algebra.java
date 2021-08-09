package com.neel;

import java.util.Scanner;

public class Algebra {


    public int askHowToPrint() throws InterruptedException {
        //Tells the user how to input their desired equation
        System.out.println("The format in which you can write the equation will be as such: a*b = c*x");
        System.out.println("Any value can be equal to each other. For example, a can be equal to b.");
        System.out.println("If you do not want the value to represent anything simply put the value one");
        System.out.println("One last thing,  the value x will serve as the varible in the equation,");
        System.out.println("so you will not have to plug a value for x.");
        System.out.println("Run the function: solveForVarible");
        System.out.println("Plug in your desired values!");
        Thread.sleep(2000);
        return 0;
    }


    public void showMenu() {
        System.out.println();
        System.out.println("What type of problem would you like to solve?");
        System.out.println("Functions you can use");
        System.out.println("  Add");
        System.out.println("  Subtract  ");
        System.out.println("  Multiply");
        System.out.println("  Divide");
        System.out.println("  Exponent");
        System.out.println("  Modulus");
        System.out.println("  Factorial");
        System.out.println("  Log");
        System.out.println("  Quadratic");
        System.out.println("  Sin");
        System.out.println("  Cos");
        System.out.println("  Tan");
        System.out.println("  Log Equation");
        System.out.println("Type Exit if you want the program to terminate");
        System.out.println("Type Help to show this menu again");
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\tDeveloped By Neel 2021 :DD");
    }

    /**
     * Little description about what you can do in the console.
     * 1. print: hello there, here you can input equations, to get the answer with steps!
     * 2. print List of Commands: Exit, Solve, Help, "Notebook"
     * 3. Execute command selected in #2.
     * 3a. Exit: Closes program
     * 3c. Help: print, Here are the commands that you can use: Exit, Solve
     * 3b - 4. Solve: Opens a Menu of formated equations for the user to solve.
     * 4a. Option a: a * b = c * [x]       Option b: "Coming Soon"    Option c: "Custom?"
     * 4b. The user can click on the format of the equation that they would like.
     * 4c.
     */

    public void readCommands() {
        AlgebraFunctions functions = new AlgebraFunctions();

        //System.out.println("To solve a new equation, type solve, to exit type exit");
        //System.out.println("Commands: Exit, Solve, Help.");
        //System.out.println("Ready for your commands my master!");

        showMenu();
        Scanner in = new Scanner(System.in);
        while (true) {

            String command = in.nextLine().trim();
            if (command.isEmpty()) {
                continue;
            }
            if (command.equalsIgnoreCase("exit")) {
                in.close();
                return;
            } else if (command.equalsIgnoreCase("help")) {
                System.out.println("To exit the program type \"exit\"");
                System.out.println("To find out what equations you can solve type \"solve\"");
                System.out.println(":D");
                showMenu();
                continue;
            } else if (command.equalsIgnoreCase("Add")) {

                //Read two numbers
                System.out.println("Input two numbers to add");
                double a = in.nextDouble();
                System.out.println("And second number");
                double b = in.nextDouble();
                functions.add(a, b);

            } else if (command.equalsIgnoreCase("Subtract")) {

                System.out.println("Input two numbers to subtract");
                double a = in.nextDouble();
                System.out.println("And second number");
                double b = in.nextDouble();
                functions.subtract(a, b);

            } else if (command.equalsIgnoreCase("Multiply")) {

                System.out.println("Input two numbers to multiply");
                double a = in.nextDouble();
                System.out.println("And second number");
                double b = in.nextDouble();
                functions.multiply(a, b);

            } else if (command.equalsIgnoreCase("Divide")) {

                System.out.println("Input two numbers to divide");
                double a = in.nextDouble();
                System.out.println("And second number");
                double b = in.nextDouble();
                functions.divide(a, b);

            } else if (command.equalsIgnoreCase("Exponent")) {

                System.out.println("Input two numbers to find exponent");
                double a = in.nextDouble();
                System.out.println("And second number");
                double b = in.nextDouble();
                functions.exponent(a, b);

            } else if (command.equalsIgnoreCase("Modulus")) {

                System.out.println("Input two numbers to find modulus");
                double a = in.nextDouble();
                System.out.println("And second number");
                double b = in.nextDouble();
                functions.modulusDivision(a, b);

            } else if (command.equalsIgnoreCase("Factorial")) {

                System.out.println("Input an integer numbers to find its factorial");
                int a = in.nextInt();
                functions.factorial(a);

            } else if (command.equalsIgnoreCase("Divide")) {

                System.out.println("Input two numbers to divide");
                double a = in.nextDouble();
                System.out.println("And second number");
                double b = in.nextDouble();
                functions.divide(a, b);

            } else if (command.equalsIgnoreCase("Log")) {

                System.out.println("Input a numbers to find the log with a base 'e'");
                double a = in.nextDouble();
                functions.log(a);

            } else if (command.equalsIgnoreCase("Quadratic")) {

                functions.standardQuadraticEquation(in);

            } else if (command.equalsIgnoreCase("sin")) {

                System.out.println("Input a numbers to find the sine value of a number");
                double a = in.nextDouble();
                functions.sine(a);

            } else if (command.equalsIgnoreCase("Cos")) {
                System.out.println("Input a numbers to find the cosine value of a number");
                double a = in.nextDouble();
                functions.cos(a);

            } else if (command.equalsIgnoreCase("Tan")) {
                System.out.println("Input a numbers to find the tan value of a number");
                double a = in.nextDouble();
                functions.tan(a);

            } else if (command.equalsIgnoreCase("Right Triangle")) {

                //todo: Implement in the future

            } else if (command.equalsIgnoreCase("Basic Trig Triangle")) {
                //todo: Implement in the future

            } else if (command.equalsIgnoreCase("Advanced Trig Triangle")) {
                //todo: Implement in the future

            } else if (command.equalsIgnoreCase("Egg")) {
                System.out.println("Neat little easter egg!");
                System.out.println("Enter in the operation that you want to use.");
                continue;
            } else if (command.equalsIgnoreCase("Log Equation")) {
                System.out.println("Lets solve Log Equation");
                System.out.println("Log(sub - b) * (a) = c        b^c = a   the base is the b, and argument is the a, the answer or power is c.");
                System.out.println("For the unknown value use -1.01.");
                System.out.println("Input Base");
                double base = in.nextDouble();

                System.out.println("Input Argument");
                double argument = in.nextDouble();

                System.out.println("Input Answer");
                double answer = in.nextDouble();
                functions.logEquation(base, argument, answer);

            } else {
                System.out.println("Whoops! Unknown Command :(");
                System.out.println("Enter in the operation that you want to use.");
                showMenu();
                continue;
            }

        }

    }

}