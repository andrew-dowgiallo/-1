package org.usfirst.frc.team4.robot.subsystems;

import org.usfirst.frc.team4.robot.RobotMap;
//hello

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Pneumatics extends Subsystem {
    
	public static Compressor compressor = new Compressor(RobotMap.PNEUMATICS_COMPRESSOR);
	public static DoubleSolenoid leftArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_LEFT_FWD, 
			RobotMap.PNEUMATICS_ARM_LEFT_RWD);
	public static DoubleSolenoid rightArm = new DoubleSolenoid(RobotMap.PNEUMATICS_ARM_RIGHT_FWD,
			RobotMap.Pneumatics_ARM_RIGHT_RWD);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void compressorStart() {
    	compressor.start();
    }
    public void compressorStop() {
    	compressor.stop();
    }
    public void rightArmopen () {
    	rightArm.set(DoubleSolenoid.Value.kForward);
    }
    public void rightArmclose () {
    	rightArm.set(DoubleSolenoid.Value.kReverse);
    }
    public void leftArmopen () {
    	leftArm.set(DoubleSolenoid.Value.kForward);
    }
    public void leftArmclose() {
    	leftArm.set(DoubleSolenoid.Value.kReverse);
    }
    public void bothArmsNeutral(){
    	leftArm.set(DoubleSolenoid.Value.kOff);
    	rightArm.set(DoubleSolenoid.Value.kOff);
    }
    public void rightArmOff(){
    	rightArm.set(DoubleSolenoid.Value.kOff);
    }
    public void leftArmOff(){
    	leftArm.set(DoubleSolenoid.Value.kOff);
    }
}
