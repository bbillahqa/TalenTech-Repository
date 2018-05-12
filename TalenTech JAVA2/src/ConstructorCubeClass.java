
public class ConstructorCubeClass {

	public static void main(String[] args) {
		ConstructorCube cube1 = new ConstructorCube();
		 
		System.out.println(cube1.getCubeVolume());
		
		ConstructorCube cube2 = new ConstructorCube(20,20,20);
		
		System.out.println(cube2.getCubeVolume());
	}

}
