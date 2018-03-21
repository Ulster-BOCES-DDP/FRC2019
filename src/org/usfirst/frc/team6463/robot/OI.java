/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6463.robot;


import org.usfirst.frc.team6463.robot.commands.TeleopArmLower_Commands;
import org.usfirst.frc.team6463.robot.commands.TeleopArmRaise_Commands;
import org.usfirst.frc.team6463.robot.commands.TeleopClawBoxIn_Commands;
import org.usfirst.frc.team6463.robot.commands.TeleopClawBoxOut_Commands;
import org.usfirst.frc.team6463.robot.commands.TeleopWinchUp_Commands;
import org.usfirst.frc.team6463.robot.commands.TeleopWinchDown_Commands;
import org.usfirst.frc.team6463.robot.commands.TeleopWristUp_Commands;
import org.usfirst.frc.team6463.robot.commands.TeleopWristDown_Commands;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static final int JOYSTICK_PORT = 0;
	public static final int LEFT_Y_AXIS = 1;
	public static final int RIGHT_Y_AXIS = 3;
	
	
	private Joystick joystick = new Joystick(JOYSTICK_PORT);
	
	public Joystick getJoystick() {
		return joystick;
	}
	
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	
	//public static final double JOY_DEADZONE = 0.05;
	
	//public final Joystick LEFT_JOY = new Joystick(RobotMap.LEFT_JOYSTICK.value);
	//public final Joystick RIGHT_JOY = new Joystick(RobotMap.RIGHT_JOYSTICK.value);
	
	//public double getLeftJoyX() {
		//double raw = LEFT_JOY.getX();
		//return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
		
	//}
	//public double getLeftJoyY() {
		//double raw = LEFT_JOY.getY();
		//return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
		
	//}
	//public double getRightJoyX() {
		//double raw = RIGHT_JOY.getX();
		//return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
		
	//}
	//public double getRightJoyY() {
		//double raw = RIGHT_JOY.getY();
		//return Math.abs(raw) < JOY_DEADZONE ? 0.0 : raw;
		
	//}
	
	
	
	public OI() {
		JoystickButton BoxIn = new JoystickButton(joystick, 5);
		JoystickButton BoxOut = new JoystickButton(joystick, 8);
		
		BoxIn.whileHeld((new TeleopClawBoxIn_Commands()));
		
		BoxOut.whileHeld(new TeleopClawBoxOut_Commands());
		
		JoystickButton RaiseArm = new JoystickButton(joystick, 5);
		JoystickButton LowerArm = new JoystickButton(joystick, 7);
		
		RaiseArm.whileHeld(new TeleopArmRaise_Commands());
		
		LowerArm.whileHeld(new TeleopArmLower_Commands());
		
		JoystickButton RaiseWinch = new JoystickButton(joystick, 1);
		JoystickButton LowerWinch = new JoystickButton(joystick, 3);
		
		RaiseWinch.whileHeld(new TeleopWinchUp_Commands());
		LowerWinch.whileHeld(new TeleopWinchDown_Commands());
		
		JoystickButton RaiseWrist = new JoystickButton(joystick, 4);
		JoystickButton LowerWrist = new JoystickButton(joystick, 2);
		
		RaiseWrist.whileHeld(new TeleopWristUp_Commands());
		LowerWrist.whileHeld(new TeleopWristDown_Commands());
	}
	
	public void debug(){
		System.out.println("Debug");
		System.out.println(joystick.getRawButton(5));
		
	}
}
