/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import frc.robot.subsystems.DriveBase;
import frc.robot.subsystems.ArmMovement;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Robot extends TimedRobot {


	public static OI oi;

	
	public static DriveBase drivebase;
	public static ArmMovement armMovement;
	//public static DriveEncoders armEncoders;
	//public static CompressorBase compressorbase;
	
	
	
	@Override
	public void robotInit() {
		oi = new OI();
		drivebase = new DriveBase();
		armMovement = new ArmMovement();
		//armEncoders = new DriveEncoders(RobotMap.leftEncoderA,RobotMap.leftEncoderB,/*RobotMap.rightEncoderA, RobotMap.rightEncoderB,*/
				//RobotMap.encoderMaxPeriod, RobotMap.encoderMinRate, RobotMap.encoderDPP,RobotMap.encoderReverseDirection,RobotMap.encoderSamplesToAvg);
		//compressorbase = new CompressorBase();
	}

	
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}


	@Override
	public void autonomousInit() {
		
	}

	
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		
	}


	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	
	@Override
	public void testPeriodic() {
	}
}
