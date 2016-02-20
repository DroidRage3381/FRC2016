// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3381.lifterTestCode.subsystems;

import org.usfirst.frc3381.lifterTestCode.RobotMap;
import org.usfirst.frc3381.lifterTestCode.commands.*;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.SD540;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class lifterArm extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController extendMotor4 = RobotMap.lifterArmextendMotor4;
    private final SpeedController extendMotor5 = RobotMap.lifterArmextendMotor5;
    private final CANTalon angleMotorC1 = RobotMap.lifterArmangleMotorC1;
    private final CANTalon angleMotorC2 = RobotMap.lifterArmangleMotorC2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void extendLifterArm(double speed) {
    	extendMotor4.set(speed);
    	extendMotor5.set(-speed);
    }
    
    public void angleLifterArm(double speed) {
    	angleMotorC1.set(speed);
    	angleMotorC2.set(-speed);
    }
}
