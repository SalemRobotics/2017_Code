package org.usfirst.frc.team6324.robot;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
//import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team6324.robot.Climber;
import org.usfirst.frc.team6324.robot.DriveTrain;


public class Robot extends IterativeRobot {
	
	public static Climber clMotor;
	public Timer timer;
	public OI oi;
	public DriveTrain drive;
	
//	Command autonomousCommand;
//	SendableChooser autoChooser;
	
		
	@Override
	public void robotInit() {
		
		clMotor = new Climber();
		drive = new DriveTrain();
		oi = new OI();
		
	/*	
		autoChooser = new SendableChooser();
		autoChooser.addDefault("Baseline Autonomous", new BLA());
		autoChooser.addObject("Left Gear Autonomous", new LGA());
		autoChooser.addObject("Right Gear Autonomous", new RGA());
		autoChooser.addObject("Middle Gear Autonomous", new MGA());
		SmartDashboard.putData("Autonomous Mode", autoChooser);
	*/	
		
		CameraServer.getInstance().startAutomaticCapture(1);
//		CameraServer.getInstance().startAutomaticCapture(2);
		
	}

	@Override
	public void autonomousInit() {
		
//		autonomousCommand = (Command) autoChooser.getSelected();
//		autonomousCommand.start();		
		
	}

	@Override
	public void autonomousPeriodic() {
		
		Scheduler.getInstance().run();
		
		
// LEFT PEG GEAR AUTONOMOUS
		
		/* 
		 
		if (Timer.getMatchTime() >= 11.2){
			drive.Straight();
		}
		
		else if (Timer.getMatchTime() >= 10.1){
			drive.Right();
		}
		
		else if (Timer.getMatchTime() >= 9.6){
			drive.Straight();
		}
		
		 else{
			drive.Stop();
		}
		
		*/
		
		
// RIGHT PEG GEAR AUTONOMOUS
		
		/*		
	 
	 	if (Timer.getMatchTime() >= 10.7){
			drive.Straight();
		}
		
		else if (Timer.getMatchTime() >= 10.1){
			drive.Left();
		}
		
		else if (Timer.getMatchTime() >= 9.5){
			drive.Straight();
		}
		
		else{
			drive.Stop(); 
		
		}	
	 	
 		*/
		
	 	
// MIDDLE PEG GEAR AUTONOMOUS
	 	
	 	/*
	 	
	 	if (Timer.getMatchTime() >= 11.5){
			drive.Straight();
		}
	 	else {
	 		drive.Stop();
	 	
		}
		
		*/
	 	
	 	
// BASE LINE AUTONOMOUS
	 	
	 	/*
	 	
	 	if (Timer.getMatchTime() >= 10){
			drive.straight();
		}
	 	else {
	 		drive.Stop();
	 	
		}
		
		*/
		
	}
	

	@Override
	public void teleopPeriodic() {
			
			if (oi.getLeftBumper() == true) {
				drive.drive(oi.getDriveY() * .5, oi.getDriveX() * .5);
			}
			
			else if (oi.getRightBumper() == true) {
				
				drive.drive(oi.getDriveY() * .75, oi.getDriveX() * .75);
			}
			
			else {
			drive.drive(oi.getDriveY() / 1 , oi.getDriveX() / -1);
			
		}
			
		Scheduler.getInstance().run();
	}

	
	@Override
	public void testPeriodic() {
		
	}
}