package org.usfirst.frc.team6324.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.DriverStation;

public class DriveTrain {
	RobotDrive drive = new RobotDrive(0, 1, 2, 3);
	Timer timer = new Timer();
	DriverStation DS;

	public void  drive(double y, double x){
		drive.arcadeDrive(y,x);
	}
	
	public double GameTime(){
		return Timer.getMatchTime();
	}
	
	public void Stop (){	
		drive.stopMotor();
	}
	
	public void Straight(){
		drive.tankDrive(-0.5, -0.53);
	}
	
	public void Right(){
		drive.tankDrive(0.5, -0.5);
	}
	
	public void Left(){
		drive.tankDrive(-0.5, 0.5);
	}
	
	public void Straight(double seconds){	
		timer.reset();
		timer.start();
		drive.tankDrive(-0.5, -0.53);
		drive.tankDrive(0, 0);
	}
		
	public void Back(double seconds){	
		timer.reset();
		timer.start();
		drive.tankDrive(0.53, 0.5);
		drive.tankDrive(0, 0);

	}
	
	public void TurnRight(double run){
		timer.reset();
		timer.start();
		drive.tankDrive(0.5, -0.5);
		drive.tankDrive(0, 0);
		
	}
		
	public void TurnLeft(double run){
		timer.reset();
		timer.start();
		drive.tankDrive(-0.5, 0.5);
		drive.tankDrive(0, 0);

	}
		
}
