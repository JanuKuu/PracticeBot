package frc.robot.Subsystems;

public class RobotClimb {

    private final double tiltKp = 0.02;
    private final double minArmControl = 0.2;
    private double robotTilt; /* robotTilt = Robot.navX.tilt */

    public double controlArm() {
        return minArmControl + (robotTilt * tiltKp);
    }

}