package huowang;

import javax.swing.JOptionPane;

public class SkiRentalCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double charge = 0;
		double SALESTAX = 0.075;
		int unit = 0; 
		int a = 0;
		String message = null;
		String numberOfSkiCustomers =JOptionPane.showInputDialog("Enter the number of ski customers in whole number, e.g., 3");
		int n = Integer.parseInt(numberOfSkiCustomers);
		String[]skiCustomersArray = new String[n];
		for(int i = 0 ; i<n;i++)
		{
			
			boolean firsttimeuser = true;
			boolean discountcoupn = true;
			boolean Member = true;
			String name = JOptionPane.showInputDialog("enter the name, e.g., Firstname lastname");
			String numberofrentalunit =  JOptionPane.showInputDialog("The number of the rental units for the ski customer( 0, 1, 2, and 3).");
			try
			{
			unit = Integer.parseInt(numberofrentalunit);
			if(unit>3|| unit<0) {
				JOptionPane.showMessageDialog(null , "Please enter 0/1/2/3 to show that rental units");
				System.exit(0);
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null , "Please enter 0/1/2/3 to show that rental units");
				System.exit(0);
				}
				boolean loop1 = true;
				while(loop1)
				{
			 String user = JOptionPane.showInputDialog("Are you the first time user?"+"  "+"yes or no");
				if("yes".equals(user))
					{firsttimeuser = true;
				    break;    
				     }
				else if("no".equals(user))
					{firsttimeuser = false;
					break;
					}
				else
					{
					JOptionPane.showMessageDialog(null, "Please enter yes or no");
					 loop1 = true;
					}
				}
				boolean loop2 = true;
				while(loop2)
				{
			String discountcoupon = JOptionPane.showInputDialog("Do you have a discount coupon? yes or no");
			  if("yes".equals(discountcoupon))
			  { discountcoupn = true;
			  break;
			  }
			  else if("no".equals(discountcoupon))
				{
				  discountcoupn = false;
				  break;
				}
			  else
			  {
				  JOptionPane.showMessageDialog(null, "Error! Please enter yes or no");
				  loop2 = true;
			  }
				}
			  
				boolean loop3 = true;
				while(loop3)
				{	
			  String membershipcard = JOptionPane.showInputDialog("Do you have a membership?   yes or no");
			  if("yes".equals(membershipcard))
				  {
				  Member = true;
				  break;
				  }
			  else if ("no".equals(membershipcard))
			  {
				  Member = false;
				  break;
			  }
			  else
			  {
				  JOptionPane.showMessageDialog(null, "Error!");
				  loop3 = true;
			  }
			}
			  
			
			//calculating
			if (unit == 0) 
			{
			charge = 60;
			if(firsttimeuser)
				charge = charge * 0.9;
			if (Member)
				charge = charge* 0.95;
			if (discountcoupn)
				charge = charge - 5;
			charge= charge * (1+SALESTAX);
			}
			else if(unit >0)
			{
				if( unit ==1) charge = 110;
				else if( unit ==2) charge =155;
				else if( unit ==3) charge = 190;
				if(firsttimeuser)
					charge = charge * 0.88;
				if (Member)
					charge = charge* 0.92;
				if (discountcoupn)
					charge = charge - 10;
				charge = charge * (1+SALESTAX);
			}
		skiCustomersArray[a] = name+ ", " + String.format("%.2f", charge ) ;
		message += skiCustomersArray[a]+"\n";
		a++;
		}
		JOptionPane.showMessageDialog(null, message);
			  
	}
			
}


