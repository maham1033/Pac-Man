package game1;

import java.awt.*;
import java.util.Random;

public class Enemy {
    // private int x=0;
    // private int y=0;
    public Point PosE =new Point();
    int direction;
    public Enemy(int x, int y){
        this.PosE.x=x;
        this.PosE.y=y;    }
    public Point move(){
        Random random = new Random();
        direction= random.nextInt(4)+1;
        if (direction==1) {
            PosE.x += 1;}
        else if (direction == 2) {
            PosE.x -= 1;
            if (PosE.x<0){
                System.out.println("enemy is already at the boundary");
                PosE.x+=1;
            }}
        else if (direction==3){
            PosE.y+=1;
        }
        else if (direction==4) {
            PosE.y-=1;
            if (PosE.y<0){
                System.out.println("enemy is already at the boundary");
                PosE.y+=1;
            }
        }
        System.out.println(PosE);
        return PosE;
    }
    public Point revert(){
        if (direction==1) {
            PosE.x -= 1;
            if (PosE.x<0){
                System.out.println("enemy is already at the boundary");
                PosE.x+=1;
            }}
        else if (direction == 2) {
            PosE.x += 1;
        }
        else if (direction==3){
            PosE.y-=1;
            if (PosE.y<0){
                System.out.println("enemy is already at the boundary");
                PosE.y+=1;
            }
        }
        else if (direction==4) {
            PosE.y+=1;

        }
        return PosE;

    }
}
