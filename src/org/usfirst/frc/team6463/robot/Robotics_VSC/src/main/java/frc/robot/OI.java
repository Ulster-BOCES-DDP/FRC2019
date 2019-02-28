/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;

public class OI {
	public static final double JOY_DEADZONE = 0.05;
	
	public final Joystick JOY = new Joystick(RobotMap.JOYSTICK.value);
	
	
	public double getJoyX() {
		double raw = JOY.getX();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public double getJoyY() {
		double raw = JOY.getY();
		return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
	}
	public boolean fineControl(){
		boolean pressed = JOY.getRawButton(2);
		return pressed;
	}
	public boolean down() {
		boolean sevenTrue = JOY.getRawButton(7);
		return sevenTrue;
	}
	public boolean lift() {
		boolean threeTrue = JOY.getRawButton(3);
		return threeTrue;
	}
	public boolean lower() {
		boolean fourTrue = JOY.getRawButton(4);
		return fourTrue;
	}
	public boolean triggered(){
		boolean triggered=JOY.getTrigger();
		return triggered;
	}
	public boolean dejavu(){
		boolean pressed = JOY.getRawButton(5);
		return pressed;
	}

	/*public boolean rest() {
		boolean restTrue = JOY.getRawButton(7);
		return restTrue;
	}
	public boolean posOne() {
		boolean eightTrue = JOY.getRawButton(8);
		return eightTrue;
	}
	public boolean posTwo() {
		boolean nineTrue = JOY.getRawButton(9);
		return nineTrue;
	}
	public boolean posThree() {
		boolean tenTrue = JOY.getRawButton(10);
		return tenTrue;
	}*/
	
	
	public OI() {
		
	}
}
