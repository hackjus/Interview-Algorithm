package Concurrent;

import java.util.Scanner;

class Point {
    double x;
    double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

}

public class Main8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Point starPoint = new Point(0, 0);
        starPoint.setX(in.nextDouble());
        starPoint.setY(in.nextDouble());
        for (int i = 0; i < 3; i++) {
            String s = in.nextLine();
        }
        System.out.println("Yes");
    }

}
