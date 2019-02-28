package frc.robot.commands;

import frc.team6463.robot.*;
import edu.wpi.first.wpilibj.command.*;
//import edu.wpi.first.wpilibj.Encoder;


import edu.wpi.first.wpilibj.command.Command;

public class ArmDrive extends Command {
public int position = 0;
int zero=5;
int one=100;
int two=200;
int three=300;
	public ArmDrive() {
		requires(Robot.armMovement);
	}
	
	protected void initialize() {
		
	}
	protected void execute() {
		if(Robot.oi.lift()) {
			Robot.armMovement.setRaw(1, 1);
		}
		if(Robot.oi.down()) {
			Robot.armMovement.setRaw(-1, -1);
		}
		/*if(Robot.oi.rest()) {
			if(position == 1) {
				while(Robot.armEncoders.getLeftDistance()>zero)
					Robot.armMovement.setRaw(-1, -1);
			}else if(position == 2) {
				while(Robot.armEncoders.getLeftDistance()>zero)
					Robot.armMovement.setRaw(-1, -1);
			}else if(position == 3) {
				while(Robot.armEncoders.getLeftDistance()>zero)
					Robot.armMovement.setRaw(-1, -1);
			}
			position = 0;
		}
		if(Robot.oi.posOne()) {
			if(position == 0) {
				while(Robot.armEncoders.getLeftDistance()<one)
					Robot.armMovement.setRaw(1, 1);
			}else if(position == 2){
				while(Robot.armEncoders.getLeftDistance()>one)
					Robot.armMovement.setRaw(-1, -1);
			}else if(position == 3){
				while(Robot.armEncoders.getLeftDistance()>one)
					Robot.armMovement.setRaw(-1, -1);
			}
			position = 1;
		}
		if(Robot.oi.posTwo()) {
			if(position == 0) {
				while(Robot.armEncoders.getLeftDistance()<two)
					Robot.armMovement.setRaw(1, 1);
			}else if(position == 1){
				while(Robot.armEncoders.getLeftDistance()<two)
					Robot.armMovement.setRaw(1, 1);
			}else if(position == 3){
				while(Robot.armEncoders.getLeftDistance()>two)
					Robot.armMovement.setRaw(-1, -1);
			}
			position = 2;
		}
		if(Robot.oi.posThree()) {
			if(position == 0) {
				while(Robot.armEncoders.getLeftDistance()<three)
					Robot.armMovement.setRaw(1, 1);
			}else if(position == 1){
				while(Robot.armEncoders.getLeftDistance()<three)
					Robot.armMovement.setRaw(1, 1);
			}else if(position == 2){
				while(Robot.armEncoders.getLeftDistance()<three)
					Robot.armMovement.setRaw(1, 1);
			}
			position = 3;
		}*/
	}
	
	protected void interuptted() {
		end();
	}
	@Override
	protected boolean isFinished() {
		
		return false;
	}

}
