package main;

import java.util.ArrayList;

import engine.backend.graphics.Renderer;
import engine.frontend.graphics.Renderable;
import engine.frontend.graphics.RenderableOval;

public class Main {
	
	public static void main(String[] args){
		Renderer r = new Renderer(800, 600);
		r.setLocationRelativeTo(null);
		r.setVisible(true);
		ArrayList<Renderable> renderQueue = new ArrayList<Renderable>();
		renderQueue.add(new RenderableOval(0,0,101,100));
		r.addToQueue(renderQueue);
		while(true) {
			r.setQueue(renderQueue);
			r.refreshQueue();
			r.repaint();
			r.validate();
			r.revalidate();
		}
	}
}
