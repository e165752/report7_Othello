package jp.ac.uryukyu.ie.e165752;


/**
 * Created by komineakina on 2017/02/05.
 */
public class Board {

    private int[][] board = new int[8][8]; //二次元配列でボードを表現する

    private static final int EMPTY = 0; //空
    private final static int SQUARE_MINE = 1;
    private final static int SQUARE_OPPONENT = 2;

    /* ボードを初期化する */
    public Board() {
        for (int row = 0; row < 8; row++) {
            for (int line = 0; line < 8; line++) {
                board[line][row] = EMPTY;
            }
        }

        board[3][3] = SQUARE_MINE;
        board[3][4] = SQUARE_OPPONENT;
        board[4][3] = SQUARE_OPPONENT;
        board[4][4] = SQUARE_MINE;

    }

    /* ボードを表示する */
    public void print() {

        for (int i = 0; i < 8; i++) {
            System.out.print(i + "|");
        }
        System.out.print("\n");

        for (int line = 0; line < 8; line++) {
            for (int row = 0; row < 8; row++) {
                if (row == 7) {
                    System.out.println(board[line][row] + " ");
                } else {
                    System.out.print(board[line][row] + " ");
                }
            }
        }
        System.out.println("\n");
    }

    public void putBoard(int piece_line, int piece_row, int turn, boolean canput) {

        if (canput == true) {
            board[piece_line][piece_row] = turn;
        }
    }


    public boolean canPut(int[] a, int turn) {

        boolean canput = true;

        int piece_line = a[0];
        int piece_row = a[1];
        System.out.print(a[0]);
        System.out.println(a[1]);

        if (board[piece_line][piece_row] != 0 || piece_line > 7 || piece_row > 7) {//そこに駒がある、またはボードからはみ出すなら
            canput = false;
        }
        putBoard(piece_line, piece_row, turn, canput);

        return canput;
    }
}