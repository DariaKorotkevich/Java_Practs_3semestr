package laba2;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(15, 15);
        System.out.println(b1);
        b1.move(7, 5);
        b1.setXYSpeed(25);
        System.out.println(b1);

    }
}