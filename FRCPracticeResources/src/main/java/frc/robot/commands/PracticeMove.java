// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;
  
// Rename the class and constructor to filename
public class ExampleCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"}) //Don't care about this line

  private final ExampleSubsystem m_subsystem; // declare a PracticeDrive obj (it will be intialized later by the PracticeDrive that will be passed to the constructor)
  
  

  // Contructor should take an instance of PracticeDrive: replace ExampleSubsystem
  public ExampleCommand(ExampleSubsystem subsystem) {
  m_subsystem = subsystem; // Initialize the previously declared PracticeDrive obj with the one passed to constructor

    // Use addRequirements() here to declare the PracticeDrive passed as a dependency.
    addRequirements(subsystem);
  }

  // COMMANDS TO DRIVE

  @Override
  public void initialize() {}


  // Called every time the scheduler runs while the command is scheduled. 
  @Override
  public void execute() {
    // Input: double leftJoystickVal (between -1 and 1), double rightJoystickVal (between -1 and 1)
    // Utilize the PracticeDrive methods you made earlier to make it move using the joystick input for the respective sides


  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // Utilize the stop method from PracticeDrive to stop the robot 


  }


  @Override
  public boolean isFinished() {
    return false;
  }
}
