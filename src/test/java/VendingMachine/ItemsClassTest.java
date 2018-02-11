package VendingMachine;

import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import Items.ItemsClass;

public class ItemsClassTest
{
	
	private ItemsClass testItem;
	
	
	@Before
	public void setUp() throws Exception
	{
		
		testItem = new ItemsClass("Chips", new BigDecimal ("1.00"));		
	}

	@Test
	public void testNotNull()
	{
		assertNotNull();
	}

}
