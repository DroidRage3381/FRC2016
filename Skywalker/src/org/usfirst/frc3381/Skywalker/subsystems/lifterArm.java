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

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class lifterArm extends Subsystem {

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon angleMotor = RobotMap.lifterArmangleMotor;
    private final CANTalon extentionMotor = RobotMap.lifterArmextentionMotor;
    private final Encoder angleEncoder = RobotMap.lifterArmangleEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

	// Put methods for controlling this subsystem
	// here. Call these from Commands.

	public void initDefaultCommand() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	public void setEncoderAcuracy() {
		angleMotor.configEncoderCodesPerRev(100);
	}

	public void tiltArm(double angleChange) {
		angleMotor.set(angleChange);
	}

	public void extendArm(double extentionChange) {
		extentionMotor.set(extentionChange);
	}

	public double getArmLength() {
		double armLength = angleMotor.getPosition();
		return armLength + 45.5;
	}

	public double getArmAngle() {
		double angleReading = angleEncoder.getDistance();
		return angleReading;
	}
}
