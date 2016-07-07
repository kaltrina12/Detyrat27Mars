package ushtrime2;
import javax.swing.*;
public class kosinusi {
	faktorieli k=new faktorieli();
	public double cos(double x)
	{ double cos = x;
	int count = 2;
	while (count <= 20 )
    //cos(x) = 1 - (x^2/2!) + (x^4/4!) - (x^6/6!) + ... (x^20/20!)
	{ double d = Math.pow(x, count) / k.Faktoriel(count);
	if ( (count % 4) == 3 )
	{ cos = cos - d; }
	else { cos = cos + d; }
	count = count + 2;
	}
	return cos;
	}
	public static void main(String[]args)
	{
		 kosinusi d=new kosinusi();
       String s=JOptionPane.showInputDialog("shkruani nje numer jo negativ");
		 int s1=new Integer(s).intValue();
       JOptionPane.showMessageDialog(null,"kosinusi i numrit "+s1+ " eshte " +d.cos(s1));
      
	}
	


}
