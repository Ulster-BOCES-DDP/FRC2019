package org.usfirst.frc.team6463.robot.subsystems;

import org.usfirst.frc.team6463.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Claw_Subsystem extends Subsystem {

	private VictorSP ClawL;
	private VictorSP ClawR;
	
	public Claw_Subsystem(){
		System.out.println("claw init");
		ClawL = new VictorSP(RobotMap.CLAW_LEFT);
		ClawR = new VictorSP (RobotMap.CLAW_RIGHT);
		
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void BoxIn() {
		System.out.println("Box in")
;		ClawL.set(.75);
		ClawR.set(-.75);
	}
	
	public void BoxOut() {
		ClawL.set(-.75);
		ClawR.set(.75);
	}
	
	public void Stop() {
		ClawL.set(0);
		ClawR.set(0);
	}
}
