package org.usfirst.frc.team2839.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//PWM-avoid duplicate values
	public static final int DRIVETRAIN_L_MOTOR = 0;
	public static final int DRIVETRAIN_R_MOTOR = 1;
	//PCM-avoid duplicate values
	public static final int CANNON_SOL1 = 1;
	public static final int CANNON_SOL2 = 0;
	//joystick
	public static final int OI_DRIVESTICK = 2;
	public static final int DRIVESTICK_ROTATE_AXIS = 0; // look at joystick in driver station to pick preferred response
	public static final int DRIVESTICK_MOVE_AXIS = 3; 


	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
