package basics.step1;

public class Vector {
	
	float rho;
	float theta;


	void translate(Point p) {
		
//		p.x += (int) (rho * Math.cos(theta));
//		p.y += (int) (rho * Math.sin(theta));
	      p.x = (int)(p.x + rho * Math.cos(theta));
	      p.y = (int)(p.y + rho * Math.sin(theta));
		
		
		
	}
	
	Point toPoint (Point origin) {
		
		origin.x += (int) (rho * Math.cos(theta));
		origin.y += (int) (rho * Math.sin(theta));
		return origin;			
	}
}
