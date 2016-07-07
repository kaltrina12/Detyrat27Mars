package ushtrime2;
import javax.swing.*;
public class prodhimi {
	public int pro(int x, int y)
	{ int total = 1;
	if ( x <= y )
	{ total = x;
	int count = x;
	while ( count != y )
	
	{ count = count + 1;
	total = total * count;
	}
	
	}
	return total;
	}
	public static void main(String[]args)
	{
		prodhimi k=new prodhimi();
		String s=JOptionPane.showInputDialog("shkruani nje numer jonegativ ");
		int s1=new Integer(s).intValue();
		String w=JOptionPane.showInputDialog("shkruani nje numer tjeter  jonegativ ");
		int w1=new Integer(w).intValue();
		JOptionPane.showMessageDialog(null, "prodhimi iterrativ i numrave  "+s1 +" dhe "+ w1 +" eshte "+ k.pro(s1,w1));
	}

}
