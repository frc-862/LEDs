// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.ExampleCommand;
import frc.robot.Constants.LEDsConstants.LED_STATES;
import frc.robot.subsystems.LEDs;

public class RobotContainer {
  XboxController driver = new XboxController(0);
  LEDs leds = new LEDs();
  public RobotContainer() {
    
    configureBindings();
  }

  private void configureBindings() {
    new Trigger(driver::getAButton).whileTrue(new ExampleCommand().deadlineWith(leds.EnableState(LED_STATES.SHOOTING)).andThen(leds.EnableState(LED_STATES.SHOT).withTimeout(2)));
  }

}
