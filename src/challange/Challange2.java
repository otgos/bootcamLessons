package challange;

import java.util.Scanner;

public class Challange2 {
            /*
        Problem2:
            Write a menu driven program to do following operation on two dimensional
            array A of size m x n. You should use user-defined methods which accept 2-D array A,
            and its size m and n as arguments. The options are:
                1-To input elements into matrix of size m x n
                2-To display elements of matrix of size m x n
                3-Sum of all elements of matrix of size m x n
                4-To display row-wise sum of matrix of size m x n
                5-To display column-wise sum of matrix of size m x n
                6-To create transpose of matrix of size n x m
         */



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows : ");
        int m = scanner.nextInt();

        System.out.println("How many columns : ");
        int n = scanner.nextInt();

        int[][] matrix = new int[m][n];

        int select = 0;
        do {

            System.out.println("            ================**MENU**==============");
            System.out.println("                Select 1-To input elements into matrix of size "+ m +" x " +n+"\n" +
                    "                Select 2-To display elements of matrix of size "+ m +" x " +n+"\n" +
                    "                Select 3-Sum of all elements of matrix of size "+ m +" x " +n+"\n" +
                    "                Select 4-To display row-wise sum of matrix of size "+ m +" x " +n+"\n" +
                    "                Select 5-To display column-wise sum of matrix of size "+ m +" x " +n+"\n" +
                    "                Select 6-To create transpose of matrix of size "+ n +" x " +m+"\n");
            System.out.println("             ================**MENU**==============");
            System.out.println("Please select from the options: ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    inputElements(matrix);
                    break;
                case 2:
                    displayMatrix(matrix);
                    break;
                case 3:
                    System.out.println("Sum of the elements of array is :"+sumOfElements(matrix));
                    break;
                case 4:
                    rowWiseSum(matrix);
                    break;
                case 5:
                    columnWiseSum(matrix);
                    break;
                case 6:
                    transposeOfMatrix(matrix);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid number, please select numbers between 1 and 6");
            }

        }
        while(select!=0);
        System.out.println("Program has terminated!");
    }


    public static int[][] inputElements(int[][] arr){
//        int [][] arr = new int[matrix().length][matrix()[0].length];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.println("Enter an integer element for the array: ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void displayMatrix(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int sumOfElements(int [][] arr){
        int sum = 0;
        for(int[] brr : arr){
            for(int el: brr){
                sum+=el;
            }
        }
        return sum;
    }
    public static void rowWiseSum(int [][] arr){
        int sum = 0;
        int rowNo = 1;
        for(int[] brr : arr){
            for(int el: brr){
                sum+=el;
            }
            System.out.println("Sum of row #: "+rowNo +" is "+sum);
            rowNo++;
            sum=0;
        }
    }
    public static void columnWiseSum(int [][] arr){
        int sum = 0, col = 0;
        int rowNo = 1;
        for(int i = 0; i<arr[0].length; i++){
            for(int j = 0; j<arr.length; j++){
                sum+=arr[j][i];
            }
            System.out.println("Sum of column #: "+rowNo +" is "+sum);
            rowNo++;
            sum=0;
        }
    }
    public static void transposeOfMatrix(int [][] arr){
        int [][] brr = new int[arr[0].length][arr.length];
        for(int i = 0; i<arr[0].length; i++){
            for(int j = 0; j<arr.length; j++){
                brr[i][j] = arr[j][i];
            }

        }
        System.out.println("Transpose of Matrix would be: ");
        displayMatrix(brr);
    }

}
