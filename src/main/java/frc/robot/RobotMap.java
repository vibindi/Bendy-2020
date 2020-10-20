package frc.robot;

import edu.wpi.first.wpilibj.kinematics.DifferentialDriveKinematics;

public class RobotMap {

	//================= CAN IDs =================
	
	//these don't do anything, but are here so we don't accidentally use their IDs
	public static final int PDP = 0;
	


	public static final int REAR_RIGHT = 1;  //encoder on this talon
	public static final int REAR_LEFT = 12; // 10 actually, get pranked 
	public static final int FRONT_RIGHT = 2; 
	public static final int FRONT_LEFT = 11; //encoder on this talon
	
	public static final boolean FRONT_LEFT_INV = true;
	public static final boolean FRONT_RIGHT_INV = true;
	public static final boolean REAR_LEFT_INV = true;
	public static final boolean REAR_RIGHT_INV = true;
	
	public static final int CLIMBER_PDP_CHANNEL = 13;
	public static final int CLIMBER_ID = 3; 
	public static final int CLIMBER_SLAVE_ID = 4;
	public static final boolean CLIMBER_INV = false;
	public static final int CLIMBER_CLIMB_BUTTON = 2; //runs in OI.rBtn[CLIMBER_CLIMB_BUTTON];
	
	public static final int INTAKE_ID = 5;
	public static final boolean INTAKE_INV = false;
	
	//public static final int SHOOTER_ID = 8;
	//public static final int SHOOTER_SLAVE_ID = 9;
	//public static final boolean SHOOTER_INV = true;
	//public static final boolean SHOOTER_SLAVE_INV = true; 
	
	public static final int NACRAC_ID = 7;
	public static final boolean NACRAC_INV = true;
	
	public static final int INDEXER_ID = 6;
	public static final boolean INDEXER_INV = false;
	
	public static final int AGITATOR_ID = 12;
	public static final boolean AGITATOR_INV = true;


	// FROM ROBOT CHARACTERIZATION \\
	public static final double ksVolts = 0.843; 	//0.843				
	public static final double kvVoltSecondsPerMeter = 0.915; //0.915	
	public static final double kaVoltSecondsSquaredPerMeter = 0.25; // characterization - 0.252
	public static final double kTrackWidthMeters = 0.7874;
	public static final DifferentialDriveKinematics kDriveKinematics = 
		new DifferentialDriveKinematics(kTrackWidthMeters);


		public static final int kEncoderCPR = 2350;
		public static final double kWheelDiameterMeters = 0.1016;
		public static final double kEncoderConstant =
			(kWheelDiameterMeters * Math.PI) / (double) kEncoderCPR;


}
