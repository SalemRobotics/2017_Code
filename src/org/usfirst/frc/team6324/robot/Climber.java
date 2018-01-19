package org.usfirst.frc.team6324.robot;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
	Talon clMotor;
	
	public Climber() {
		clMotor = new Talon(4);
	}
	
	public void getClimberUp() {
		clMotor.set(1);
	}
	
	public void getClimberStop() {
		clMotor.set(0);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
}