package com.company;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(0,0, Direction.DOWN);
        moveRobot(robot, -10, 20);



    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (( robot.getX()!= toX) | ( robot.getY()!= toY))
        {
            if (toX > robot.getX())
            {
                while (robot.getDirection()!= Direction.RIGHT)
                {
                    robot.turnRight();
                }
                while (robot.getX()!= toX) {
                    robot.stepForward();
                }
                //System.out.println(robot.getX());
            }
            else if (toX < robot.getX())
            {
                while (robot.getDirection () != Direction.LEFT)
                {
                    robot.turnRight();
                }
                while (robot.getX()!= toX) {
                    robot.stepForward();
                }
                //System.out.println(robot.getX());
            }
            if (toY > robot.getY())
            {
                while (robot.getDirection () != Direction.UP)
                {
                    robot.turnRight();
                }
                while (robot.getY()!= toY) {
                    robot.stepForward();
                }
                //System.out.println(robot.getY());
            }
            if (toY < robot.getY())
            {
                while (robot.getDirection () != Direction.DOWN)
                {
                    robot.turnRight();
                }

                while (robot.getY()!= toY) {
                    robot.stepForward();
                }
                //System.out.println(robot.getY());
            }
        }
    }
}





