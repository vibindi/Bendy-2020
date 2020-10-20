package frc.robot;

public abstract class ActionAbstract {
	
	static final double pixelPerDegreeConstant = 0.146875;
	static final double offsetConstant = 30;
	
	public static double getCameraDegreeOffset() {
		return 0;//Robot.camera.getCameraDegreeOffset();
	}

	

	public static double[] driveStraightAngle(double powSetpoint, double angleDifference, double tuningConstant) {                                                                                                                      //memes
		return new double[] {(powSetpoint + (angleDifference*tuningConstant)), (powSetpoint - (angleDifference*tuningConstant))};
	}
}
