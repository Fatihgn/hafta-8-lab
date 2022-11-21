package hafta8lab;

public interface Pet {
	public void play();
	default String getName() {
		return null;
	}
	default void setName() {
	}
	
	
	

}

