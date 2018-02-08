package Items;

import java.math.BigDecimal;

public class Candy extends ItemsClass
{
	
	public String sound = "Munch Much, Yum!";


	public Candy(String name, BigDecimal price)
	{
		super(name, price);
		// TODO Auto-generated constructor stub
	}


	public String getSound()
	{
		return sound;
	}

}
