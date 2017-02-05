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
            for (int column = 0; column < 8; column++) {
                board[row][column] = EMPTY;
            }
        }

        board[3][3] = SQUARE_MINE;
        board[3][4] = SQUARE_OPPONENT;
        board[4][3] = SQUARE_MINE;
        board[4][4] = SQUARE_OPPONENT;

    }

    /* ボードを表示する */
    public void print() {

        for(int i = 0; i < 8; i++){
            System.out.print(i + "|");
        }
        System.out.print("\n");

        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if(column == 7){
                    System.out.println(board[row][column] + " ");
                }else{
                    System.out.print(board[row][column] + " ");
                }
            }
        }
    }
}