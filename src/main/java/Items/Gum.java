package Items;

import java.math.BigDecimal;

public class Gum extends ItemsClass
{
	
	public String sound = "Chew Chew, Yum!";


	public Gum(String name, BigDecimal price)
	{
		super(name, price);
		// TODO Auto-generated constructor stub
	}


	public String getSound()
	{
		return sound;
	}

}
