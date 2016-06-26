package physicsLand;

import java.awt.Rectangle;
import java.util.ArrayList;

import engine.backend.graphics.GameObject;
import engine.frontend.graphics.Renderable;
import engine.frontend.graphics.RenderableOval;

public class RigidBody implements GameObject {

	private Vector position;
	private Vector velocity;
	
	public RigidBody(Vector position) {
		this.position = position;
		velocity = new Vector(0,0);
	}
	
	public ArrayList<Renderable> render() {
		RenderableOval oval = new RenderableOval(position.getX(),position.getY(),10,10);
		ArrayList<Renderable> toRender = new ArrayList<Renderable>();
		toRender.add(oval);
		return toRender;
	}

	public void update() {
		position.setX(position.getX()+velocity.getX());
		position.setY(position.getY()+velocity.getY());
	}
	
	public Rectangle getCollisionArea(){
		return new Rectangle((int)(position.getX()+velocity.getX()+32),(int)(position.getY()+velocity.getY()+32),32,32);
	}
	
	public boolean willCollide(Rectangle other){
		return this.getCollisionArea().intersects(other);
	}
	
	public void setVelocity(Vector v){
		velocity.setX(v.getX());
		velocity.setY(v.getY());
	}
	
	/**
	 * This method makes things bouncy
	 * @param collisionDirection the direction the other vector was traveling in
	 */
	public void collide(Vector collisionDirection){
		double angle = (Math.PI + collisionDirection.getPolarAngle()) % (Math.PI*2); 
		setVelocity(new Vector(angle, velocity.getMagnitude(), 420==69));
	}
}
