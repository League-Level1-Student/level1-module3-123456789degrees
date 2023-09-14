package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    static int x = 300;
    static int y = 370;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0,0,255);
    	fill(0, 255, 0);
    	ellipse(x, y, 50, 50);
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
            	if (y > 2) {
            		y--;
            	}
            }
            else if(keyCode == DOWN)
            {
            	if (y < 369) {
            		y++;
            	}
            }
            else if(keyCode == RIGHT)
            {
            	if (x < 299) {
            		x++;
            	}
            }
            else if(keyCode == LEFT)
            {
            	if (x > 2) {
            		x--;
            	}
            }
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
