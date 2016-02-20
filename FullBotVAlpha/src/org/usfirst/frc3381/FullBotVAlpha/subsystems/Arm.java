// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3381.FullBotVAlpha.subsystems;

import org.usfirst.frc3381.FullBotVAlpha.OI;
import org.usfirst.frc3381.FullBotVAlpha.RobotMap;
import org.usfirst.frc3381.FullBotVAlpha.commands.*;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SD540;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arm extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon cANTalon1 = RobotMap.armCANTalon1;
    private final CANTalon cANTalon2 = RobotMap.armCANTalon2;
    private final SpeedController speedController1 = RobotMap.armSpeedController1;
    private final SpeedController speedController2 = RobotMap.armSpeedController2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
   public void armPitch (double speed){
   cANTalon1.set(speed);
   cANTalon2.set(speed); 
   }
   
   public void armLength (double speed){
	   speedController1.set(speed);
	   speedController2.set(-speed);
   }
}
