// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RepeatCommand;
import frc.robot.commands.Pulse;
import frc.robot.commands.Rainbow;
import frc.robot.commands.SetColor;
import frc.robot.subsystems.*;
import frc.robot.util.LEDColor;
import frc.robot.util.LEDColor.Colors;
public class RobotContainer {

  public static final LED LEDStrip = new LED();
  public static final Joystick stick = new Joystick(0);  

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    
    Buttons.ColorButtons.pulseOne.onTrue(new Pulse(Colors.kYellow, 0.15));
    Buttons.ColorButtons.pulseTwo.onTrue(new Pulse(Colors.kBlue, 0.15));
    Buttons.ColorButtons.solidOne.onTrue(new SetColor(Colors.kGreen));
    Buttons.ColorButtons.solidTwo.onTrue(new SetColor(Colors.kPurple));
    Buttons.ColorButtons.rainbow.onTrue(new Rainbow());
  }
}
