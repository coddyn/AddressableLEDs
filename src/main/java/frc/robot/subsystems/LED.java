// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.util.LEDColor;
import frc.robot.util.LEDColor.Colors;

public class LED extends SubsystemBase {

  private AddressableLED LEDStrip;
  private AddressableLEDBuffer LEDBuffer;
  private static int start = 0;
  private double lastChange; 
  private boolean isOn;

  public LED() {
    LEDStrip = new AddressableLED(0);
    LEDBuffer = new AddressableLEDBuffer(60);

    LEDStrip.setLength(LEDBuffer.getLength());
    LEDStrip.setData(LEDBuffer);

    LEDStrip.start();
  }

  public void rainbow(){
     for (int i = 0; i < LEDBuffer.getLength(); i++) {
      final var hue = (start + (i * 180 / LEDBuffer.getLength())) % 180;
      LEDBuffer.setHSV(i, hue, 255, 128);
    }
    LEDStrip.setData(LEDBuffer);
    start %= 180;
    start+=5;
  }

  public void setColor(LEDColor color){
    for(int i = 0; i < LEDBuffer.getLength(); i++){
      LEDBuffer.setRGB(i, color.getR(), color.getG(), color.getB()); 
    }
    LEDStrip.setData(LEDBuffer);
  }
  
  public void pulse(LEDColor color, double interval){
    double timestamp = Timer.getFPGATimestamp();
    if(timestamp -lastChange > interval){
      lastChange = timestamp;
      isOn = !isOn;
    }
    if(isOn){
      stop();
    }
    else{
      setColor(color);
    }
  }

  public void stop(){
    setColor(Colors.kOff);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
