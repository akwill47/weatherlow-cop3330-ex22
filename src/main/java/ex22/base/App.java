package ex22.base;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 22 Solution
 *  Copyright 2021 William Weatherlow
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
