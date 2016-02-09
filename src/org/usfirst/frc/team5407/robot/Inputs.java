package org.usfirst.frc.team5407.robot;

import edu.wpi.first.wpilibj.Joystick;

public class Inputs {
	
	Joystick joy_RightDriveStick; 
	Joystick joy_LeftWeaponsStick; 
	
	double d_TurnArcadeDrive;
	double d_PowerArcadeDrive; 
	double d_ShooterPower; 
	
	
	boolean b_ShooterHold; 

	
	//This is where declare all the joysticks and buttons   
	public Inputs( int USBConnector_RightDriveStick , int USBConnector_joy_LeftWeaponsStick){
		
		joy_RightDriveStick = new Joystick(USBConnector_RightDriveStick); 
		joy_LeftWeaponsStick = new Joystick(USBConnector_joy_LeftWeaponsStick); 
		zeroInputs();
		
	}
	//Joystick .get values 
	public void readValues() {
		
		 d_TurnArcadeDrive = joy_RightDriveStick.getX() * -1 * .50;
		 d_PowerArcadeDrive = joy_RightDriveStick.getY() * -1;
		 d_ShooterPower = joy_LeftWeaponsStick.getZ() * -1; 
		 b_ShooterHold = joy_LeftWeaponsStick.getRawButton(6); 
		
	}
		//When joysticks or buttons are at zero. Motors will be set to zero power. 
	public void zeroInputs(){  
		this.d_TurnArcadeDrive = 0.0;
		this.d_PowerArcadeDrive = 0.0;
		this.d_ShooterPower = 0.0; 

	}
	
	
	

}
