// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3381.Skywalker.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3381.Skywalker.Robot;

/**
 *
 */
public class autoCross extends Command {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	double driveDirection;
	long lastSwitchTime;
	boolean lastPitchUp = true;

	public autoCross(double driveDirection) {
		/*
		 * // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		 * public autoCross() {
		 * 
		 * // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		 */
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
		this.driveDirection = driveDirection;
	}

	// Called just before this Command runs the first time
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		Robot.driveBase.manualDrive(.75 * driveDirection, 0);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		Timer.delay(0.100);

		boolean isPitchUp = Math.abs(Robot.ahrs.getPitch()) >= 2.0;
		SmartDashboard.putNumber("Pitch Reading", Robot.ahrs.getPitch());
		SmartDashboard.putBoolean("Is Pitch Up", isPitchUp);

		if (!isPitchUp && lastPitchUp) {
			lastSwitchTime = System.currentTimeMillis();
		}
		lastPitchUp = isPitchUp;
		long timeDiff = System.currentTimeMillis() - lastSwitchTime;
		SmartDashboard.putNumber("Pitch Reading", timeDiff);

		if (timeDiff > 2000 && isPitchUp) {
			SmartDashboard.putString("Triggered Pitch Up", "True");
			return false;
		} else {
			SmartDashboard.putString("Triggered Pitch Up", "False");
			Robot.driveBase.manualDrive(0, 0);
			Timer.delay(1);
			return true;
		}
	}

	// Called once after isFinished returns true
	protected void end() {
		Robot.driveBase.manualDrive(0, 0);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
