// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;

public class ExampleCommand extends Command {
  /** Creates a new ExampleCommand. */
  public ExampleCommand() {
    
  }

  @Override
  public void initialize() {
    System.out.println("Exapmle Command");
  }

  @Override
  public void execute() {}

  @Override
  public void end(boolean interrupted) {
    System.out.println("Example Command Ended");
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
