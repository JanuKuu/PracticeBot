package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TimedRobot;
import jaci.pathfinder.Pathfinder;
import jaci.pathfinder.PathfinderFRC;
import jaci.pathfinder.Trajectory;
import jaci.pathfinder.followers.EncoderFollower;

public class MotionProfiler {
    
    // double l = left.calculate(encoder_position_left);
    // double r = right.calculate(encoder_position_right);
    
    // double gyro_heading = ... your gyro code here ...    // Assuming the gyro is giving a value in degrees
    // double desired_heading = Pathfinder.r2d(left.getHeading());  // Should also be in degrees
    
    // double angleDifference = Pathfinder.boundHalfDegrees(desired_heading - gyro_heading);
    // double turn = 0.8 * (-1.0/80.0) * angleDifference;
    
    // setLeftMotors(l + turn);
    // setRightMotors(r - turn);
    
}