// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3381.Skywalker.subsystems;

import org.usfirst.frc3381.Skywalker.RobotMap;
import org.usfirst.frc3381.Skywalker.commands.*;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SD540;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class driveBase extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController left0 = RobotMap.driveBaseleft0;
    private final SpeedController left1 = RobotMap.driveBaseleft1;
    private final SpeedController right2 = RobotMap.driveBaseright2;
    private final SpeedController right3 = RobotMap.driveBaseright3;
    private final RobotDrive mainDrive = RobotMap.driveBasemainDrive;
    private final PowerDistributionPanel powerBoardC0 = RobotMap.driveBasepowerBoardC0;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	AHRS ahrs = RobotMap.ahrs;

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new standardDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}

	public void arcadeDrive(Joystick driveStick) {
		mainDrive.arcadeDrive(driveStick);
	}

	public void manualDrive(double speed, double turnSpeed) {
		mainDrive.arcadeDrive(speed, turnSpeed);
	}

	public void resetGyro() {
		ahrs.reset();
	}

	public double getGyroAngle() {
		return ahrs.getAngle();
	}

	public double getAmpDraw(int Channal) {
		return powerBoardC0.getCurrent(Channal);
	}
}
