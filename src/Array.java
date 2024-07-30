import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // 1D Array
       /*  Scanner sc =new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];
        
        //System.out.println(marks[2]);
        // input
        for(int i=0; i<size; i++){
            number[i]= sc.nextInt();
        }

        int x= sc.nextInt();
        // output
        for(int i=0; i<number.length; i++){
            if(number[i] == x){
                System.out.println("x is found at index :"+i);
            }
        }*/


         // 2D Array

         Scanner sc =new Scanner(System.in);
         int rows =sc.nextInt();
         int columns = sc.nextInt();

         int [] [] number = new int [rows][columns];

         //input
         //row
         for(int i=0; i<rows; i++){

            // column
            for (int j=0; j<columns; j++){
                number [i][j] = sc.nextInt();
            }
         }

         int x= sc.nextInt();

         // output
         for(int i=0; i<rows;i++){
            for(int j=0;j<columns; j++){
                // compare with x
                if(number[i][j] ==x)
                System.out.println("x found at location (" + i +", " + j + ")");
            }
    
         }
    }
    
}
