package jp.ac.uryukyu.ie.e165752;

/**
 * Created by komineakina on 2017/02/05.
 */
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.print();
        Player1 player1 = new Player1();


        int[] piece_player1 = player1.getPiece_place();
        System.out.println("Player1のターン");
        board.putBoard(piece_player1,1);
        board.print();

    }
}
