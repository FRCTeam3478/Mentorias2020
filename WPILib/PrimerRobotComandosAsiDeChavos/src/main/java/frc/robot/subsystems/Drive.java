package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drive extends SubsystemBase {
  
  private CANSparkMax left_1;
  private CANSparkMax left_2;
  private CANSparkMax right_1;
  private CANSparkMax right_2;

  private Joystick stick;

  public Drive()
  {
  
    left_1 = new CANSparkMax(Constants.DRIVE_MOTOR_L1, MotorType.kBrushless);
    left_2 = new CANSparkMax(Constants.DRIVE_MOTOR_L2, MotorType.kBrushless);
    right_1 = new CANSparkMax(Constants.DRIVE_MOTOR_R1, MotorType.kBrushless);
    right_2 = new CANSparkMax(Constants.DRIVE_MOTOR_R2, MotorType.kBrushless);

    stick = new Joystick(0);

  }

  @Override
  public void periodic()
  {
  
    double power = stick.getRawAxis(3) - stick.getRawAxis(2);

    left_1.set(power);
    left_2.set(power);
    right_1.set(-power);
    right_2.set(-power);
    //left_1.set(power, ControlMode.PercentOutput); Talon SRX
  
  }

  public void stop()
  {

    left_1.set(0.0);
    left_2.set(0.0);
    right_1.set(0.0);
    right_2.set(0.0);

  }

}