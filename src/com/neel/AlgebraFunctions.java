package com.neel;

import java.util.Scanner;

import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.swing.text.html.HTML.Attribute.N;

public class AlgebraFunctions {
    //4! + 3 * 2
    //add(factorial(4), multiply(3, 2));

    public double add(double a, double b) {
        System.out.print(String.format("\033[2J"));
        double sum = a + b;
        System.out.printf("%15.2f\n", a);
        System.out.printf("%1s %13.2f\n", "+", b);
        System.out.printf("%15s\n", "---------------");
        System.out.printf("%15.2f\n", sum);
        System.out.println("When performing the operation carry over a 1 if the value goes above 10.");
        System.out.println("(Note that we start from the right of the equation.)");
        System.out.println("If 12 is stacked over 8, then the 2 and 8 add to 10. The \"1\" is carried over and 0 stays. 20 is the answer.");
        System.out.println("Simply add. The format shown will help you perform the operation.");
        return sum;
    } // done

    public double subtract(double a, double b) {
        double sub = a + b;
        System.out.printf("%15.2f\n", a);
        System.out.printf("%1s %13.2f\n", "-", b);
        System.out.printf("%15s\n", "---------------");
        System.out.printf("%15.2f\n", sub);
        System.out.println("We start from the left side of the equation and work our way the same way that we add.");
        System.out.println("Fill any spots with a 0. 12 stacked of 8 becomes 12 stacked of 08. subtract. 1 - 0 = 0. 2 - 8 doesnt work, so we borrow a 10.");
        System.out.println("12 - 8 is 4. Practice this consistently with bigger problems and master this.");
        System.out.println("Challenge: :) 4839 - 4930.134.");
        return a - b;
    } // done

    public double multiply(double a, double b) {
        double mul = a * b;
        System.out.printf("%15.2f\n", a);
        System.out.printf("%1s %13.2f\n", "x", b);
        System.out.printf("%15s\n", "---------------");
        System.out.printf("%15.2f\n", mul);
        return mul;
    } // done

    public double divide(double a, double b) {
        double div = a / b;
        System.out.printf("%15.2f\n", a);
        System.out.printf("%1s %13.2f\n", "/", b);
        System.out.printf("%15s\n", "---------------");
        System.out.printf("%15.2f\n", div);
        return div;
    } //done

    public double exponent(double a, double b) {
        double pow = Math.pow(a, b);
        System.out.printf("%15.2f\n", a);
        System.out.printf("%1s %11.2f\n", " ^ ", b);
        System.out.printf("%15s\n", "---------------");
        System.out.printf("%15.2f\n", pow);
        System.out.println("Multiply a number(the base) to it self the number of times(exponent).");
        return pow;
    } //done

    public double modulusDivision(double a, double b) {
        double mod = a % b;
        System.out.printf("%15.2f\n", a);
        System.out.printf("%1s %11.2f\n", " % ", b);
        System.out.printf("%15s\n", "---------------");
        System.out.printf("%15.2f\n", mod);
        System.out.println("Gives the remainder after the divsion.");
        return mod;
    } //done

    /*
    Factorial: 4! = 1*2*3*4
     */
    public long factorial(int a) {
        //for(int i = 1; i <= a; i++)
        if (a < 0) {
            throw new IllegalArgumentException("You cannot put a negative factorial!");
        }
        int i = 1;
        long aFactorial = 1;
        while (i <= a) {
            aFactorial = i++ * aFactorial;
        }

        System.out.println(a + "! = " + aFactorial);
        System.out.println("Multiply every number starting from one to each other until the number you started with. 3! is 1 x 2 x 3.");

        return aFactorial;
    } // done

    public double log(double a) {
        // log(sub - b)* (a) = c = b^c = a       b = base, a = argument, c = answer/power.
        double answer = Math.log(a);
        System.out.println("Log(" + a + ") = " + answer);
        return answer;

    } // done

    public void standardQuadraticEquation(Scanner in) {
        System.out.println("\nI will be solving the equation ax^2 + bx + c = 0. Enter the in the necessary values and let the magic happen.");

        System.out.println("Enter in the value \"a\".");
        double a = in.nextDouble();

        System.out.println("Enter in the value \"b\".");
        double b = in.nextDouble();

        System.out.println("Enter in the value \"c\".");
        double c = in.nextDouble();

        System.out.println("First lets find the discriminant. The value of the discriminant will tell us the number of solutions to an equation.");
        System.out.println("It is in the format b^2 - 4ac.");
        double discriminant = (b * b) - (4 * a * c);
        System.out.println("The discriminant is: " + discriminant);

        if (discriminant == 0) {
            System.out.println("The equation has one root.");
        } else if (discriminant > 0) {
            System.out.println("The equation has two roots.");
        } else if (discriminant < 0) {
            System.out.println("The equation has no real roots.");
            return;
        } else {
            System.out.println("Whoops! something might have gone wrong with the equation that you input.");
            return;
        }
        System.out.println("Now that we know that our equation has at least one root, we can get to solving for it.");
        System.out.println("The quadratic formula (-+b * √b^2 - 4ac)/2a");
        System.out.println("We can plug the values in and solve. The +-b means that b is both positive and negative so we have to solve two different equations.");
        System.out.println("One where b is postive and other where it is negative.");
        double solOfAlgPos = (-1 * b + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        double soldOfAlgNeg = (-1 * b - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;

        if (soldOfAlgNeg == solOfAlgPos) {
            System.out.println("The solution to your equation is: " + soldOfAlgNeg);
        } else if (soldOfAlgNeg != solOfAlgPos) {
            System.out.println("The two answers is: " + soldOfAlgNeg + " and " + solOfAlgPos + ".");
        }

        System.out.println("Thank you! Come back soon.");
    } // done

    public double sine(double a) {
        double answer = Math.sin(a);
        System.out.println("sine(" + a + ") = " + answer);
        return answer;
    } // done

    public double cos(double a) {
        double answer = Math.cos(a);
        System.out.println("cosine(" + a + ") = " + answer);
        return answer;
    } // done

    public double tan(double a) {
        double answer = Math.tan(a);
        System.out.println("tan(" + a + ") = " + answer);
        return answer;
    } // done

    public double logEquation(double base, double argument, double answer) {
        // Log(sub - b) * (a) = c        b^c = a   the base is the b, and argument is the a, the answer or power is c.
        System.out.println("Log(sub - b) * (a) = c        b^c = a   the base is the b, and argument is the a, the answer or power is c.");
        if (base == -1.01) {

            //given argument and answer, find base


            System.out.println("we need to find the power (c) given b and a, such that b^c = a");
            System.out.println("We are going to use the logarithms for finding this");
            System.out.println("remember: b^c =a, then logb(a) = c");
            System.out.println("So we are going to find logb(a) - log of a with base b.");
            System.out.println("And given logarithm formulas, logb(a) = log10(a)/log10(b)");
            double log10a = Math.log10(argument);
            double log10b = log10a / answer;


            System.out.println("log10(a) = " + log10a);
            System.out.println("log10a / answer = log10b = " + log10b);

            double b = Math.pow(10, log10b);
            System.out.println("base = 10^(log10b)" + b);
            System.out.println("missing base is: " + b);
            return b;

        } else if (argument == -1.01) {
            argument = Math.pow(base, answer);
            System.out.println("When we conver the log into the simpler format all we have to do is solve the exponenet problem.");
            System.out.println(argument);
        } else if (answer == -1.01) {
            System.out.println("Since the scenario makes it such that " + base + " ^ " + answer + " = " + argument + ", we will have to use ln.");
            System.out.println("We take the natural log of both sides and have x not become an exponenet anymore.");
            System.out.println("answerln("+ base +") = ln(" + argument + ").");
            System.out.println("x = (ln(31))/(ln(4))");
            System.out.println("You will need a calculator for the ln calculations as it is a irrational number.");
            double numerator = Math.E * argument;
            double denominator = Math.E * base;
            answer = numerator / denominator;
            return answer;
        } else {
            System.out.println("Im not sure what you want, it seems that all of the values are present.");
            return 0;
        }
        return 0;
    }


}
