package game1;

import java.util.Arrays;

public class Board {
    char[][] board=new char[20][30];
    public void setBoard(){

        for (int i=0;i<20;i++){
            for (int j=0;j<30;j++){
                if (i==0 || i==19|| j==0 || j==29){
                    board[i][j]='*'; //boundaries

                } else if (i==2 && j>2 && j<26)  {
                    board[i][j]='*';

                } else if (j==20 && i>10 && i<15) {

                    board[i][j]='*';
                }else if (j==8 && i>2&& i<7) {

                    board[i][j]='*';
                }
                else if (i==5 && j>1 && j<14) {

                    board[i][j]='*';
                }
                else if (i==11 && j>10 && j<27) {

                    board[i][j]='*';
                }
                else if (j==5 && i>7 && i<18) {

                    board[i][j]='*';
                }else if (j==10 && i>10 && i<17) {

                    board[i][j]='*';
                }else if (j==26 && i>1 && i<19) {

                    board[i][j]='*';
                }else if (i==17 && j>4 && j<14) {

                    board[i][j]='*';
                }else if (j==18 && i>6 && i<12) {

                    board[i][j]='*';
                }else if (j==23 && i>3 && i<18) {

                    board[i][j]='*';
                }
                else if (i==8 && j>7 && j<15) {

                    board[i][j]='*';}
                else if (j==16 && i>21 && i<27) {

                    board[i][j]='*';
                }
                else{
                    board[i][j]='_'; //eatables
                }


            }
        }

    }
    public void draw(){
        for (int i=0;i<20;i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }}
    public static void main(String[] args) {
        Board b=new Board();
        b.setBoard();
        b.draw();

    }
}

