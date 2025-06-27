package ch01.firstrefactoring;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("Robert");
        robot.order(Robot.WALK);
        robot.order(Robot.STOP);
        robot.order(Robot.JUMP);
    }
}
