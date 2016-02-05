package org.usfirst.frc.team5407.robot;

import edu.wpi.first.wpilibj.Talon;

public class Shooter{
	
	Talon mot_ShooterPower; 
	
	double d_ShooterPower;
	
		public Shooter(int PWMConnector_ShooterPower){
			
		mot_ShooterPower = new Talon(PWMConnector_ShooterPower); 
		
		//make sure all motors are stopped 
		mot_ShooterPower.set(0.0);
		
		}
	    public void update(Inputs inputs){
	    	if(inputs.b_ShooterButton == true){	
	    		mot_ShooterPower.set(d_ShooterPower);
	    	}else{
	    		mot_ShooterPower.set(0);
	    	}

	    }


	}
