public class Line_comparison_UC2
{
	public static void main(String [] args)
	{
		int x1=5;
		int x2=13;
		int y1=6;
		int y2=12;

		int x3=3;
		int x4=6;
		int y3=4;
		int y4=8;
		double length1;
		double length2;
		length1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		length2=Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));

			if(length1==length2)
			{
				System.out.println("Length of the Line is Equal ");
			}
			else
			{
				System.out.println("Length of the Line is Not Equal ");

			}
	}
}
