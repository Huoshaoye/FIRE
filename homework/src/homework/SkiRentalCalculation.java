package homework;

import javax.swing.JOptionPane;

public class SkiRentalCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double charge = 0;
		double SALESTAX = 0.075;
		int unit = 0;
		String numberOfSkiCustomers =JOptionPane.showInputDialog("Enter the number of ski customers in whole number, e.g., 3");
		int n = Integer.parseInt(numberOfSkiCustomers);
		String[] skiCustomersArray = new String[n];
		for(int i = 0 ; i<n;i++)
		{
			
			boolean firsttimeuser = true;
			boolean discountcoupn = true;
			boolean Member = true;
			String name = JOptionPane.showInputDialog("enter the name, e.g., Firstname lastname");
			try
			{
			String numberofrentalunit =  JOptionPane.showInputDialog("The number of the rental units for the ski customer( 0, 1, 2, and 3).");
			unit = Integer.parseInt(numberofrentalunit);
			}
			catch(Exception a)
			{
				JOptionPane.showMessageDialog(null , "Please enter 0/1/2/3 to show that rental units");
				return;
				}
				
			 String user = JOptionPane.showInputDialog("Are you the first time user?"+"  "+"yes or no");
				if("yes".equals(user))
					firsttimeuser = true;
				else if("no".equals(user))
					firsttimeuser = false;
				else
					{
					JOptionPane.showMessageDialog(null, "Error");
					return;
					}
			String discountcoupon = JOptionPane.showInputDialog("Do you have a discount coupon? yes or no");
			  if("yes".equals(discountcoupon))
			   discountcoupn = true;
			  else if("no".equals(discountcoupon))
				discountcoupn = false;
			  else
				  {
				  JOptionPane.showMessageDialog(null, "Error! Please enter yes or no");
				  return;
				  }
				
			  String membershipcard = JOptionPane.showInputDialog("Do you have a membership?   yes or no");
			  if("yes".equals(membershipcard))
				  Member = true;
			  else if ("no".equals(membershipcard))
				  Member = false;
			  else
			  {
				  JOptionPane.showMessageDialog(null, "Error!");
				  return;
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
			else
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
			
			name = name + ", " +charge;
	/*		skiCustomersArray[n]= name;
			String row = null;
			for(int a = 0; a < skiCustomersArray.length; a++)
			{
			 row = row + skiCustomersArray[a];
				
			}*/
			JOptionPane.showMessageDialog(null,name );
		}
		
			  
	}
			
}


