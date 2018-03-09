package org.usfirst.frc.team6463.robot.subsystems;

import org.usfirst.frc.team6463.robot.RobotMap;
import org.usfirst.frc.team6463.robot.commands.TankDrive;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivebase extends Subsystem {
	private Spark LeftMotor;
	private Spark RightMotor;

	public Drivebase() {
		LeftMotor = new Spark(RobotMap.LEFT_MOTOR.value);
		RightMotor = new Spark(RobotMap.RIGHT_MOTOR.value);
	}

	public void setRaw(double leftvalue, double rightvalue) {
		LeftMotor.set(leftvalue);
		RightMotor.set(rightvalue);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new TankDrive());

	}

}
