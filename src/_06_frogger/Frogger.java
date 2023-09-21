package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
	class Car {
    	int x1;
    	int y1;
    	int size;
    	int speed;
    	public Car(int x2, int y2, int size, int speed) {
    		this.x1 = x2;
    		this.y1 = y2;
    		this.size = size;
    		this.speed = speed;
    	}
    	void display()
    	{
    	      fill(0,255,0);
    	      rect(x1 , y1, 50, size);
    	}
    	void driveLeft() {
    		x1 -= speed;
    		if (x1 <= 0) {
    			x1 = 600;
    		}
    	}
    	void driveRight() {
    		x1 += speed;
    		if (x1 >= 600) {
    			x1 = 0;
    		}
    	}
    	int getX() {
    		return x1;
    	}
    	int getY() {
    		return y1;
    	}
    	int getSize() {
    		return size;
    	}
    	
    }
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    static int x = 300;
    static int y = 370;
    Car car1 = new Car(10, 10, 40, 5);
    boolean intersects(Car car) {
    	 if ((y > car.getY() && y < car.getY()+50) && (x > car.getX() && x < car.getX()+car.getSize())) {
    		 return true;
    	 }
    	 else  {
    		 return false;
    	 }
    }
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
    	car1.display();
    	car1.driveRight();
    	car1.display();
    	if (intersects(car1)) {
    		x = 300;
    		y = 370;
    	}
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
            	if (y > 2) {
            		y-=10;
            	}
            }
            else if(keyCode == DOWN)
            {
            	if (y < 369) {
            		y+=10;
            	}
            }
            else if(keyCode == RIGHT)
            {
            	if (x < 599) {
            		x+=10;
            	}
            }
            else if(keyCode == LEFT)
            {
            	if (x > 2) {
            		x-=10;
            	}
            }
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
}
