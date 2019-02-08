package org.usfirst.frc.team6463.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team6463.robot.commands.CompressorDrive;
import org.usfirst.frc.team6463.robot.Robot;
import org.usfirst.frc.team6463.robot.RobotMap;
import edu.wpi.first.wpilibj.Compressor;
public class CompressorBase extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CompressorDrive());

	}

}
