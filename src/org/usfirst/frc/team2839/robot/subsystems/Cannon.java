package org.usfirst.frc.team2839.robot.subsystems;

import org.usfirst.frc.team2839.robot.RobotMap;
import org.usfirst.frc.team2839.robot.commands.TurnOffCannon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 
 */
public class Cannon extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DoubleSolenoid sol1 = null;
	
	public Cannon() {
		sol1 = new DoubleSolenoid (RobotMap.CANNON_SOL1,RobotMap.CANNON_SOL2);
	}

	public void deploy(){
		sol1.set(Value.kForward);//(Value.kForward) for double solenoids 
	}
	public void retract(){
		sol1.set(Value.kReverse);//(Value.kReverse) (Value.kOff) for double solenoids
	}
	public void off(){
		sol1.set(Value.kOff);//(Value.kReverse) (Value.kOff) for double solenoids
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new TurnOffCannon());
    }
}

