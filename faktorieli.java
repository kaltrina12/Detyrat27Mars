package ushtrime2;
import javax.swing.*;
public class faktorieli {
	  private long faktoriel = 1 ;
	   private long i = 1 ;
	   
	   public long Faktoriel(int number)
	   {
	   
	      while(i <= number)
	      {
	         faktoriel *= i;
	         i++;
	      }
	           
	      return faktoriel ;
	       
	   }
	   public static void main(String[] args)
	   {
	      faktorieli k =new faktorieli();
	      int number = new Integer(JOptionPane.showInputDialog("shkruani nje numer jonegativ")).intValue();
	      JOptionPane.showMessageDialog(null,  "Faktorieli i numrit " + number + " eshte  " + k.Faktoriel(number));
	   }

}
