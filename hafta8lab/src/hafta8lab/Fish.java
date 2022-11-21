package hafta8lab;

public class Fish extends Animal{

	private String name;
	public Fish(int legs) {
		super(legs);
	}
	public Fish(int legs, String name) {
		super(legs);
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void walk() {
		System.out.println("Balik yuzuyor");
	}
	public void play() {
		System.out.println(name+" turlu balık kuyrugunu salliyor");
	}
	

}
