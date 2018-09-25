
public class main {

	public static void main(String[] args) {
		
		King Karl = King.getInstance();
		
		Karl.setName("Karl V");
		
		//System.out.println(Karl.attack());
		
		King Ludwig = King.getInstance();
		
		Ludwig.setName("Ludwig XIV");
		
		System.out.println(Ludwig.attack());
		System.out.println(Karl.defend());
	}
}
