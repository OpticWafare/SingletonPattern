
public class King {

	public String name;
	
	private static King unserKoenig;
	
	private King() 
	{
	
	}
	
	public static King getInstance() 
	{
		if (unserKoenig == null)
		{
			unserKoenig = new King();
		}
	
		return unserKoenig;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String attack()
	{
		return name + " befiehlt : Wir greifen an!";
	}
	
	public String defend()
	{
		return name + " befiehlt: Wir ziehen uns zurück!";
	}
	
}
