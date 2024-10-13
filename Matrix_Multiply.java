// Write a java program to print multiplication of Matrix. 
 
 import java.util.*;
 class Matrix_Multiply{

    public static void main(String[] args) {
         System.out.println("enter no of rows in matrix1");
         Scanner sc = new Scanner(System.in);
         int row1 = sc.nextInt();
         System.out.println("enter the no of column in matrix1");
         int colm1 = sc.nextInt();

         int matrix1[][] = new int[row1][colm1];
         System.out.println("enter the numbers in matrix1");
         for(int i=0;i<row1;i++){
            for(int k=0;k<colm1;k++){
                System.out.print("element at ["+i+"]["+k+"] : ");
                matrix1[i][k] = sc.nextInt();
            }
         }

         for(int i=0;i<row1;i++){
            for(int k=0;k<colm1;k++){
                System.out.print(matrix1[i][k]+" ");
            }
            System.out.println();
         }

        
         System.out.println("enter the no of rows in matrix2");
         int row2= sc.nextInt();
         System.out.println("enter the no of colm2");
         int colm2= sc.nextInt();
         System.out.println("enter the no in matrix2");

          int matrix2[][] = new int[row2][colm2];

          for(int k=0;k<row2;k++){
            for(int j=0;j<colm2;j++){
                System.out.print("elements at ["+k+"]["+ j+"] : ");
                matrix2[k][j]= sc.nextInt();
            }
          }

          for(int k=0;k<row2;k++){
            for(int j=0;j<colm2;j++){
                System.out.print(matrix2[k][j]+" ");
            }
            System.out.println();
          }
           int resultMatrix[][] = new int[row1][colm2];

          for(int i=0;i<row1;i++){
            for(int j=0;j<colm2;j++){
                resultMatrix[i][j]=0;
                for(int k=0; k<colm1;k++){
                    resultMatrix[i][j] = resultMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
          }

          for(int i=0;i<row1;i++){
            for(int j=0 ; j<colm2;j++){
                System.out.print(resultMatrix[i][j]+ " ");

            }
            System.out.println();
          }
          sc.close();

    }
 }