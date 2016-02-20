// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3381.FullBotVAlpha;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
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
    public static SpeedController shooterSpeedController1;
    public static SpeedController shooterSpeedController2;
    public static CANTalon armCANTalon1;
    public static CANTalon armCANTalon2;
    public static SpeedController armSpeedController1;
    public static SpeedController armSpeedController2;
    public static SpeedController robotBaseSpeedController1;
    public static SpeedController robotBaseSpeedController2;
    public static SpeedController robotBaseSpeedController3;
    public static SpeedController robotBaseSpeedController4;
    public static RobotDrive robotBaseRobotDrive;
    public static Encoder robotBaseQuadratureEncoder1;
    public static PowerDistributionPanel robotBasePDP1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        shooterSpeedController1 = new SD540(4);
        LiveWindow.addActuator("Shooter", "Speed Controller 1", (SD540) shooterSpeedController1);
        
        shooterSpeedController2 = new SD540(5);
        LiveWindow.addActuator("Shooter", "Speed Controller 2", (SD540) shooterSpeedController2);
        
        armCANTalon1 = new CANTalon(1);
        LiveWindow.addActuator("Arm", "CAN Talon 1", armCANTalon1);
        
        armCANTalon2 = new CANTalon(2);
        LiveWindow.addActuator("Arm", "CAN Talon 2", armCANTalon2);
        
        armSpeedController1 = new SD540(6);
        LiveWindow.addActuator("Arm", "Speed Controller 1", (SD540) armSpeedController1);
        
        armSpeedController2 = new SD540(7);
        LiveWindow.addActuator("Arm", "Speed Controller 2", (SD540) armSpeedController2);
        
        robotBaseSpeedController1 = new SD540(0);
        LiveWindow.addActuator("RobotBase", "Speed Controller 1", (SD540) robotBaseSpeedController1);
        
        robotBaseSpeedController2 = new SD540(1);
        LiveWindow.addActuator("RobotBase", "Speed Controller 2", (SD540) robotBaseSpeedController2);
        
        robotBaseSpeedController3 = new SD540(2);
        LiveWindow.addActuator("RobotBase", "Speed Controller 3", (SD540) robotBaseSpeedController3);
        
        robotBaseSpeedController4 = new SD540(3);
        LiveWindow.addActuator("RobotBase", "Speed Controller 4", (SD540) robotBaseSpeedController4);
        
        robotBaseRobotDrive = new RobotDrive(robotBaseSpeedController1, robotBaseSpeedController2,
              robotBaseSpeedController3, robotBaseSpeedController4);
        
        robotBaseRobotDrive.setSafetyEnabled(true);
        robotBaseRobotDrive.setExpiration(0.1);
        robotBaseRobotDrive.setSensitivity(0.5);
        robotBaseRobotDrive.setMaxOutput(1.0);

        robotBaseQuadratureEncoder1 = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("RobotBase", "Quadrature Encoder 1", robotBaseQuadratureEncoder1);
        robotBaseQuadratureEncoder1.setDistancePerPulse(1.0);
        robotBaseQuadratureEncoder1.setPIDSourceType(PIDSourceType.kRate);
        robotBasePDP1 = new PowerDistributionPanel(0);
        LiveWindow.addSensor("RobotBase", "PDP 1", robotBasePDP1);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}