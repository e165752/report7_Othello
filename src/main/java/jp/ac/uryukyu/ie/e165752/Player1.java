package jp.ac.uryukyu.ie.e165752;
import java.util.Scanner;

/**
 * Created by komineakina on 2017/02/05.
 */

public class Player1 {


    private int piece_place[] = put();

    public int[] getPiece_place(){
        return piece_place;
    }

    public int [] put(){

        System.out.println("何行目に駒を置くか指定して下さい。(0~7の値)");
        Scanner scanner = new Scanner(System.in); // System.in(標準入力) をスキャンしたスキャナを用意します。
        int player1_line = scanner.nextInt();

        System.out.println("何列目に駒を置くか指定して下さい。(0~7の値)");
        int player1_row = scanner.nextInt();
        System.out.println("行："+ player1_line + "," + "列: "+ player1_row);
        System.out.println("\n");

        int piece_place[]= new int[2];
        piece_place[0] = player1_line;
        piece_place[1] = player1_row;

        for(int n = 0; n<2; n++){
            System.out.println("piece = "+piece_place[n]);
        }
        return piece_place;

    }
}
