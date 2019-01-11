/**
 *  a program to compute the addition of two matrix, Read the number of rows
 *  and columns as input, also the values of each matrix
 *   Output:
 *   Input number of rows of matrix: 3
 *   Input number of columns of matrix: 2
 *   Input elements of first matrix: 1 2 3 4 5 6
 *   Input the elements of second matrix: 9 8 7 6 5 4
 *   Sum of the matrices:-
 *                      10        10
 *                      10        10
 *                      10        10
 */
package com.stackroute.PE3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixAddition {

    /*
    This method will compute the matrix addition.
     */
    public int[][] addTwoMatrix(int[][] firstMatrix ,int[][] secondMatrix,int rows,int columns)
    {
        int resultMatrix[][] = new int[rows][columns];
        for( int i=0;i<rows ;i++ )
        {
            for(int j=0;j<columns;j++)
            {
                resultMatrix[i][j]=firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return resultMatrix;
    }

    /*public static void main( String args[] )
    {
        int rows;
        int columns;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter rows and columns:");
        if( ! in.hasNextInt())
        {
            System.out.println("Kindly enter Integer value");
        }
        rows=in.nextInt();
        if( ! in.hasNextInt())
        {
            System.out.println("Kindly enter Integer value");
        }
        columns=in.nextInt();
        int[][] firstMatrix=new int[rows][columns];
        int[][] secondMatrix=new int[rows][columns];
        System.out.println("Enter First Matrix:");
        for( int i=0;i<rows ;i++ )
        {
            for( int j=0; j<columns ;j++ )
            {
               try
               {
                   firstMatrix[i][j]=in.nextInt();
               }
               catch (InputMismatchException e)
               {
                   j--;
                   System.out.println("Invalid Input");
               }
            }
        }
        System.out.println("Enter Second Matrix:");
        for( int i=0;i<rows ;i++ )
        {
            for( int j=0; j<columns ;j++ )
            {
                try
                {
                    secondMatrix[i][j]=in.nextInt();
                }
                catch (InputMismatchException e)
                {
                    j--;
                    System.out.println("Invalid Input");
                }
            }
        }

        MatrixAddition matrixAddition=new MatrixAddition();
        System.out.println(Arrays.deepToString(matrixAddition.addTwoMatrix(firstMatrix,secondMatrix,rows,columns)));
    }*/
}
