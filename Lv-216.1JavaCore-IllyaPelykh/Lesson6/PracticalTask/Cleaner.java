package lesson6;

public class Cleaner extends Staff {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cleaner(TYPE_PERSON type, String name) {
		super(type);
		setName(name);
		System.out.println(type + " name " + getName() + " created...");
	}

	@Override
	public void print() {
		super.print();
		System.out.println(TYPE_PERSON.Cleaner + " and my name is " + getName());

	}

	@Override
	public void salary() {
		System.out.println(TYPE_PERSON.Cleaner + " name " + getName() + " getting a salary now");

	}

}
