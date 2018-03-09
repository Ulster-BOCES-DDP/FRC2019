package org.usfirst.frc.team6463.robot;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	
	//Auto Booleans
	boolean stage0, stage1, stage2, stage3, stage4, stage5, stage6, stage7, stage8;
	
	//Motors, Drive, Joysticks
    Spark backLeft, frontLeft, backRight, frontRight, intakeMotor, hopperMotor;
	RobotDrive drive;
	Joystick stick, xBox;
	
	//Sensors
	ADXRS450_Gyro gyro;
	DigitalInput driveEnc, hopperSwitch, gearOn;
	Ultrasonic ultM, ultL, ultR;
	
	//lights!
	Solenoid red, blue, green;
	
	//Ports
	static int backLeftPort = 10, frontLeftPort = 11, backRightPort = 12, frontRightPort = 13, intakePort = 0, hopperMPort = 1;
	static int stickPort = 1, xBoxPort = 0;
	static int ultLPing = 7, ultLEcho = 6, ultMPing = 4, ultMEcho = 5, ultRPing = 3, ultREcho = 2;
	static int driveEncPort = 0, hopperSPort, gearOnPort;
	static int redPort, greenPort, bluePort;
	
	//other variables
	double driveDistance;
	boolean counted;
	static final double Kp = 0.03;// turn rate coefficient for autonomous
	double intakeSpeed;
	
	public void robotInit() {
		//AutoChoosingStuff
		chooser.addDefault("RedMiddle", rmiddle);
		chooser.addObject("RedRight", rright);
		chooser.addObject("RedLeft", rleft);
		chooser.addObject("BlueMiddle", bmiddle);
		chooser.addObject("BlueRight", bRight);
		chooser.addObject("BlueLeft", bleft);
		SmartDashboard.putData("Auto choices", chooser);
		
		//Motors, Drive, Joysticks
		stick = new Joystick(stickPort);
		xBox = new Joystick(xBoxPort);
		backLeft = new Spark(backLeftPort);
		frontLeft = new Spark(frontLeftPort);
		backRight = new Spark(backRightPort);
		frontRight = new Spark(frontRightPort);
		drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
		intakeMotor = new VictorSP(intakePort);
		hopperMotor = new VictorSP(hopperMPort);
		
		
		gyro.calibrate();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString line to get the auto name from the text box below the Gyro
	 *
	 * You can add additional auto modes by adding additional comparisons to the
	 * switch structure below with additional strings. If using the
	 * SendableChooser make sure to add them to the chooser code above as well.
	 */
	
	public void autonomousInit() {
		
	}
	
	public void autonomousPeriodic() {
		
		while(isEnabled() && isAutonomous()){
			

	public void teleopInit() {
		intakeSpeed = 1;
		gyro.reset();
	}
	
	public void teleopPeriodic() {
		while(isEnabled() && isOperatorControl()){
			drive.tankDrive(-xBox.getRawAxis(1), -xBox.getRawAxis(5));
			
			if(xBox.getRawButton(1)) hopperMotor.set(1);
			if(xBox.getRawButton(2)) hopperMotor.set(-1);
			if(xBox.getRawButton(3)) hopperMotor.set(0);
			if(xBox.getRawButton(5)) intakeMotor.set(0);
			if(xBox.getRawButton(6)) intakeMotor.set(1);
			if(stick.getRawButton(9)){
				intakeSpeed = stick.getRawAxis(1);
				intakeMotor.set(intakeSpeed);
			}
			
			SmartDashboard.putBoolean("Gear On", gearOn.get());
			SmartDashboard.putBoolean("Dumper Open", !hopperSwitch.get());
			SmartDashboard.putNumber("Left Ultrasonic", ultL.getRangeInches());
			SmartDashboard.putNumber("Right Ultrasonic", ultR.getRangeInches());
			SmartDashboard.putNumber("Middle Ultrasonic", ultM.getRangeInches());
		}
		
	}
}

