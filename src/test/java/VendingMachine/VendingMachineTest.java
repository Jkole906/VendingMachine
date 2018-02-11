package VendingMachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest
{
	private VendingMachine testVend;
	

	@Before
	public void setUp() throws Exception
	{
		InventoryReader inventoryReader = new InventoryReader();
		VendingMachine testVend = new VendingMachine(inventoryReader.generateInventory());
		DeliveryBin bin = new DeliveryBin();
	}

	@Test
	public void testNotNull()
	{
		
		assertNotNull(testVend.getInventory().get("A1").pop().getName());	
	}

	@Test
	public void feedMoney() {
		testVend.feedMoney(new BigDecimal ("1"));
		
		assertEquals(1.00, testVend.getBalance());
	}
	
	@Test
	public void getBalance() {
		testVend.setBalance(new BigDecimal ("1.00"));
		assertEquals("1.00", testVend.getBalance());
	}
	
	
}
