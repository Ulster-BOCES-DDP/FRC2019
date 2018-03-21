package org.usfirst.frc.team6463.robot.commands;

import org.usfirst.frc.team6463.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopClawBoxIn_Commands extends Command {

	public TeleopClawBoxIn_Commands() {
        requires(Robot.claw);
        setTimeout(2);
    }
	
	
	protected void execute() {
		 	System.out.println("here");
			Robot.claw.BoxIn();
		
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
