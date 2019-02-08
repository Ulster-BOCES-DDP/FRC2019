/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6463.robot;


public enum RobotMap {
	
	//PWM MOTOR MAPPING
	LEFT_MOTOR_FRONT(0),
	RIGHT_MOTOR_FRONT(3),
	LEFT_MOTOR_BACK(1),
	RIGHT_MOTOR_BACK(4),
	//JOYSTICK MAPPING
	JOYSTICK(0),
	//ROTATIONAL ARM MAPPING
	ARM_MOTOR_LEFT(5),
	ARM_MOTOR_RIGHT(6);
	//Encoders
	public static int leftEncoderA = 0;
    public static int leftEncoderB = 1;
    //public static int rightEncoderA = 2;
    //public static int rightEncoderB = 3;
    public static double encoderMaxPeriod = 0.1;
    public static int encoderMinRate = 10;
    public static double encoderDPP = 0.0095238095;
    public static int encoderSamplesToAvg = 7;
    public static boolean encoderReverseDirection = false;

	;

	
	public final int value;
	
	RobotMap(int value)
	{
		this.value = value;
	}
	
}
