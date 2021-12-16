package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
// Add relevant imports


public class Intake extends SubsystemBase {
    // FIXME add code for an intake
    // Example subsystem for an intake system
    
    /** Notice that the subsystem hides the presence of the DoubleSolenoid from outside code (it is declared private)
     * instead publicly exposes two higher-level, descriptive robot actions: grabHatch() and releaseHatch(). 
     * It is extremely important that “implementation details” such as the double solenoid be “hidden” in this manner; 
     * this ensures that code outside the subsystem will never cause the solenoid to be in an unexpected state. 
     * It also allows the user to change the implementation (for instance, a motor could be used instead of a pneumatic) without any of the code outside of the subsystem having to change with it. */

    /**   private final DoubleSolenoid m_hatchSolenoid =
      new DoubleSolenoid(HatchConstants.kHatchSolenoidModule, HatchConstants.kHatchSolenoidPorts[0],
                         HatchConstants.kHatchSolenoidPorts[1]);
        */

    public void IntakeIn(){
        // m_somemotor.set(kForward);
    }

    public void IntakeOut() {
        // m_somemotor.set(kReverse);
    }

    @Override
    public void periodic() {
    // This method will be called once per scheduler run

    }
    /**“Default commands” are commands that run automatically whenever a subsystem is not being used by another command.

Setting a default command for a subsystem is very easy; one simply calls CommandScheduler.getInstance().setDefaultCommand(), or, more simply, the setDefaultCommand() method of the Subsystem interface: */
// CommandScheduler.getInstance().setDefaultCommand(exampleSubsystem, exampleCommand);


}