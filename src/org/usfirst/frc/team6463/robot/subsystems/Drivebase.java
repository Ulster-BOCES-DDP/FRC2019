package org.usfirst.frc.team6463.robot.subsystems;

import org.usfirst.frc.team6463.robot.OI;
import org.usfirst.frc.team6463.robot.Robot;
import org.usfirst.frc.team6463.robot.RobotMap;
import org.usfirst.frc.team6463.robot.commands.TankDrivewithJoystick;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivebase extends Subsystem {
	
	private Spark frontLeftMotor = new Spark(RobotMap.FRONT_LEFT_MOTOR_PORT);
	private Spark rearLeftMotor = new Spark(RobotMap.REAR_LEFT_MOTOR_PORT);
	private SpeedControllerGroup leftSide = new SpeedControllerGroup(frontLeftMotor, rearLeftMotor);
	
	private Spark frontRightMotor = new Spark(RobotMap.FRONT_RIGHT_MOTOR_PORT);
	private Spark rearRightMotor = new Spark(RobotMap.REAR_RIGHT_MOTOR_PORT);
	private SpeedControllerGroup rightSide = new SpeedControllerGroup(frontRightMotor, rearRightMotor);

//	
//	private DifferentialDrive drivebase = new DifferentialDrive(leftSide, rightSide);
	
	

	public Drivebase() {
		super("Drivebase");
	}

	public void tankDrive(double leftSpeed, double rightSpeed) {
		System.out.println("*************Running Tank Drive");
//		drivebase.tankDrive(leftSpeed, rightSpeed);
		leftSide.set(-leftSpeed);
		rightSide.set(rightSpeed);
	}
	

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrivewithJoystick(Robot.oi.getJoystick(),OI.LEFT_Y_AXIS, OI.RIGHT_Y_AXIS));

	}

}
