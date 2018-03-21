package org.usfirst.frc.team6463.robot.commands;

import org.usfirst.frc.team6463.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class TankDrivewithJoystick extends Command {
	private Joystick joystick;
	private int leftSpeedAxis = 1;
	private int rightSpeedAxis = 3;
	
	public TankDrivewithJoystick(Joystick joystick, int leftSpeedAxis, int rightSpeedAxis) {
		super("Tank Drive with Joystick");
		requires(Robot.drivebase);
		
		this.joystick = joystick;
		this.leftSpeedAxis = leftSpeedAxis;
		this.rightSpeedAxis = rightSpeedAxis;
	}
	
	@Override
	protected void execute() {
		double leftSpeed = joystick.getRawAxis(leftSpeedAxis);
		double rightSpeed = joystick.getRawAxis(rightSpeedAxis);
		
		Robot.drivebase.tankDrive(leftSpeed, rightSpeed);
	}
	
	@Override
	protected boolean isFinished() {
		return false;
	}
}
