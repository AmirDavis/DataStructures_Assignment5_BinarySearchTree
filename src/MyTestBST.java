// Name: Amir Davis
// Class: CS 3305/Section#
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 5

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class MyTestBST {
    public static void main(String[] args) {
        int optionNumber = 0;
        String dataTreeType="";
        int intDataElement;
        String stringDataElement;
        boolean flag = false;
        BST<String> stringBST = new BST<String>();
        BST<Integer> intBST = new BST<Integer>();
        Scanner myScanner = new Scanner(System.in);

        do{
            printMenu();

            //If-else case to force the user to select the tree data tree type when the program first starts
            if(flag==false){
                optionNumber = 0;
                flag = true;
            }
            else{
                System.out.print("Enter option Number: ");
                optionNumber = myScanner.nextInt();
            }

            //Switch case that executes different BST methods depending on optionNumber (the users decision)
            switch (optionNumber){
                //User inputs what type (int or string) of BST they will be working with
                case 0:
                    System.out.print("Enter Tree Data Type (integer or string): ");
                    dataTreeType = myScanner.next();
                    myScanner.nextLine();
                    while ((!dataTreeType.equalsIgnoreCase("integer")&&!dataTreeType.equalsIgnoreCase("string"))){
                    System.out.print("Please input either integer or string: ");
                    dataTreeType = myScanner.next();
                    myScanner.nextLine();
                }
                    break;
                /*User inputs what they want to add to their BST. The program then calls the BST.insert method
                to add their data
                 */
                case 1:
                    System.out.print("Insert Data Element: ");
                    /*The program prompts the user to input an integer to delete from the BST. The program then checks
                    if the user inputted an integer to delete from the BST. If the user did not input an integer, the
                    program will alert the user that they have inputted an invalid input and to please input an integer.
                    The while loop is used to keep reiterating the try/catch blocks for as long as the user does not input
                    an integer. Once the user inputs an integer, the loop will break and the program will continue.
                     */
                    if(dataTreeType.equalsIgnoreCase("integer")){
                        while(true){
                            try{
                                intDataElement = myScanner.nextInt();
                                myScanner.nextLine();
                                break;
                            }catch (InputMismatchException e){
                                System.out.println("Invalid input type. Please input an integer: ");
                            }
                        }
                        System.out.print("BST before inserting " + intDataElement + " (Inorder): ");
                        intBST.inorder();
                        System.out.print("BST after inserting " + intDataElement + " (Inorder): ");
                        intBST.insert(intDataElement);
                        intBST.inorder();
                    }
                    else {
                        stringDataElement = myScanner.next();
                        myScanner.nextLine();
                        System.out.print("BST before inserting " + stringDataElement + " (Inorder): ");
                        stringBST.inorder();
                        System.out.print("BST after inserting " + stringDataElement + " (Inorder): ");
                        stringBST.insert(stringDataElement);
                        stringBST.inorder();
                    }
                    break;
                //The user inputs an element that they would like to delete from their BST
                case 2:
                    System.out.print("What element would you like to delete: ");
                    /*The program prompts the user to input an integer to delete from the BST. The program then checks
                    if the user inputted an integer to delete from the BST. If the user did not input an integer, the
                    program will alert the user that they have inputted an invalid input and to please input an integer.
                    The while loop is used to keep reiterating the try/catch blocks for as long as the user does not input
                    an integer. Once the user inputs an integer, the loop will break and the program will continue.
                     */
                    if(dataTreeType.equalsIgnoreCase("integer")){
                        while(true){
                            try{
                                intDataElement = myScanner.nextInt();
                                myScanner.nextLine();
                                break;
                            }catch (InputMismatchException e){
                                System.out.println("Invalid input type. Please input an integer: ");
                            }
                        }
                        System.out.println("Binary Search Tree before deleting " + intDataElement + "(Inorder): ");
                        intBST.inorder();
                        System.out.println("Binary Search Tree after deleting " + intDataElement + "(Inorder): ");
                        intBST.delete(intDataElement);
                            intBST.inorder();
                    }
                    else{
                        stringDataElement = myScanner.next();
                        myScanner.nextLine();
                        System.out.println("Binary Search Tree before deleting " + stringDataElement + "(Inorder): ");
                        stringBST.inorder();
                        System.out.println("Binary Search Tree after deleting " + stringDataElement + "(Inorder): ");
                        stringBST.delete(stringDataElement);
                        stringBST.inorder();
                    }
                    break;
                //The user inputs an element they would like to search for in their BST
                case 3:
                    System.out.println("Search for Element: ");
                    /*The program prompts the user to input an integer to search for in the BST. The program then checks
                    if the user inputted an integer to delete from the BST. If the user did not input an integer, the
                    program will alert the user that they have inputted an invalid input and to please input an integer.
                    The while loop is used to keep reiterating the try/catch blocks for as long as the user does not input
                    an integer. Once the user inputs an integer, the loop will break and the program will continue.
                     */
                    if(dataTreeType.equalsIgnoreCase("integer")){
                        while(true){
                            try{
                                intDataElement = myScanner.nextInt();
                                myScanner.nextLine();
                                break;
                            }catch (InputMismatchException e){
                                System.out.println("Invalid input type. Please input an integer: ");
                            }
                        }
                        System.out.println("Search for " + intDataElement + "? " + intBST.search(intDataElement));
                    }
                    else{
                        stringDataElement = myScanner.next();
                        myScanner.nextLine();
                        System.out.println("Search for " + stringDataElement + "? " + stringBST.search(stringDataElement));
                    }
                    break;
                //Prints the size of the user's BST
                case 4:
                    System.out.println("Print Tree Size: ");
                    if(dataTreeType.equalsIgnoreCase("integer")){
                        System.out.println("Tree size: " + intBST.getSize());
                    }
                    else{
                        System.out.println("Tree size: " + stringBST.getSize());
                    }
                    break;
                //Prints out the path in inorder traversal from the root to the user's input
                case 5:
                    System.out.print("Path from Root to Data Element: ");
                    if(dataTreeType.equalsIgnoreCase("integer")) {
                        while (true) {
                            try {
                                intDataElement = myScanner.nextInt();
                                myScanner.nextLine();
                                break;
                            } catch (InputMismatchException e) {
                                System.out.println("Invalid input type. Please input an integer: ");
                            }
                        }
                        for(int i = 0; i < intBST.path(intDataElement).size(); i++){
                            System.out.print(intBST.path(intDataElement).get(i).element + " ");
                        }
                    }
                    else{
                        stringDataElement = myScanner.next();
                        myScanner.nextLine();
                        for(int i = 0; i < stringBST.path(stringDataElement).size(); i++){
                            System.out.print(stringBST.path(stringDataElement).get(i).element + " ");
                        }
                    }
                    break;
                case 6:
                //returns true if the user's BST is empty. False if it is not
                    System.out.print("Is tree empty? ");
                    if(dataTreeType.equalsIgnoreCase("integer")){
                        System.out.println(intBST.isEmpty());
                    }
                    else{
                        System.out.println(stringBST.isEmpty());
                    }
                    break;
                //Prints out the user's BST in preorder traversal
                case 7:
                    System.out.print("BST preorder traversal: ");
                    if(dataTreeType.equalsIgnoreCase("integer")){
                        intBST.preorder();
                    }
                    else{
                        stringBST.preorder();
                    }
                    break;
                //Prints out the user's BST in inorder traversal
                case 8:
                    System.out.print("BST inorder traversal: ");
                    if(dataTreeType.equalsIgnoreCase("integer")){
                        intBST.inorder();
                    }
                    else{
                        stringBST.inorder();
                    }
                    break;
                case 9:
                //Prints out the user's BST in postorder traversal
                    System.out.print("BST postorder traversal: ");
                    if(dataTreeType.equalsIgnoreCase("integer")){
                        intBST.postorder();
                    }
                    else{
                        stringBST.postorder();
                    }
                    break;
                //exits the program
                case 10:
                    System.out.println("Exit program");
                    break;
            }
        }while(optionNumber != 10);
    }

    //Prints the choices that the user can choose from
    public static void printMenu() {
            System.out.println("\n----------------MAIN MENU---------------\n" +
                    "0. Enter Tree Data Type (integer or string)\n" +
                    "1. Insert Data Element\n" +
                    "2. Delete Data Element\n" +
                    "3. Search for Data Element\n" +
                    "4. Print Tree Size\n" +
                    "5. Path from Root to Data Element\n" +
                    "6. Check if Empty Tree\n" +
                    "7. Print Preorder Traversal\n" +
                    "8. Print Inorder Traversal\n" +
                    "9. Print Postorder Traversal\n" +
                    "10. Exit program\n\n");
    }
}

