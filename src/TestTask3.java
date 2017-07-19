import static org.junit.Assert.*;

import org.junit.Test;

public class TestTask3 {
public static boolean Check_1, Check_2, Check_3 = false;

	@Test
	public void test() {
		Task3.R = 10;
		Task3.mystack.push(new Double(-7));
	    Task3.mystack.push(new Double(4));
		Mark.Dojob();
		Check_1 = Figura.Include();
		
		Task3.mystack.push(new Double(-7));
	    Task3.mystack.push(new Double(-9));
		Mark.Dojob();
		Check_2 = Figura.Include();
		
		Task3.mystack.push(new Double(9));
	    Task3.mystack.push(new Double(-7));
		Mark.Dojob();
		Check_3 = Figura.Include();
		
        if(Check_1 == true & Check_2 == true & Check_3 == true )
        	return;
	}

}
