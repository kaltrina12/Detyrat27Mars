package ushtrime2;
import javax.swing.*;
public class sinusi {
	faktorieli k=new faktorieli();
	public double sinus(double x)
	{ double sin = x;
	int count = 3;
	while (count <= 19 )
    // sin == x - (x^3/3!) +...deri te...(x^(numeruesi-2)/(numeruesi-2)!)

	{ double d = Math.pow(x, count) / k.Faktoriel(count);
	if ( (count % 4) == 3 )
	{ sin = sin - d; }
	else { sin = sin + d; }
	count = count + 2;
	}
	return sin;
	}
	public static void main(String[]args)
	{
		sinusi s=new sinusi();
     String k=JOptionPane.showInputDialog("shkruani nje numer jo negativ");
		 int k1=new Integer(k).intValue();
       JOptionPane.showMessageDialog(null,"Sinusi i numrit "+ k1+" eshte "+ s.sinus(k1));
		
	}
	


}
