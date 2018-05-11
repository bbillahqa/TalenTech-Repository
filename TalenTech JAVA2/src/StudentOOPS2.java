
public class StudentOOPS2 {

	public static void main(String[] args) {

		StudentOOPS1 mark = new StudentOOPS1();// Mark --> He is the object/instance

		mark.setID(1);
		mark.setName("Mark");
		mark.setAge(15);

		System.out.println(mark.getName() + " is " + mark.getAge() + " Years old");

		StudentOOPS1 tom = new StudentOOPS1();// Tom --> He is the object/instance

		tom.ID = 2;
		tom.name = ("Tom");
		tom.age = 14;

		System.out.println(tom.name + " is " + tom.age + " Years old");

	}

}
