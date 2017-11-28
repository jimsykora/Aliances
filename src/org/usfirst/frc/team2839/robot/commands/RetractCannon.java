package org.usfirst.frc.team2839.robot.commands;

import org.usfirst.frc.team2839.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class RetractCannon extends InstantCommand {

    public RetractCannon() {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires (Robot.cannon);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.cannon.retract();
    }

}
