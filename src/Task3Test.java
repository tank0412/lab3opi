import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task3Test {
public static boolean Check = false;
	@Test
	public void IsIncluded() {
    Task3.R = 10;
    Task3.mystack.push(new Double(10));
    Task3.mystack.push(new Double(10));
	Mark.Dojob();
	Check = Figura.Include();
	assertTrue(Check);

}
}
