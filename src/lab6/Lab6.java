package lab6;

import java.util.Scanner;

/**
 *
 * @author Keon Muellerchen
 */
public class Lab6 {

    public static void main(String[] args) {
        /**
         * 1.  Using a while loop, display the numbers 1-100 on the screen - 1 # on each line
         */
        System.out.print("Question 1:\n");
        int i = 1;
        while (i <= 100)
        {
            System.out.printf("%2d%n", i);
            i++;
        }//end of while
        
        /**
         * 2.  Using a while loop, display the numbers 2-100 on the screen
         *     going up in units of 2.  For example 2, 4, 6, 8 ... 96, 98, 100
         */
        System.out.print("Question 2:\n");
        int quest2 = 2;
        while (quest2 <= 100)
        {
            System.out.printf("%2d%n", quest2);
            quest2+=2;
        }//end of while
        
        /**
         * 3.  Using a while loop, display the numbers 100-1 on the screen
         *     going down in units of 5.  For example 100, 95, 90, 85...10, 5
         */
        System.out.print("Question 3:\n");
        int quest3 = 100;
        while (quest3 >= 1)
        {
            System.out.printf("%2d%n", quest3);
            quest3-=5;
        }//end of while
        
        /**
         * 4.  Using a while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 10
         */
        
        System.out.print("Question 4:\n");
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number 10.");
        int num = keyboard.nextInt();
        while (num != 10)
        {
            
            System.out.print("Wrong Number, try again.");
            num = keyboard.nextInt();
        }//end of while
           
        
        /**
         * 5.  Using a do...while loop, ask the user to enter a number, continue
         *     asking for a number until the user enters the number 15
         */
        System.out.print("Question 5:\n");
        int k;
        
        do {
            System.out.print("Enter the number 15.");
             k = keyboard.nextInt();
        }while (k != 15);
        
 
        /**
         * 6.  Using a for loop, display the numbers 1-100 on the screen
         */
        System.out.print("Question 6:\n");
        
        for (int x=1; x <=100; x++)
            System.out.printf("%2d%n", x);
        
        
        /**
         * 7.  Using a for loop, display the numbers 2-100 on the screen, going up in steps of 2
         */
        System.out.print("Question 7:\n");
        
        for (int y=2; y <=100; y+=2)
            System.out.printf("%2d%n", y);
        
        
        /**
         * 8.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 1
         */
        System.out.print("Question 8:\n");
        
        for (int quest8 = 100; quest8 >=0; quest8-=1)
            System.out.printf("%2d%n", quest8);
        
        /**
         * 9.  Using a for loop, display the numbers 100-0 on the screen, going down in steps of 5
         */
        System.out.print("Question 9:\n");
        
        for (int quest9 = 100; quest9 >=0; quest9-=5)
            System.out.printf("%2d%n", quest9);
        
        /**
         * 10. Using the loop style of your choice, write a program that will display the numbers 1-100, where each
         *     number is on it's own line.  
         *      
         *     ->If the number displayed is divisible by 4, write your first name after the number.
         *     ->If the number displayed is divisible by 9, write your last name
         *     ->If the number displayed is divisible by both 4 & 9, write your first name a space and then your last name.
         */
        System.out.print("Question 10:\n");
        for (int count =1;count<=100;count++)
        {
            System.out.printf("%n%3d. ", count);
            
            //check if divisible by 4
            if(count % 4 == 0 )
                System.out.print("Keon ");
            
            //check if divisible by 9
            if(count % 9 == 0 )
                System.out.print("Muellerchen ");
            
            //check if divisible by both 4 and 9
            if(count % 4 == 0 && count % 9 == 0 )
                System.out.print("Keon Muellerchen");
        }//end of for
    }//end of main  
}//end of Lab6
