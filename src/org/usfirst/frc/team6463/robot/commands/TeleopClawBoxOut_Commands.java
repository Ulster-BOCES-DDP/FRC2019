package org.usfirst.frc.team6463.robot.commands;

import org.usfirst.frc.team6463.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopClawBoxOut_Commands extends Command {
	
	public TeleopClawBoxOut_Commands() {
        requires(Robot.claw);
        
    }
	
	@Override
	protected void execute() {
		
			Robot.claw.BoxOut();
		
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		Robot.claw.Stop();
	}
	
	protected void interrupted() {
		end();
	}
}
