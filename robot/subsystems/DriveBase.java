package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.*;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;


import edu.wpi.first.wpilibj.*;

public class DriveBase extends Subsystem {
private Spark leftFrontMotor;
private Spark rightFrontMotor;
private Spark leftBackMotor;
private Spark rightBackMotor;
	public DriveBase() {
		leftFrontMotor = new Spark(RobotMap.LEFT_MOTOR_FRONT.value);
		rightFrontMotor = new Spark(RobotMap.RIGHT_MOTOR_FRONT.value);
		leftBackMotor = new Spark(RobotMap.LEFT_MOTOR_BACK.value);
		rightBackMotor = new Spark(RobotMap.RIGHT_MOTOR_BACK.value);
	}

	public void setRaw(double leftFrontValue, double rightFrontValue,double leftBackValue, double rightBackValue) {
		leftFrontMotor.set(-leftFrontValue);
		rightFrontMotor.set(rightFrontValue);
		leftBackMotor.set(-leftBackValue);
		rightBackMotor.set(rightFrontValue);
		
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());
	}

}