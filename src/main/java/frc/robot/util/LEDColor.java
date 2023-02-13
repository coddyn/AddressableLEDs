// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.util;

/** Add your docs here. */
public class LEDColor {
    private int r;
    private int g;
    private int b;
    public LEDColor(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR(){
        return r;
    }
    public int getG(){
        return g;
    }
    public int getB(){
        return b;
    }

    public static final class Colors{
    public static final LEDColor kRed = new LEDColor(255, 0, 0);
    public static final LEDColor kGreen = new LEDColor(0, 255, 0);
    public static final LEDColor kBlue = new LEDColor(0, 0, 255);
    public static final LEDColor kYellow = new LEDColor(255, 255, 0);
    public static final LEDColor kPurple = new LEDColor(127, 0, 255);
    public static final LEDColor kOrange = new LEDColor(255, 95, 31);

    public static final LEDColor kOff = new LEDColor(0, 0, 0);
    }

}
