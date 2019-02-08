/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6463.robot;

import java.util.Date;

import org.usfirst.frc.team6463.robot.subsystems.Arm_Subsystem;
import org.usfirst.frc.team6463.robot.subsystems.Claw_Subsystem;
import org.usfirst.frc.team6463.robot.subsystems.Drivebase;
import org.usfirst.frc.team6463.robot.subsystems.Winch_Subsystem;
import org.usfirst.frc.team6463.robot.subsystems.Wrist_Subsystem;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	public static final Subsystem WINCH = null;
	public static OI oi;
	public static Drivebase drivebase;
	public static Claw_Subsystem claw;
	public static Arm_Subsystem arm;
	public static Winch_Subsystem winch;
	public static Wrist_Subsystem wrist;
	private Date autostart;
	

	/**
	 * This function is run when the robot is first started up and should be used
	 * for any initialization code.
	 */
	@Override
	public void robotInit() {
		
		// chooser.addObject("My Auto", new MyAutoCommand());
		drivebase = new Drivebase();
		claw = new Claw_Subsystem();
		arm = new Arm_Subsystem();
		winch = new Winch_Subsystem();
		wrist = new Wrist_Subsystem();
		oi = new OI();
		
	}

	/**
	 * This function is called once each time the robot enters Disabled mode. You
	 * can use it to reset any subsystem information you want to clear when the
	 * robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable chooser
	 * code works with the Java SmartDashboard. If you prefer the LabVIEW Dashboard,
	 * remove all of the chooser code and uncomment the getString code to get the
	 * auto name from the text box below the Gyro
	 *
	 * <p>
	 * You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons to
	 * the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
		autostart = new Date();
		
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		if(autostart.getTime() +5 < new Date().getTime()) {
			Robot.drivebase.tankDrive(-.5, -.5);
		} else {
			Robot.drivebase.tankDrive(0, 0);
		}
    
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
		
	}
	
	public void testInit(){
		//VictorSP test = new VictorSP(5);
		//VictorSP test2 = new VictorSP(4);
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
		oi.debug();
	}
}
