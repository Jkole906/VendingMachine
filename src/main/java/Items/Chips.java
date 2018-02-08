package Items;

import java.math.BigDecimal;

public class Chips extends ItemsClass
{
	
	public String sound = "Crunch Crunch, Yum!";


	public Chips(String name, BigDecimal price)
	{
		super(name, price);
		// TODO Auto-generated constructor stub
	}


	public String getSound()
	{
		return sound;
	}

}
