package frc.robot.commands;

import frc.robot.*;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.Compressor;
public class CompressorDrive extends Command {
	Compressor c = new Compressor();
	public CompressorDrive(){
		requires(Robot.compressorbase);
		
		c.setClosedLoopControl(true);
		c.setClosedLoopControl(false);
		
		boolean enabled =c.enabled();
		boolean pressureSwithch = c.getPressureSwitchValue();
		double current = c.getCompressorCurrent();
		
	}
protected void initialize() {
	c.start();
	}
	protected void execute() {
		if(Robot.oi.triggered())
			c.start();
		else
			c.stop();
	}
	@Override
	protected boolean isFinished() {
		
		return false;
	}

}