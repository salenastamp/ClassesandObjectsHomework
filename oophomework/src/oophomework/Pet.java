package oophomework;

//create pet class and two constructors
public class Pet {
	private String name;
	private int age;
	private String location;
	private String type;

	public Pet() {
	}

	public Pet(String name, int age, String location, String type) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.type = type;
	}

//get methods for name, age, and type:
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getType() {
		return type;
	}

//set methods for name, age, and location
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}