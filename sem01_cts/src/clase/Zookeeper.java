package clase;

public class Zookeeper {
	private String name;
	
	public void feed(Animal animal)
	{
		System.out.println(name+" hraneste animalul "+animal.getName());
	}
	
	public Zookeeper(String name) {
		super();
		this.name = name;
	}
	
	public Zookeeper() {
		super();
		this.name = "dorel";
	}
	
}
