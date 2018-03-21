package org.usfirst.frc.team6463.robot.commands;

import org.usfirst.frc.team6463.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopWristDown_Commands extends Command {
	public TeleopWristDown_Commands() {
        requires(Robot.wrist);
        setTimeout(5);
	}
    
	@Override
	protected void execute() {
		 {
			Robot.wrist.WristDown();
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