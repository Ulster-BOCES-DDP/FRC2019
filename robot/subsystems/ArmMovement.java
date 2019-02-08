package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.*;

import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.ArmDrive;


import edu.wpi.first.wpilibj.*;

public class ArmMovement extends Subsystem {
private Spark leftArmMotor;
private Spark rightArmMotor;
private double setpoint=0;
private boolean stoppable=false;
private double forward=0;
private double turn=0;

	public ArmMovement(/*double setpoint, boolean stoppable*/) {
		//this.setpoint = setpoint;
		//this.stoppable = stoppable;
		
		leftArmMotor = new Spark(RobotMap.ARM_MOTOR_LEFT.value);
		rightArmMotor = new Spark(RobotMap.ARM_MOTOR_RIGHT.value);
	}
	public void setRaw(double leftFrontValue, double rightFrontValue) {
		leftArmMotor.set(-leftFrontValue);
		rightArmMotor.set(rightFrontValue);
		
	}

	private void requires(DriveEncoders armEncoders) {
		// TODO Auto-generated method stub
		
	}



	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ArmDrive());

	}

}