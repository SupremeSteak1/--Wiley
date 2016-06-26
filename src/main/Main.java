package main;

import java.util.ArrayList;

import engine.backend.graphics.GameObjectHandler;
import engine.backend.graphics.Renderer;
import engine.frontend.graphics.Renderable;
import engine.frontend.graphics.RenderableText;
import physicsLand.RigidBody;
import physicsLand.Vector;

public class Main {
	
	public static void main(String[] args){
		Renderer r = new Renderer(800, 600);
		r.setLocationRelativeTo(null);
		r.setVisible(true);
		ArrayList<Renderable> renderQueue = new ArrayList<Renderable>();
		renderQueue.add(new RenderableText("AHHHHHH git commit -m", 20, 20));
		RigidBody rb = new RigidBody(new Vector(1,1));
		GameObjectHandler goh = new GameObjectHandler();
		goh.registerGameObject(rb);
		r.addToQueue(renderQueue);
		while(true) {
			r.setQueue(renderQueue);
			r.refreshQueue();
			goh.updateGameObjects();
			goh.renderGameObjects(r);
			r.repaint();
			r.validate();
			r.revalidate();
		}
	}
}
