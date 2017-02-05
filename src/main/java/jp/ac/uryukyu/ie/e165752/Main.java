package jp.ac.uryukyu.ie.e165752;

/**
 * Created by komineakina on 2017/02/05.
 */
public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.print();

        System.out.println("Player1のターン");
        Player1 player1 = new Player1();
        int[] piece_player1 = player1.getPiece_place();
        board.putBoard(piece_player1,1);
        board.print();

        System.out.println("Player2のターン");
        Player1 player2 = new Player1();
        int[] piece_player2 = player2.getPiece_place();
        board.putBoard(piece_player2,2);
        board.print();

    }
}
