
package ushtrime2;
import javax.swing.*;
public class mathDefinitions {
	private int i;
	private int sum;
	public int summation(int s)
	{
		while(i<=s)
		{
			sum=sum+i;
			i++;
		}
	return sum;
	}
	
	public static void main(String[]args)
	{
		mathDefinitions k=new mathDefinitions();
		int num=new Integer(JOptionPane.showInputDialog("shkruani nje numer termash : ")).intValue();
		JOptionPane.showMessageDialog(null, "shuma e "+ num+ " te pare eshte "+ k.summation(num));
	}
		
	
	

}
