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

import org.usfirst.frc3381.FullBotVAlpha.RobotMap;
import org.usfirst.frc3381.FullBotVAlpha.commands.*;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class RobotBase extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController speedController1 = RobotMap.robotBaseSpeedController1;
    private final SpeedController speedController2 = RobotMap.robotBaseSpeedController2;
    private final SpeedController speedController3 = RobotMap.robotBaseSpeedController3;
    private final SpeedController speedController4 = RobotMap.robotBaseSpeedController4;
    private final RobotDrive robotDrive = RobotMap.robotBaseRobotDrive;
    private final Encoder quadratureEncoder1 = RobotMap.robotBaseQuadratureEncoder1;
    private final PowerDistributionPanel pDP1 = RobotMap.robotBasePDP1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new RobotBaseCmd());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }    
        public void takeJoysticksInputs (Joystick Joystick1) {
      	  robotDrive.arcadeDrive(Joystick1);
        }
        public void stop() {
      	  robotDrive.drive(0, 0);
        }
    
}
