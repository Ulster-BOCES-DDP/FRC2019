package org.usfirst.frc.team6463.robot.subsystems;

import org.usfirst.frc.team6463.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Wrist_Subsystem extends Subsystem{
	private VictorSP Wrist = new VictorSP(RobotMap.WRIST_REDLINE);
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void WristUp() {
		Wrist.set(1);
		
	}
	
	public void WristDown() {
		Wrist.set(-1);
		
	}
	
	public void Stop() {
		Wrist.set(0);
}
}
