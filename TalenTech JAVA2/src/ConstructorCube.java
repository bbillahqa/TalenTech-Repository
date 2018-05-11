
public class ConstructorCube {

	int length;
	int width;
	int height;

	public int getCubeVolume() {
		return (length * width * height);
	}

	ConstructorCube() {
		length = 10;
		width = 20;
		height = 30;
	}
	ConstructorCube (int l,int b,int h) {
	length = l;
	width = b;
	height = h;
	}
}
