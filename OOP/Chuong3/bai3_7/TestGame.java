package bai3_7;

public class TestGame {
    public static void main(String[] args) {
        Ball ball = new Ball(10, 10, 0);
        System.out.println("Initial Ball: " + ball);
        Player player1 = new Player(7, 5, 5);
        System.out.println(player1);
        player1.kick(ball);
        System.out.println("Ball after kick: " + ball);
        player1.move(3, 3);
        System.out.println(player1);
        player1.kick(ball);
        System.out.println("Ball after second kick: " + ball);
    }
}
