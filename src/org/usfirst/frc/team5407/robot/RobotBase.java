package org.usfirst.frc.team5407.robot;

import edu.wpi.first.wpilibj.Talon;

public class RobotBase {

	Talon mot_LeftDriveMotor;
	Talon mot_RightDriveMotor; 
	
	   /**
     * This function is run when this class is first created used for any initialization code.
     */
    public RobotBase(int PWMConnector_LeftDriveMotor,
		    		 int PWMConnector_RightDriveMotor) {
    	
    	mot_LeftDriveMotor = new Talon(PWMConnector_LeftDriveMotor);
    	mot_RightDriveMotor = new Talon(PWMConnector_RightDriveMotor);
    
    	
    	// Make sure motors are stopped
    	mot_LeftDriveMotor.set(0.0);
    	mot_RightDriveMotor.set(0.0);
    	
    	
    //	this.bp_AllowedToDrive = true;					//this is a safety mode so robot will not move 
    }
	
	
	
	
	
	
	
	
	
}
