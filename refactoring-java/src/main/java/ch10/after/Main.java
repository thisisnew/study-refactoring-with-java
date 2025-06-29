package ch10.after;

import ch10.before.Robot;

public class Main {
    public static void main(String[] args) {
        ch10.before.Robot robot = new Robot("Andrew");
        System.out.println(robot);

        robot.execute("forward right forward");
        System.out.println(robot);

        robot.execute("left backward left forward");
        System.out.println(robot);

        robot.execute("right forward forward farvard");
        System.out.println(robot);
    }
}
