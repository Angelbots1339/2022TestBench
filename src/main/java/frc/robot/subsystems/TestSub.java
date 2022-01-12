// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TestSub extends SubsystemBase {
  private TalonFX testMotor = new TalonFX(Constants.MOTORPORT);

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Supply Crrnt", testMotor.getSupplyCurrent());
    SmartDashboard.putNumber("Stator Crrnt", testMotor.getStatorCurrent());
    SmartDashboard.putNumber("BussVoltage", testMotor.getTemperature());
    // This method will be called once per scheduler run
  }

  public void setMotor(Double speed){
    testMotor.set(ControlMode.PercentOutput, speed);
  }
}
