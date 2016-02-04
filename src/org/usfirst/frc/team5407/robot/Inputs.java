package org.usfirst.frc.team5407.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Inputs {
	
	Joystick joy_RightDriveStick; 
	
	double d_TurnArcadeDrive;
	double d_PowerArcadeDrive; 
	
	
	
	
	public Inputs( int USBConnector_RightDriveStick){
		
		joy_RightDriveStick = new Joystick(USBConnector_RightDriveStick); 
		zeroInputs();
		
	}
	public void readValues() {
		
		 d_TurnArcadeDrive = joy_RightDriveStick.getX() * -1 * .50;
		 d_PowerArcadeDrive = joy_RightDriveStick.getY() * -1;
		
		
		
	}
		
	public void zeroInputs(){  
		this.d_TurnArcadeDrive = 0.0;
		this.d_PowerArcadeDrive = 0.0;

	}
	
	
	

}
