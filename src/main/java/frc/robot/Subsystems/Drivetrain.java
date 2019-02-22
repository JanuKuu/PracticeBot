package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Drivetrain {    
    private CANSparkMax leftDrive1;
    private CANSparkMax leftDrive2;
    private CANSparkMax leftDrive3;
    private CANSparkMax rightDrive1;
    private CANSparkMax rightDrive2;
    private CANSparkMax rightDrive3;

    private DifferentialDrive sigmaDrive;

    public Drivetrain() {
        leftDrive1 = new CANSparkMax(1, MotorType.kBrushless);
        leftDrive2 = new CANSparkMax(2, MotorType.kBrushless);
        leftDrive3 = new CANSparkMax(3, MotorType.kBrushless);
        rightDrive1 = new CANSparkMax(4, MotorType.kBrushless);
        rightDrive2 = new CANSparkMax(5, MotorType.kBrushless);
        rightDrive3 = new CANSparkMax(6, MotorType.kBrushless);

        leftDrive2.follow(leftDrive1);
        leftDrive3.follow(leftDrive1);
        rightDrive2.follow(rightDrive1);
        rightDrive3.follow(rightDrive1);
    
        sigmaDrive = new DifferentialDrive(leftDrive1, rightDrive1);
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        sigmaDrive.tankDrive(leftSpeed, rightSpeed);
    }
}