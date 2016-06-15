package engine.frontend.graphics;
import java.awt.Graphics2D;

/**
 * 
 * @author Thomas Hayden
 * @version 6/02/16
 */
public class RenderableOval implements Renderable {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	/**
	 * A RenderableOval is a class which will render an oval to the screen
	 * @param x the x coordinate of the oval
	 * @param y the y coordinate of the oval
	 * @param width the width of the oval
	 * @param height the height of the oval
	 */
	public RenderableOval(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * A RenderableOval is a class which will render an oval to the screen
	 * @param x the x coordinate of the oval
	 * @param y the y coordinate of the oval
	 * @param width the width of the oval
	 * @param height the height of the oval
	 */
	public RenderableOval(double x, double y, double width, double height) {
		this.x = (int) Math.round(x);
		this.y = (int) Math.round(y);
		this.width = (int) Math.round(width);
		this.height = (int) Math.round(height);
	}
	
	/**
	 * Render the oval to the screen using the given graphics object
	 */
	public void render(Graphics2D g2d) {
		g2d.drawOval(x, y, width, height);
	}
}
