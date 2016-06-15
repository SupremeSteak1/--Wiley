package main;

import java.util.ArrayList;

import engine.backend.graphics.Renderer;
import engine.frontend.graphics.Renderable;
import engine.frontend.graphics.RenderableText;

public class Main {
	
	public static void main(String[] args){
		Renderer r = new Renderer(800, 600);
		r.setLocationRelativeTo(null);
		r.setVisible(true);
		ArrayList<Renderable> renderQueue = new ArrayList<Renderable>();
		renderQueue.add(new RenderableText("AHHHHHH git commit -m", 20, 20));
		//GameObjectHandler.registerGameObject(new RigidBody(new Vector(0,0)));
		r.addToQueue(renderQueue);
		while(true) {
			r.setQueue(renderQueue);
			r.refreshQueue();
			//GameObjectHandler.updateGameObjects();
			//GameObjectHandler.renderGameObjects(r);
			r.repaint();
			r.validate();
			r.revalidate();
		}
	}
}
