import java.awt.Rectangle;

public class dumpArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2; 
		Rectangle r = new Rectangle(); 
		Boolean b= false; 
		double d = 23.45; 
		Object f = null; 
		
		
		Object[] arr = new Object[5]; 
		arr[0] = i; 
		arr[1] = r; 
		arr[2] = b; 
		arr[3] = f;
		arr[4] = d;
		
		dumparray(arr);	
	}


static void dumparray(Object[] o)
{
	for(int i = 0; i<o.length; i++)
	{	
		if(o[i]!= null)
		{	System.out.println(o[i].toString());}
		else
		{
			System.out.println("null");
		}
	}	
}












}
