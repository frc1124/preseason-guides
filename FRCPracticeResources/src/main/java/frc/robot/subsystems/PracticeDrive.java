// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

import edu.wpi.first.wpilibj2.command.SubsystemBase;

// Import WPI_TalonSRX



public class PracticeDrive extends SubsystemBase {
  // Declare WPI_TalonSRX obj for each motor (leftfront, leftback, rightfront, rightback)
  



  public PracticeDrive() {
    // Initialize the motors properly
    


    // Set their neutral modes (default when the motors' is 0 input) to brake using the classes methods


    
    // When initializing the left motors note that the left motors face the opposite way (this should change something about your initialization or implementation)



    // You shouldn't be making separate statements for the back motor action (they should be the same as the front)
    


  } 


  public void leftDrive() {
    // Input: double joystick value (will be between -1 and 1) 
   }

  // Make a simmilar func for rightDrive
  

  // Make a stop method that completely stops both sides when called



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
