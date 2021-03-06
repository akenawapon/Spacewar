package OOP1;


import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip extends Sprite{

	int step = 8;
	
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.RED);
		g.fillRect(x, y-8, width, height);
		g.fillRect(x+20,y-8,width-10,height+5);
		g.fillRect(x-10,y-8,width-10,height+5);
		g.fillRect(x+5,y-20,width-10,height+10);
		g.fillRect(x+20,y+8,width-10,height+5);
		g.fillRect(x-10,y+8,width-10,height+5);
		
	}

	public void move(int directionx,int directiony){
		x += (step * directionx);
		if(x < 0)
			x = 0;
		if(x > 400 - width)
			x = 400 - width;
		y += (step * directiony);
		if(y < 0)
			y = 0;
		if(y > 600 - height)
			y = 600 - height;
	}



}
