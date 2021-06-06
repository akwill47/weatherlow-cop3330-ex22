package ex22.base;
import java.util.Scanner;
/*
Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different.
If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.
Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
Challenges
Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
*/
public class App {
    Scanner in = new Scanner(System.in);
    final int size = 3;
    public static void main(String[] args){
        App myApp = new App();
        
        int[] num = myApp.readInput();
        int max = myApp.checkInput(num);
        myApp.displayOutput(max);

    }
    private int[] readInput(){
        String[] num = new String[size];
        num[0] ="first";
        num[1] ="second";
        num[2] ="third";            ;
        int[] arr = new int[size];

        for(int i=0;i<size;i++){
            System.out.printf("Enter the %s number: ",num[i]);
            arr[i] = in.nextInt();
            in.nextLine();
        }
        return arr;

    }
    private int checkInput(int[] arr){
        int newMax=arr[0];
        for(int i =0;i<size-1;i++){
            if(arr[i] == arr[i+1]){
                System.exit(0);
            }
            else if(newMax<arr[i+1]){
                newMax = arr[i+1];
            }
        }
        return newMax;
    }
    private void displayOutput(int max){
        System.out.printf("The largest number is %d.",max);
    }
}
