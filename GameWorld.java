package game1;

public class GameWorld {
    public boolean GameEnd(boolean temp,Board b1){
        for (int i=0;i<20;i++){
            for (int j=0;j<30;j++){
                if (b1.board[i][j]!=' ' || b1.board[i][j]!='*'){
                    return temp;
                }

            }
        }
        temp=false;
        return temp;
    }
    /*public char EnemyMove(Board b1,Enemy e,char s){
         if ((b1.board[e.PosE.y][e.PosE.x]==' ')){
             return ' ';

        }
         return '_';

    }*/
    public void play() {

        Enemy e1=new Enemy(28,18);
        Enemy e2=new Enemy(1,18);
        PacMan p=new PacMan();
        char state='_';
        char state2='_';

        Board b1=new Board();
        b1.setBoard();
        b1.board[p.PosPM.y][p.PosPM.x]='P';
        b1.board[e1.PosE.y][e1.PosE.x]='E';
        b1.board[e2.PosE.y][e2.PosE.x]='E';
        b1.draw();
        boolean temp=true;
        while (temp){
            this.GameEnd(temp,b1);

            b1.board[p.PosPM.y][p.PosPM.x]='P';
            b1.board[e1.PosE.y][e1.PosE.x]='E';
            b1.board[e2.PosE.y][e2.PosE.x]='E';

            b1.draw();
            if(p.PosPM.distP(e1.PosE)==0 || p.PosPM.distP(e2.PosE)==0){
                System.out.println("Enemy ate PacMan. You lose.");
                System.exit(0);

            }

            b1.board[p.PosPM.y][p.PosPM.x]=' ';
            b1.board[e1.PosE.y][e1.PosE.x]=state;
            b1.board[e2.PosE.y][e2.PosE.x]=state2;
            p.move();


            if (b1.board[p.PosPM.y][p.PosPM.x]=='*'){
                System.out.println("can't move there it's a wall");
                p.revert();
            }
            else {b1.board[p.PosPM.y][p.PosPM.x]='P';}
            // Point prev_PosE1= e1.PosE;
            // Point prev_PosE2=e2.PosE;
            e1.move();
            if (b1.board[e1.PosE.y][e1.PosE.x]=='*'){
                e1.revert();
            } else if ((b1.board[e1.PosE.y][e1.PosE.x]==' ')) {
                state=' ';
                b1.board[e1.PosE.y][e1.PosE.x]='E';
            }

            else if (b1.board[e1.PosE.y][e1.PosE.x]=='_') {
                state='_';
                b1.board[e1.PosE.y][e1.PosE.x]='E';}

            e2.move();
            if (b1.board[e2.PosE.y][e2.PosE.x]=='*'){
                e2.revert();
            }
            else if ((b1.board[e2.PosE.y][e2.PosE.x]==' ')) {
                state2=' ';
                b1.board[e2.PosE.y][e2.PosE.x]='E';
            }

            else if (b1.board[e2.PosE.y][e2.PosE.x]=='_') {
                state2='_';
                b1.board[e2.PosE.y][e2.PosE.x]='E';}




        }}

    public static void main(String[] args) {
        GameWorld g1=new GameWorld();
        g1.play();
    }

}
