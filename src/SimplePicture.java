import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.program.GraphicsProgram;

//Hi adding commit
//commit 2
public class SimplePicture extends GraphicsProgram {
	private static final String IMAGE_FILENAME = "robot.png";
	public static int SIZE = 700;
	//I love causing conflict
	public void init() {
		setSize(SIZE, SIZE);
	}
	//Worms time.
	public void run() { //Runs the program
		GImage robot = new GImage(IMAGE_FILENAME, 200, 200);
		add(robot);
		GLabel label = new GLabel("How I feel when I wasn't using github", 300, 300);
		add(label);
	} //Worms time

	public static void main(String[] args) {
		new SimplePicture().start();
	}
}