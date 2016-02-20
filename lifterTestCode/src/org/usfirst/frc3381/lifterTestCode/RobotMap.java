// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3381.lifterTestCode;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SD540;
import edu.wpi.first.wpilibj.SpeedController;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController lifterArmextendMotor4;
    public static SpeedController lifterArmextendMotor5;
    public static CANTalon lifterArmangleMotorC1;
    public static CANTalon lifterArmangleMotorC2;
    public static SpeedController drivePlatformleft0;
    public static SpeedController drivePlatformleft1;
    public static SpeedController drivePlatformright2;
    public static SpeedController drivePlatformright3;
    public static RobotDrive drivePlatformmainDriveTrain;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        lifterArmextendMotor4 = new SD540(4);
        LiveWindow.addActuator("lifterArm", "extendMotor4", (SD540) lifterArmextendMotor4);
        
        lifterArmextendMotor5 = new SD540(5);
        LiveWindow.addActuator("lifterArm", "extendMotor5", (SD540) lifterArmextendMotor5);
        
        lifterArmangleMotorC1 = new CANTalon(1);
        LiveWindow.addActuator("lifterArm", "angleMotorC1", lifterArmangleMotorC1);
        
        lifterArmangleMotorC2 = new CANTalon(2);
        LiveWindow.addActuator("lifterArm", "angleMotorC2", lifterArmangleMotorC2);
        
        drivePlatformleft0 = new SD540(0);
        LiveWindow.addActuator("drivePlatform", "left0", (SD540) drivePlatformleft0);
        
        drivePlatformleft1 = new SD540(1);
        LiveWindow.addActuator("drivePlatform", "left1", (SD540) drivePlatformleft1);
        
        drivePlatformright2 = new SD540(2);
        LiveWindow.addActuator("drivePlatform", "right2", (SD540) drivePlatformright2);
        
        drivePlatformright3 = new SD540(3);
        LiveWindow.addActuator("drivePlatform", "right3", (SD540) drivePlatformright3);
        
        drivePlatformmainDriveTrain = new RobotDrive(drivePlatformleft0, drivePlatformleft1,
              drivePlatformright2, drivePlatformright3);
        
        drivePlatformmainDriveTrain.setSafetyEnabled(true);
        drivePlatformmainDriveTrain.setExpiration(0.1);
        drivePlatformmainDriveTrain.setSensitivity(0.5);
        drivePlatformmainDriveTrain.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
