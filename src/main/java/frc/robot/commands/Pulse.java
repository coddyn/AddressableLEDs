// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.util.LEDColor;

public class Pulse extends CommandBase {

  private LEDColor color;
  private double interval;
  /** Creates a new Pulse. */
  public Pulse(LEDColor color, double interval) {
    this.color = color;
    this.interval = interval;
    addRequirements(RobotContainer.LEDStrip);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // RobotContainer.LEDStrip.pulse(0, 255, 0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    RobotContainer.LEDStrip.pulse(color, interval);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    RobotContainer.LEDStrip.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
