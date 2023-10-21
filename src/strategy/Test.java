package strategy;

public class Test {
    public static void main(String[] args) {
        Behavior normal = new BehaviorNormal();
        Behavior defensive = new BehaviorDefensive();
        Behavior aggressive = new BehaviorAggressive();

        Robot robot = new Robot();
        robot.setBehavior(normal);
        robot.move();
        robot.move();

        robot.setBehavior(aggressive);
        robot.move();
        robot.move();

        robot.setBehavior(defensive);
        robot.move();
        robot.move();

    }
}