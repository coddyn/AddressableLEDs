// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/** Add your docs here. */
public class Buttons {
    public static final class ColorButtons{
        public static final JoystickButton pulseOne = new JoystickButton(RobotContainer.stick, 1);
        public static final JoystickButton pulseTwo = new JoystickButton(RobotContainer.stick, 2);
        public static final JoystickButton solidOne = new JoystickButton(RobotContainer.stick, 3);
        public static final JoystickButton solidTwo = new JoystickButton(RobotContainer.stick, 4);
        public static final JoystickButton rainbow = new JoystickButton(RobotContainer.stick, 5);
    }
}
