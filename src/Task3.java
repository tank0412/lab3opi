import java.util.*;

public class Task3 {
public static float R;
public static boolean Check_R_State = false;
public static Stack mystack = new Stack();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1)
		{
		System.out.println("Enter R as command-line argument");
		return;
		}
		
		Scanner scanner = new Scanner(args[0]);
		scanner.useLocale(Locale.US);
		 while (scanner.hasNext()) {
			   if (scanner.hasNextFloat()) {
			   R = scanner.nextFloat();
			   Check_R_State= true;
			   }
			   else
				   Check_R_State = false;
		 }	 
    scanner.close();
    mystack.push(new Double(0));
    mystack.push(new Double(0));
    
    mystack.push(new Double(2));
    mystack.push(new Double(3));
    
    mystack.push(new Double(3));
    mystack.push(new Double(-5));
    
    mystack.push(new Double(-4));
    mystack.push(new Double(-3));
    
    mystack.push(new Double(4));
    mystack.push(new Double(5));
    
    mystack.push(new Double(-4.666));
    mystack.push(new Double(4));
    
    mystack.push(new Double(1));
    mystack.push(new Double(-2));
    
    mystack.push(new Double(-3));
    mystack.push(new Double(-3));
    
    for(int i = 0; i < 8; ++ i) {
    	{
    		Mark.Dojob();
    		if(Figura.Include())
    		{
    	    System.out.print("Point (" + Mark.X + "; " + Mark.Y + ")");
    		System.out.println(" included");
    		}
    		/*
    		else
    		{
    		System.out.println(" not included");
    		}
    		*/

    }
    }
	}
}
