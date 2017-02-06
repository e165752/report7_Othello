package jp.ac.uryukyu.ie.e165752;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by komineakina on 2017/02/06.
 */
public class BoardTest {
    @Test
    public void canPut() throws Exception {
        Board board = new Board();

        int piece_player1 []= new int[2];
        piece_player1[0] = 3;
        piece_player1[1] = 4; //初期状態から駒がある場所

        //falseであるかをテスト
        assertFalse(board.canPut(piece_player1,1)); // 駒がある場所に駒が置けるかどうかのテスト

    }

}