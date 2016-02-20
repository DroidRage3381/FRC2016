// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3381.deadRecTest.commands;


import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.PIDCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3381.deadRecTest.Robot;
import org.usfirst.frc3381.deadRecTest.RobotMap;

/**
 *
 */
public class driveToSetpoint extends PIDCommand {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS

	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	Preferences pref;

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
	public driveToSetpoint() {

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
        super("driveToSetpoint", 0.01, 0.001, 0.005, 0.02);
        getPIDController().setContinuous(false);
        getPIDController().setAbsoluteTolerance(0.3);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PID
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveSystem);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

	}

	protected double returnPIDInput() {
		// Return your input value for the PID loop
		// e.g. a sensor, like a potentiometer:
		// yourPot.getAverageVoltage() / kYourMaxVoltage;
		/*
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
        return RobotMap.driveSystemleftSideEncode.pidGet();

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=SOURCE
		 */
		return RobotMap.driveSystemleftSideEncode.pidGet();
	}

	protected void usePIDOutput(double output) {
		// Use output to drive your system, like a motor
		// e.g. yourMotor.set(output);
		/*
		 * // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
        RobotMap.driveSystemleft0.pidWrite(output);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=OUTPUT
		 */
		//RobotMap.driveSystemleft0.pidWrite(-output);
		double currentTurn = Robot.pidGyroSystem.getCurrentGyroCorrections();
		Robot.driveSystem.driveDistanceSpeed(-output, currentTurn);
		SmartDashboard.putNumber("Current Turn", currentTurn);

	}

	// Called just before this Command runs the first time
	protected void initialize() {
		pref = Preferences.getInstance();
		Robot.pidGyroSystem.ahrs.reset();
		Robot.pidGyroSystem.setSetpoint(0.0);
		double p, i, d;
		p = pref.getDouble("P", 0.01);
		i = pref.getDouble("I", 0.001);
		d = pref.getDouble("D", 0.01);
		getPIDController().setPID(p, i, d);

	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute() {
		double setpoint = pref.getDouble("Distance To Drive", 1.0);
		getPIDController().setSetpoint(setpoint);
		double leftPosition = Robot.driveSystem.getPositionLeft();
		double rightPosition = Robot.driveSystem.getPositionRight();
		SmartDashboard.putNumber("Left Encoder", leftPosition);
		SmartDashboard.putNumber("Right Encoder", rightPosition);
		Double error = Math.abs(getPIDController().getError());
		SmartDashboard.putNumber("Current Error", error);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished() {
		DriverStation.reportError("isFinished"+(Math.abs(getPIDController().getError()) <= .5) , false);
		return Math.abs(getPIDController().getError()) <= .5;
	}

	// Called once after isFinished returns true
	protected void end() {
		DriverStation.reportError("END", false);
		Robot.driveSystem.driveDistanceSpeed(0, 0);;
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted() {
		end();
	}
}
