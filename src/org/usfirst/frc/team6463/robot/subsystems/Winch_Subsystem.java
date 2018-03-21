package org.usfirst.frc.team6463.robot.subsystems;

import org.usfirst.frc.team6463.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Winch_Subsystem extends Subsystem{
	private VictorSP Winch;
	
	
	@Override
	protected void initDefaultCommand() {
		Winch = new VictorSP(RobotMap.WINCH);
	}
	
	public void WinchUp() {
		Winch.set(.25);
		
	}
	
	public void WinchDown() {
		Winch.set(.25);
		
	}
	
	public void Stop() {
		Winch.set(0);
}
}
