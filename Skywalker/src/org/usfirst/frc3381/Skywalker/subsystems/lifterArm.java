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
    private final CANTalon angleMotorC1 = RobotMap.lifterArmangleMotorC1;
    private final CANTalon angleMotorC2 = RobotMap.lifterArmangleMotorC2;
    private final SpeedController extendRight4 = RobotMap.lifterArmextendRight4;
    private final SpeedController extendLeft5 = RobotMap.lifterArmextendLeft5;
    private final AnalogPotentiometer lengthPotA0 = RobotMap.lifterArmlengthPotA0;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void setArmTilt(double angleChange){
    	angleMotorC1.set(angleChange);
    	angleMotorC2.set(-angleChange);
    }
    
    public void setArmExtend(double extentionChange){
    	extendRight4.set(extentionChange);
    	extendLeft5.set(extentionChange);
    }
    
    public double getArmAngle (){
    	double angleC1 = angleMotorC1.getEncPosition();
    	double angleC2 = angleMotorC2.getEncPosition();
    	return (angleC1 + angleC2) / 2; 
    }
}
