package org.usfirst.frc3381.deadRecTest.subsystems;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Preferences;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import com.kauailabs.navx.frc.AHRS;

/**
 *
 */
public class pidGyroSystem extends PIDSubsystem {

    // Initialize your subsystem here
	Preferences pref;
	public AHRS ahrs;
	double currentRotationSpeed;
	
    public pidGyroSystem() {
    	super("GyroPIDSystem", 0.03, 0.00, 0.00);
    	pref = Preferences.getInstance();
    	double absoluteTolerance = pref.getDouble("Gyro Aline Tolerance", 2.00);
    	setAbsoluteTolerance(absoluteTolerance);
    	setInputRange(-180.0f, 180.0f);
    	getPIDController().setContinuous(true);
    	LiveWindow.addActuator("GyroPIDSystem", "Gyro PID Aline", getPIDController());
    	getPIDController().setOutputRange(-1.0, 1.0);
    	
    	try{
    		ahrs = new AHRS(SPI.Port.kMXP);
    	}catch(RuntimeException ex){
    		DriverStation.reportError("Problem connecting to navX Sensor on MXP :"+ex.getMessage(), true);
    	}
    	
    	getPIDController().disable();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	return ahrs.getAngle();
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    	currentRotationSpeed = output;
    }
    
    public double getCurrentGyroCorrections(){
    	return currentRotationSpeed;
    }
    
    public void setSetpoint(double setpoint){
    	getPIDController().setSetpoint(setpoint);
    }
}
