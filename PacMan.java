package game1;

import java.awt.*;
import java.util.Scanner;

public class PacMan {
    // private int x = 0;
    //private int y = 0;
    String direction="";
    public Point PosPM = new Point(1,1);

    public Point move() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter direction to move. ");
        System.out.println("r : right \n"+"l : left\n" +"u : up\n"+"d : down");
        direction = sc.next();

        if (direction.equals("r")) {
            PosPM.x += 1;
        } else if (direction.equals("l")) {
            PosPM.x -= 1;
            if (PosPM.x<0) {
                System.out.println("enemy is already at the boundary");
                PosPM.x += 1;
            }
        } else if (direction.equals("d")) {
            PosPM.y += 1;


        } else if (direction.equals("u")) {
            PosPM.y -= 1;
            if (PosPM.y<0) {
                System.out.println("enemy is already at the boundary");
                PosPM.y += 1;
            }
        }
        System.out.println(PosPM);
        return PosPM;

    }
    public Point revert(){
        if (direction.equals("r")) {
            PosPM.x -= 1;
            if (PosPM.x<0) {
                System.out.println("pacman is already at the boundary");
                PosPM.x += 1;
            }
        } else if (direction.equals("l")) {
            PosPM.x += 1;

        } else if (direction.equals("d")) {
            PosPM.y -= 1;
            if (PosPM.y<0) {
                System.out.println("pacman is already at the boundary");
                PosPM.y += 1;
            }


        } else if (direction.equals("u")) {
            PosPM.y += 1;

        }
        return PosPM;

    }}

