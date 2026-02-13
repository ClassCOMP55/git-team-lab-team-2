import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

public class SimplePicture extends GraphicsProgram {
	private static final String IMAGE_FILENAME = "robot.png";
	public static int SIZE = 700;
	
	public void init() {
		setSize(SIZE, SIZE);
	}
	
	public void run() { //Runs the program
		GImage robot = new GImage(IMAGE_FILENAME, 400, 100);
		add(robot);
		GLabel label = new GLabel("How I feel when using github!", 200, 400);
		add(label);
	}

	public static void main(String[] args) {
		new SimplePicture().start();
	}
}