package physicsLand;

public class Vector {

	private double x,y;
	
	public Vector(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double dotProduct(Vector other){
		return (this.x*other.getX()) + (this.y*other.getY());
	}

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	public double getMagnitude(){
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
}
