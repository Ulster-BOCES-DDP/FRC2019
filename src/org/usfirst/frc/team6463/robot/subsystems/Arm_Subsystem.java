package org.usfirst.frc.team6463.robot.subsystems;

import org.usfirst.frc.team6463.robot.RobotMap;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm_Subsystem extends Subsystem {
	private VictorSP ArmL = new VictorSP(RobotMap.ARM_LEFT);
	private VictorSP ArmR = new VictorSP(RobotMap.ARM_RIGHT);
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void RaiseArm() {
		ArmL.set(1);
		ArmR.set(-1);
	}
	
	public void LowerArm() {
		ArmL.set(-1);
		ArmR.set(1);
	}
	
	public void Stop() {
		ArmL.set(0);
		ArmR.set(0);
	}
}
 