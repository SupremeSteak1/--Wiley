package physicsLand;

import java.util.ArrayList;

import engine.backend.graphics.GameObject;
import engine.frontend.graphics.Renderable;
import engine.frontend.graphics.RenderableOval;

public class RigidBody implements GameObject {

	private Vector position;
	
	public RigidBody(Vector position) {
		this.position = position;
	}
	
	public ArrayList<Renderable> render() {
		RenderableOval oval = new RenderableOval(position.getX(),position.getY(),position.getMagnitude(),position.getMagnitude());
		ArrayList<Renderable> toRender = new ArrayList<Renderable>();
		toRender.add(oval);
		return toRender;
	}

	public void update() {
		position.setX(position.getX() + 1);
		position.setY(position.getY() + 1);
	}	
	
}
