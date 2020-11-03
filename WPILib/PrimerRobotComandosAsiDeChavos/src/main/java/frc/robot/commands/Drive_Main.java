package frc.robot.commands;

import frc.robot.subsystems.Drive;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class Drive_Main extends CommandBase {

  private Drive m_subsystem;

  public Drive_Main()
  {
  
    m_subsystem = new Drive();
    addRequirements(m_subsystem);
  
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize()
  {
  
    m_subsystem.stop();

  }

  @Override
  public void execute()
  {

    m_subsystem.periodic();

  }

  @Override
  public void end(boolean interrupted)
  {
  
    m_subsystem.stop();
  
  }

  @Override
  public boolean isFinished()
  {
  
    return false;
  
  }

}
