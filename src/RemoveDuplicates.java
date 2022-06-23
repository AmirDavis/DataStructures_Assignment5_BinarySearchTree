// Name: Amir Davis
// Class: CS 3305/Section#
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 5

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        BST<String> stringBST = new BST<>();
        String userString="";
        int optionNumber;
        Scanner myScanner = new Scanner(System.in);

        do{
            printMenu();
            optionNumber = myScanner.nextInt();
            myScanner.nextLine();
            switch (optionNumber){
                //Reads a string from the user
                case 1:
                    System.out.println("Input string: ");
                    userString = myScanner.nextLine();
                    break;
                case 2:
                    /*Splits the user's string using a space as a dilimeter. Then puts each word in a string
                    array called stringArray. Then the for loop is used to insert the words from stringArray
                    into a string BST, however, if a word is already in the BST, that word will not be added
                     */
                    String[] stringArray = userString.split(" ");
                    for(int i = 0; i < stringArray.length; i++){
                        if(!stringBST.search(stringArray[i])){
                            stringBST.insert(stringArray[i]);
                        }
                    }

                    System.out.println("Original Text: ");
                    System.out.println(userString);

                    System.out.println("Processed Text: ");
                    stringBST.inorder();
                    break;
                case 3:
                    break;
            }
        }while(optionNumber!=3);

    }

    //Prints out the choices the user can select from
    public static void printMenu(){
        System.out.print("\n-----------------MAIN MENU---------------\n" +
                "1. Read input string\n" +
                "2. Remove duplicates and display outputs\n" +
                "3. Exit program\n\n" +
                "Enter option number: ");
    }
}
