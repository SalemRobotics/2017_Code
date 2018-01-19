package org.usfirst.frc.team6324.robot;

import edu.wpi.first.wpilibj.command.Command;

public class ClimbUpCMD extends Command {

    public ClimbUpCMD() {
    	requires(Robot.clMotor);
    }
    protected void initialize() {
    	Robot.clMotor.getClimberUp();
    }
    protected void execute() {
    	Robot.clMotor.getClimberUp();
    }
    protected boolean isFinished() {
        return false;
    }
    protected void end() {
    }
    protected void interrupted() {
    }
}