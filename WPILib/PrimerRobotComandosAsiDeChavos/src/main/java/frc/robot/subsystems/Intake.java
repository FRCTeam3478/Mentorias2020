package frc.robot.subsystems;

import com.revrobotics.CANDigitalInput;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANDigitalInput.LimitSwitch;
import com.revrobotics.CANDigitalInput.LimitSwitchPolarity;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase
{
  
  private CANSparkMax roller;
  private CANDigitalInput limit_switch;

  private Joystick stick;

  public Intake()
  {

    roller = new CANSparkMax(Constants.INTAKE_MOTOR, MotorType.kBrushless);
    limit_switch = new CANDigitalInput(roller, LimitSwitch.kForward, LimitSwitchPolarity.kNormallyClosed);

    stick = new Joystick(1);

  }

  @Override
  public void periodic()
  {
    
    double power = 0.0;
  
    if (stick.getRawButton(1) && limit_switch.get())
    {

      power = 0.75;

    }

    roller.set(power);

  }

  public void stop()
  {

    roller.set(0);

  }

}
