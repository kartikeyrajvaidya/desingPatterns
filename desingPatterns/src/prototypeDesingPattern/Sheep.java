package prototypeDesingPattern;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("Sheep Is Made");
	}

	@Override
	public Animal makeCopy() {

		System.out.println("Copy Made");

		Sheep sheepObject = null;

		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		return sheepObject;

	}

	public String toString() {
		return "Printing Onject";
	}

}
