// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3381.deadRecTest;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
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
    public static Encoder driveSystemleftSideEncode;
    public static Encoder driveSystemrightSideEncode;
    public static SpeedController driveSystemleft0;
    public static SpeedController driveSystemleft1;
    public static SpeedController driveSystemright2;
    public static SpeedController driveSystemright3;
    public static RobotDrive driveSystemmainDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveSystemleftSideEncode = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("driveSystem", "leftSideEncode", driveSystemleftSideEncode);
        driveSystemleftSideEncode.setDistancePerPulse(0.086785);
        driveSystemleftSideEncode.setPIDSourceType(PIDSourceType.kDisplacement);
        driveSystemrightSideEncode = new Encoder(2, 3, true, EncodingType.k4X);
        LiveWindow.addSensor("driveSystem", "rightSideEncode", driveSystemrightSideEncode);
        driveSystemrightSideEncode.setDistancePerPulse(0.013125);
        driveSystemrightSideEncode.setPIDSourceType(PIDSourceType.kDisplacement);
        driveSystemleft0 = new SD540(0);
        LiveWindow.addActuator("driveSystem", "left0", (SD540) driveSystemleft0);
        
        driveSystemleft1 = new SD540(1);
        LiveWindow.addActuator("driveSystem", "left1", (SD540) driveSystemleft1);
        
        driveSystemright2 = new SD540(2);
        LiveWindow.addActuator("driveSystem", "right2", (SD540) driveSystemright2);
        
        driveSystemright3 = new SD540(3);
        LiveWindow.addActuator("driveSystem", "right3", (SD540) driveSystemright3);
        
        driveSystemmainDrive = new RobotDrive(driveSystemleft0, driveSystemleft1,
              driveSystemright2, driveSystemright3);
        
        driveSystemmainDrive.setSafetyEnabled(true);
        driveSystemmainDrive.setExpiration(0.1);
        driveSystemmainDrive.setSensitivity(0.5);
        driveSystemmainDrive.setMaxOutput(1.0);


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
