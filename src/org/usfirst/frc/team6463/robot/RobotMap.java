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
public enum RobotMap {
	//PWM Motor Mappings
	LEFT_MOTOR(0), 
	RIGHT_MOTOR(1),
	//Control Mappings
	LEFT_JOYSTICK(0),
	RIGHT_JOYSTICK(1);
	public final int value;

	RobotMap(int value) {
		this.value = value;
	}
}
