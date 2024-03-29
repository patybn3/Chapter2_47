/* Problem Set 2 - 47 - a - e Chapter 2 Object-Oriented Data Structures Using Java, 4th Edition
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 10/02/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs this program
 * testDriverLimit object is created from the ArrayBoundedStack.java which implements an interface, StackInterface.java class
 * The following files are NOT original to this code (not coded by me):
    * StackInterface.java
    * StackUnderflowException.java
    * StackOverflowException.java
    * LLNode.java
 * The following file was partially coded by me (methods added): LinkedStack.java
 * It will take an user input as the size of the array
 * It will ask the user to enter the numbers to form the stack
 * In this program you can: Push to a stack (insert), pop from the top (remove), display the top element,
    pop a given number of elements, print the stack, swap the top two element's positions, print the menu, print the stack size.
 */

/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */
import java.util.Scanner;

public class Chapter2_47_PatriciaAntlitz
{
    Scanner scnr = new Scanner(System.in);
    //user inputs
    public int usrSize, userInt, popCount;
    public String userSelection = "";
    //variable for loop
    public boolean keepGoing = true;
    //a simple menu to direct the user to the methods
    public void printMenu()
    {
        System.out.println("1)   |---- Push (push();) ---------------| ");
        System.out.println("2)   |---- Pop (pop();) -----------------| ");
        System.out.println("3)   |---- Show Top Element (top();) ----| ");
        System.out.println("4)   |---- Print Stack (toString();) ----| ");
        System.out.println("5)   |---- Print Size (size();) ---------| ");
        System.out.println("6)   |---- Swap Start (swapStart();) ----| ");
        System.out.println("7)   |---- Pop Some (popSome();) --------| ");
        System.out.println("8)   |---- Print MENU -------------------| ");
        System.out.println("9)   |---- Pop Top Item (popTop()) ------| ");
        System.out.println("10)  |---- EXIT -------------------------| ");
        System.out.println("What operation would you like to perform? (Enter The Corresponding Number.)");
    }
    //this method holds all the calls
    public void userSelection()
    {
        //this program is an example of how the ArrayBoundedStack.java class works, it uses the second constructor passing a value as a parameter
        System.out.println("LinkedStack example:");
        System.out.println("How Many Numbers Would You Like To Enter?");
        usrSize = scnr.nextInt();

        printMenu();
        //object, array is now the size given by the user
        StackInterface<String> testDriverLimit = new LinkedStack<>();
        //while the condition is true
        while(keepGoing)
        {
            //menu selection
            userInt = scnr.nextInt();
            switch (userInt)
            {
                case 1:
                    //push to array
                    System.out.println("Push:");
                    //index 0
                    userSelection = scnr.nextLine();
                    //remaining indexes
                    for(int j = 0; j < usrSize; j++)
                    {
                        userSelection = scnr.nextLine();
                        testDriverLimit.push(userSelection);
                    }
                    break;
                case 2:
                    //pops the top element
                    System.out.println("Top Popped: " + testDriverLimit.top());
                    testDriverLimit.pop();
                    break;
                case 3:
                    //displays top element
                    System.out.println("Top Element = " + testDriverLimit.top());
                    break;
                case 4:
                    //prints the full array, if not empty
//                    if(testDriverLimit.isEmpty())
//                    {
//                        System.out.println("Stack is Empty, Please Enter 1 to Push:");
//                        break;
//                    }
//                    else
//                    {
                        System.out.println("Print Stack:");

                        testDriverLimit.toString();
//                    }
                    break;
                case 5:
                    //total size of the array
                    System.out.println("Size of Stack:");
                    //casted, the following methods called are not part of the interface.
                    System.out.println(((LinkedStack<String>) testDriverLimit).size());
                    break;
                case 6:
                    //swap top 2 items
                    ((LinkedStack<String>) testDriverLimit).swapStart();
                    System.out.println("Swapped!");
                    break;
                case 7:
                    //pops a certain amount of elements
                    System.out.println("Enter Amount To Pop:");
                    popCount = scnr.nextInt();
                    System.out.println(popCount + " Elements Popped.");
                    ((LinkedStack<String>) testDriverLimit).popSome(popCount);
                    break;
                case 8:
                    printMenu();
                    break;
                case 9:
                    System.out.println("Pop Top Element:");
                    System.out.println("Popped: " + ((LinkedStack<String>) testDriverLimit).popTop());
                    break;
                case 10:
                    //ends the loop
                    keepGoing = false;
                    break;
                //no default because it made no sense to use one
            }
            System.out.println("Select The Next Operation, or Enter 9 to See The Menu:");
        }
    }

    public static void main(String[] args)
    {

        Chapter2_47_PatriciaAntlitz runMethods = new Chapter2_47_PatriciaAntlitz();
        runMethods.userSelection();
    }
}
