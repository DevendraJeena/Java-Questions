// Write a java program to Compute the Sum of the Principal and Secondary Diagonals elements of a Matrix

import java.util.*;
public class SumOfDiagonalOfMatrix {
 
    public static void main(String[] args) {
        
        System.out.println("enter the number of row/column");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int matrix[][] = new int[size][size];
        System.out.println("enter the no. in matrix");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print("elements at ["+i+"]["+j+"] :");
                matrix[i][j]=sc.nextInt();
            }
        }

        int sumOfPrincipalDiagonal = 0;
        int sumOfSecondaryDiagonal = 0;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                    sumOfPrincipalDiagonal += matrix[i][j] ;
                }
                if(i+j==size-1){
                    sumOfSecondaryDiagonal += matrix[i][j];
                }
                
            }
        }
        System.out.println("the sum of principal diagonal : "+ sumOfPrincipalDiagonal);
        System.out.println("the sum of secondary diagonal : "+ sumOfSecondaryDiagonal);

            sc.close();

    }
    

}
