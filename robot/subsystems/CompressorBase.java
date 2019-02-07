package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.CompressorDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
public class CompressorBase extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CompressorDrive());

	}

}