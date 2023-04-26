package game1;

public class Point {

    public int x; //class level decleration
    public int y;


    // private int[]xy= new int[2];

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public void setY(int yy) {
        this.y = yy;
        // xy[1]=yy;
    }

    public void setX(int x) {
        this.x = x;
        // xy[0]=x;
    }

    public void print() {
        String p = "[" + x + "," + x + "]";
        System.out.println(p);
    }

    public double distO() {
        double d = Math.sqrt(x * x + y * y);
        return d;
    }

    @Override
    public boolean equals(Object obj) {
        int x = ((Point) obj).x;
        int y = ((Point) obj).y;

        if (this.x == x && this.y == y)
            return true;
        else
            return false;
        //return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    // fs2.distP(fs);
    public double distP(Point p2) {
        int xo = p2.x - x;
        int yo = p2.y - y;
        return Math.sqrt(xo * xo + yo * yo);

    }

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int Y) {
        this();
        this.x = x;
        y = Y;
    }

    public Point(int x) {
        this.x = x;
        y = 0;
    }

    public String toString() {
        String p = "[" + x + "," + y + "]";
        return p;
    }

}