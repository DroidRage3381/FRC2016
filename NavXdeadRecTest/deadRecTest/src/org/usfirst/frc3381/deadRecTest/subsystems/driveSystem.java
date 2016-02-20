// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3381.deadRecTest.subsystems;

import org.usfirst.frc3381.deadRecTest.RobotMap;
import org.usfirst.frc3381.deadRecTest.commands.*;

import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class driveSystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Encoder leftSideEncode = RobotMap.driveSystemleftSideEncode;
    private final Encoder rightSideEncode = RobotMap.driveSystemrightSideEncode;
    private final SpeedController left0 = RobotMap.driveSystemleft0;
    private final SpeedController left1 = RobotMap.driveSystemleft1;
    private final SpeedController right2 = RobotMap.driveSystemright2;
    private final SpeedController right3 = RobotMap.driveSystemright3;
    private final RobotDrive mainDrive = RobotMap.driveSystemmainDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new driveRobot());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void driveDistanceSpeed(double leftSpeed, double rightSpeed){
    	mainDrive.tankDrive(leftSpeed, rightSpeed);
    }
    public void regularDrive(GenericHID driver){
    	mainDrive.arcadeDrive(driver);
    }
    
    public double getPositionLeft(){
    	return leftSideEncode.getDistance();
    }
    public double getPositionRight(){
    	return rightSideEncode.getDistance();
    }
}
