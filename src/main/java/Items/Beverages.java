package Items;

import java.math.BigDecimal;

public class Beverages extends ItemsClass
{

	public String sound = "Glug Glug, Yum!";

	public Beverages(String name, BigDecimal price)
	{
		super(name, price);
	}

	public String getSound()
	{
		return sound;
	}

}
