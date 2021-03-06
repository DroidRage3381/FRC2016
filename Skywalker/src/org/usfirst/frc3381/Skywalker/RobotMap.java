// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc3381.Skywalker;

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

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.DriverStation;

import com.kauailabs.navx.frc.AHRS;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveBaseleft0;
    public static SpeedController driveBaseleft1;
    public static SpeedController driveBaseright2;
    public static SpeedController driveBaseright3;
    public static RobotDrive driveBasemainDrive;
    public static PowerDistributionPanel driveBasepowerBoardC0;
    public static CANTalon lifterArmangleMotor;
    public static CANTalon lifterArmextentionMotor;
    public static Encoder lifterArmangleEncoder;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	public static AHRS ahrs;

	public static void init() {
		// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBaseleft0 = new SD540(0);
        LiveWindow.addActuator("driveBase", "left0", (SD540) driveBaseleft0);
        
        driveBaseleft1 = new SD540(1);
        LiveWindow.addActuator("driveBase", "left1", (SD540) driveBaseleft1);
        
        driveBaseright2 = new SD540(2);
        LiveWindow.addActuator("driveBase", "right2", (SD540) driveBaseright2);
        
        driveBaseright3 = new SD540(3);
        LiveWindow.addActuator("driveBase", "right3", (SD540) driveBaseright3);
        
        driveBasemainDrive = new RobotDrive(driveBaseleft0, driveBaseleft1,
              driveBaseright2, driveBaseright3);
        
        driveBasemainDrive.setSafetyEnabled(true);
        driveBasemainDrive.setExpiration(0.1);
        driveBasemainDrive.setSensitivity(0.5);
        driveBasemainDrive.setMaxOutput(1.0);

        driveBasepowerBoardC0 = new PowerDistributionPanel(0);
        LiveWindow.addSensor("driveBase", "powerBoardC0", driveBasepowerBoardC0);
        
        lifterArmangleMotor = new CANTalon(1);
        LiveWindow.addActuator("lifterArm", "angleMotor", lifterArmangleMotor);
        
        lifterArmextentionMotor = new CANTalon(2);
        LiveWindow.addActuator("lifterArm", "extentionMotor", lifterArmextentionMotor);
        
        lifterArmangleEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("lifterArm", "angleEncoder", lifterArmangleEncoder);
        lifterArmangleEncoder.setDistancePerPulse(0.0030679616);
        lifterArmangleEncoder.setPIDSourceType(PIDSourceType.kDisplacement);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
		SPI.Port spi = SPI.Port.kMXP;
		try {
			ahrs = new AHRS(spi);
		} catch (RuntimeException ex) {
			DriverStation.reportError(
					"Unable to Connect to NavX Sensor" + ex.getMessage(), true);
		}

	}
}
