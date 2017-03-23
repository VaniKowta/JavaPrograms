package wbl.assignment.Loops;

import java.io.IOException;
import java.util.Scanner;

public class AcceptInputCommand {


    public static void main(String args[]) throws IOException {
     
        //To get input from user from command prompt
        System.out.println("Please enter input from command prompt: ");
     
        Scanner inputReader = new Scanner(System.in);
       
        //Getting input in String format
        String name = inputReader.nextLine();
        System.out.println("Hi " + name);
     
        //Getting number as input from command line in Java
        System.out.println("Please enter a number from command line ");
        int number = inputReader.nextInt();
        System.out.println("You have entered : " + number);
     

}
}
