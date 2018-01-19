package org.usfirst.frc.team6324.robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbStopCMD extends Command {

    public ClimbStopCMD() {
    	requires(Robot.clMotor);
    }
    protected void initialize() {
    	Robot.clMotor.getClimberStop();
    }
    protected void execute() {
    	Robot.clMotor.getClimberStop();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {	
    }
    protected void interrupted() {   	
    }
}