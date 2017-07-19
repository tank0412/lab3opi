import static org.junit.Assert.*;

import org.junit.Test;

public class TestTask3 {
public static boolean Check = false;

	@Test
	public void test() {
		Task3.R = 10;
		Task3.mystack.push(new Double(-7));
	    Task3.mystack.push(new Double(4));
		Mark.Dojob();
		Check = Figura.Include();
		assertTrue(Check);
	}

}
