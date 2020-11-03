package frc.robot.subsystems;

import com.revrobotics.CANDigitalInput;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANDigitalInput.LimitSwitch;
import com.revrobotics.CANDigitalInput.LimitSwitchPolarity;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Lifter extends SubsystemBase {
  
  private CANSparkMax lifter1;
  private CANSparkMax lifter2;

  private CANDigitalInput limit_arriba;
  private CANDigitalInput limit_abajo;

  private Joystick stick;

  public Lifter()
  {

    lifter1 = new CANSparkMax(Constants.LIFT_1, MotorType.kBrushless);
    lifter2 = new CANSparkMax(Constants.LIFT_2, MotorType.kBrushless);

    lifter2.follow(lifter1, true);

    limit_arriba = new CANDigitalInput(lifter1, LimitSwitch.kForward, LimitSwitchPolarity.kNormallyClosed);
    limit_abajo = new CANDigitalInput(lifter1, LimitSwitch.kReverse, LimitSwitchPolarity.kNormallyClosed);

  }

  @Override
  public void periodic() {

    double power = stick.getRawAxis(5);

    if (!limit_arriba.get() && power > 0.0)
    {

      power = 0.0;

    }

    else if (!limit_abajo.get() && power < 0.0)
    {

      power = 0.0;

    }

    lifter1.set(power);
  
  }

  public void moverArriba()
  {

    double power = 1.0;

    if (!limit_arriba.get() && power > 0.0)
    {

      power = 0.0;

    }

    lifter1.set(power);

  }

  public void stop()
  {

    lifter1.set(0.0);

  }

}
