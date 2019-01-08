import java.util.Arrays;

public class ChessBoard {
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
        for( int i=0;i<8 ;i++ )
        {
            for( int j=0; j<8 ;j++)
            {
                System.out.print(chessBoardprint[i][j]);
            }
            System.out.println("\n");
        }
     //   System.out.println(Arrays.deepToString(chessBoard.printChessBoard()));
    }
}
