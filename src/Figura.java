class Figura {	
public static boolean Include()
{
	boolean f1 = (Mark.X < 0) && (Mark.X > -Task3.R) && (Mark.Y > 0) && (Mark.Y < Task3.R / 2);
	boolean f2 = (Mark.X < 0) && (Mark.X > -Task3.R) && (Mark.Y < 0) && (Mark.Y > -Task3.R);
	boolean f3 = (Mark.Y < 0) && (Mark.Y > -Task3.R) && (Mark.X > 0) && (Mark.X < Task3.R);
	return f1 || f2 || f3;
}
}
