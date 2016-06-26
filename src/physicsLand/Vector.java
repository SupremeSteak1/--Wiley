package physicsLand;

public class Vector {

	private double x,y;
	
	public Vector(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public Vector(double angle, double magnitude, boolean polar){
		this.x = Math.cos(angle) * magnitude;
		this.y = Math.sin(angle) * magnitude;
	}
	
	/**
	 * This function allows for the dot product of two vectors
	 * to be calculated
	 * @param other the vector to be dotted with
	 * @return the value of the dot product
	 */
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
	
	public double getPolarAngle(){
		if(x==0) return Math.PI/2 + y>0 ? Math.PI:0;
		return Math.atan(y/x);
	}
	
	/**
	 * This method calculates the magnitude of a vector
	 * @return the magnitude of the vector
	 */
	public double getMagnitude(){
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	
}
