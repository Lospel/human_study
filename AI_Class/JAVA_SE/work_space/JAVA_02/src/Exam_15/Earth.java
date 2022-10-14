package Exam_15;

public class Earth {
	static final double EARTH_RAIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RAIUS*EARTH_RAIUS;
	}
}
