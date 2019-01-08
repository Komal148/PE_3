import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixAddition {

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
        //System.out.println(Arrays.deepToString(resultMatrix));
        return resultMatrix;
    }

    public static void main( String args[] )
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
    }
}
