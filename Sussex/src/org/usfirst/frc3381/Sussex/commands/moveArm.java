// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3381.Sussex.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3381.Sussex.Robot;

/**
 *
 */
public class moveArm extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public moveArm() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.lifterArm);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if (Robot.oi.coDriverStick.getRawButton(6))
    	{
    	Robot.lifterArm.angleLifterArm(Robot.oi.coDriverStick.getY());
    	}
    	else if (Robot.oi.coDriverStick.getRawButton(7))
    	{
    	Robot.lifterArm.angleLifterArm(-.50);
    	}
    	else {
    		Robot.lifterArm.angleLifterArm(0);
    	}
    	if (Robot.oi.coDriverStick.getRawButton(11))
    	{
    	Robot.lifterArm.extendLifterArm(Robot.oi.coDriverStick.getY());
    	}
    	else if (Robot.oi.coDriverStick.getRawButton(10))
    	{
    	Robot.lifterArm.extendLifterArm(-.80);
    	}
    	else {
    		Robot.lifterArm.extendLifterArm(0);
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !Robot.lifterArm.isAtFullExtention() ||
        	   !Robot.lifterArm.isAtFullRetraction() ||
        	   !Robot.lifterArm.isAtBottomSwitch();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lifterArm.angleLifterArm(0);
    	Robot.lifterArm.extendLifterArm(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
