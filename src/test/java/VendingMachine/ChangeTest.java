package VendingMachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class ChangeTest
{	private Change testChange;

	@Before
	public void setUp() throws Exception
	{
		testChange = new Change();
	}
	
	@Test
	public void testChange() {
		assertNotNull(testChange);
	}

	@Test
	public void testMakeChange()
	{
		assertEquals("Your change is: 4 quarter(s), 0 dime(s), and 0 nicklel(s).", testChange.makeChange(new BigDecimal("1")));
	}
	
}
