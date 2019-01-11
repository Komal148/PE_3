/**
 * a program to create a ChessBoard pattern with the help of multidimensional
 * array, where WWrepresents white color and BB represents Black color.
 *  Output:
 *  My Chess Board
 *       WW|BB|WW|BB|WW|BB|WW|BB|
 *       BB|WW|BB|WW|BB|WW|BB|WW|
 *       WW|BB|WW|BB|WW|BB|WW|BB|
 *       BB|WW|BB|WW|BB|WW|BB|WW|
 *       WW|BB|WW|BB|WW|BB|WW|BB|
 *       BB|WW|BB|WW|BB|WW|BB|WW|
 *       WW|BB|WW|BB|WW|BB|WW|BB|
 *       BB|WW|BB|WW|BB|WW|BB|WW|
 */
package com.stackroute.PE3;

public class ChessBoard {

    /*
    This method will print the chessBoard
     */
    public void chessBoardprinting(String[][] chessBoardprint)
    {
        for( int i=0;i<8 ;i++ )
        {
            for( int j=0; j<8 ;j++)
            {
                System.out.print(chessBoardprint[i][j]);
            }
            System.out.println("\n");
        }
    }

    /*
    This method will assign the String values to chess Board
     */
    public String[][] printChessBoard()
    {
        String[][] chessBoard=new String[8][8];
        int flag=0;
        for( int i=0;i<8 ; i++ )
        {
            for( int j=0 ;j<8 ; j++)
            {
                chessBoard[i][j]="";
                if( flag == 0 )
                {
                    chessBoard[i][j]+="WW|";
                    flag=1;
                }
                else
                {
                    chessBoard[i][j]+="BB|";
                    flag=0;
                }
            }
        }
        return chessBoard;
    }
    public static void main(String[] args)
    {
        ChessBoard chessBoard=new ChessBoard();
        String[][] chessBoardprint=chessBoard.printChessBoard();
        chessBoard.chessBoardprinting(chessBoardprint);

    }
}
