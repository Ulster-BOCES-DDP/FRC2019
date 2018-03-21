package org.usfirst.frc.team6463.robot.commands;

import org.usfirst.frc.team6463.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopWristUp_Commands extends Command {
	public TeleopWristUp_Commands() {
		requires(Robot.wrist);
	}
	
	
	
@Override
	protected void execute() {
		 {
			Robot.wrist.WristUp();
		}
		Robot.wrist.Stop();
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		Robot.wrist.Stop();
	}
	
	protected void interrupted() {
		end();
	}
}