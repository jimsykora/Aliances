package org.usfirst.frc.team2839.robot.subsystems;

import org.usfirst.frc.team2839.robot.RobotMap;
import org.usfirst.frc.team2839.robot.commands.DriveArcade;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.	
	Talon Lmotor = null;
	Talon Rmotor = null;
	RobotDrive robotDrive = null;
	
public Drivetrain(){			//added this constructor
	Lmotor = new Talon(RobotMap.DRIVETRAIN_L_MOTOR);
	Rmotor = new Talon(RobotMap.DRIVETRAIN_R_MOTOR);
	robotDrive = new RobotDrive(Lmotor, Rmotor); // must be in this order,LF,LR, RF, RR		
	}

public void setSpeed(double speed){  //this is a method, it describes what a robot can do but not telling it to do it (a method in DriveForward
	Lmotor.set(-speed); // motors on each side go in different directions
	Rmotor.set(speed);
}

public void arcadeDrive(double moveSpeed, double rotateSpeed){ // creates the variable moveSpeed
	robotDrive.arcadeDrive(moveSpeed, rotateSpeed, true);  // true forces a squared input from joystick
}


    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveArcade());
    }
}

