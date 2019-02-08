
package frc.robot.commands;


import frc.robot.*;
import frc.robot.subsystems.DriveEncoders;

import edu.wpi.first.wpilibj.command.*;

public class TankDrive extends Command {
	
	boolean buttonValue;
	public TankDrive() {
		requires(Robot.drivebase);
	}
	
	protected void initialize() {
		
	}
	protected void execute() {
		double throttle = 0.5;
		if(Robot.oi.fineControl()){
			throttle = 0.25;
		}
		if(Robot.oi.dejavu()){
			throttle = 1;
		}

		Robot.drivebase.setRaw((Robot.oi.getJoyY()-Robot.oi.getJoyX()) * throttle, (Robot.oi.getJoyY()+Robot.oi.getJoyX()) * throttle,
				(Robot.oi.getJoyY()-Robot.oi.getJoyX()) * throttle, (Robot.oi.getJoyY()+Robot.oi.getJoyX()) * throttle);
	}
	protected boolean isFinished() {
		return false;
	}
	protected void interuptted() {
		end();
	}
	

}