package org.usfirst.frc.team6324.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	Joystick gamepad1;
	Joystick gamepad2;
	
	JoystickButton A;	
	JoystickButton B;
	JoystickButton X;
	JoystickButton Y;

	JoystickButton RightBumper;
	JoystickButton LeftBumper;
	JoystickButton un_uninvert;
	
	public OI() {
		
		gamepad1 = new Joystick(0);
		
		A = new JoystickButton(gamepad1, 1);
		B = new JoystickButton(gamepad1, 2);
		X = new JoystickButton(gamepad1, 3);
		Y = new JoystickButton(gamepad1, 4);
		LeftBumper = new JoystickButton(gamepad1, 5);
		RightBumper = new JoystickButton(gamepad1, 6);

		A.whileHeld(new ClimbUpCMD());
		B.whileHeld(new ClimbStopCMD());
		
	}
	
	public boolean getLeftBumper() {
		return LeftBumper.get();
	}
	
	public boolean getRightBumper() {
		return RightBumper.get();
	}
	
	public double getDriveX() {	
		return gamepad1.getRawAxis(4);
	}
	
	public double getDriveY() {
		return gamepad1.getRawAxis(1);
	}
	
}