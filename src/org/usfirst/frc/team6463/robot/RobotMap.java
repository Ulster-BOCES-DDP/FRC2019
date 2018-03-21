/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6463.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//PWM Motor Mappings
	public static final int FRONT_LEFT_MOTOR_PORT = 0;
	public static final int REAR_LEFT_MOTOR_PORT = 1;
	public static final int FRONT_RIGHT_MOTOR_PORT = 2;
	public static final int REAR_RIGHT_MOTOR_PORT = 3;
	
	//PWM claw motor mappings
	public static final int CLAW_RIGHT = 4;
	public static final int CLAW_LEFT = 5;
	
	//Arm wrist motor
	public static final int WRIST_REDLINE = 6;
	
	//ARM TOP motor
	public static final int ARM_LEFT = 7;
	public static final int ARM_RIGHT = 8;
	
	// Winch Motor
	public static final int WINCH = 9;
	
	public final int value;

	RobotMap(int value) {
		this.value = value;
	}
}
