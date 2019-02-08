package org.usfirst.frc.team6463.robot.commands;

import org.usfirst.frc.team6463.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class TeleopWinchDown_Commands extends Command {
	public TeleopWinchDown_Commands() {
        requires(Robot.winch);
        
    }
	
	@Override
	protected void execute() {
		 {
			Robot.winch.WinchDown();
		}
		Robot.winch.Stop();
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	protected void end() {
		Robot.winch.Stop();
	}
	
	protected void interrupted() {
		end();
	}
}

