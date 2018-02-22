package huowang;

import javax.swing.JOptionPane;

public class zzz {
	public static void main(String[] args) {
        int n = 0;
		String numberOfSkiCustomers = JOptionPane.showInputDialog("Enter the number of ski customers in whole number,eg.,3");
		
		final double SALES_TAX_PERCENTAGE=0.075;
		
		try {
			n = Integer.parseInt(numberOfSkiCustomers);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error");
		}

		String[] skicustomersArray = new String[n];

		
		for (int counter = 0; counter < n; counter++) {
			int units=0;
			String customerName="";
			boolean firstTimeUserFlag=true;
			boolean memberShipFlag=true;
			boolean couponCodeFlag=true;
			
			String skicustomers =""; 
			double charge=0;
			try {
				 customerName = JOptionPane.showInputDialog("Enter your first name and last name");

			} catch (Exception a) {
				JOptionPane.showMessageDialog(null, "Error");
			}

			try {
				String units_str = JOptionPane.showInputDialog("Enter the rental units,eg.0,1,2,3");
				  units= Integer.parseInt(units_str);
			} catch (Exception b) {
				JOptionPane.showMessageDialog(null, "Error");
			}
				if (units>3||units<0){
					JOptionPane.showMessageDialog(null, "Error");
				}
			
			
				String firstTimeUser = JOptionPane.showInputDialog("Are you a first time user? Yes or No");
				if("Yes".equalsIgnoreCase(firstTimeUser)){
					firstTimeUserFlag = true;
				}else if("No".equalsIgnoreCase(firstTimeUser)){
					firstTimeUserFlag = false;
				}else{
					JOptionPane.showMessageDialog(null, "Error");
				}
				
				String couponCode=JOptionPane.showInputDialog("Do you have a discount coupon? Enter Yes or No");
				if("Yes".equalsIgnoreCase(couponCode)){
					couponCodeFlag = true;
				}else if("No".equalsIgnoreCase(couponCode)){
					couponCodeFlag = false;
				}else{
					JOptionPane.showMessageDialog(null, "Error");
				}
				
				String memberShip=JOptionPane.showInputDialog("Do you hava a membership? Enter Yes or No");
				if("Yes".equalsIgnoreCase(memberShip)){
					memberShipFlag = true;
				}else if("No".equalsIgnoreCase(memberShip)){
					memberShipFlag = false;
				}else{
					JOptionPane.showMessageDialog(null, "Error");
				}
			
			// calculate skicustomers
			if (units==0){
				charge = 60;
				if(memberShipFlag)
					charge=charge*0.95;
				if(firstTimeUserFlag)
					charge=charge*0.9;
				if(couponCodeFlag)
					charge=charge-5;
				
				charge= charge*(1+SALES_TAX_PERCENTAGE);}
				else{
					if(units==1) {
						charge=110;
					}
					else if(units==2){
						charge=155;
					}
					else {
						charge=190;
					}
					
					if(memberShipFlag)
						charge=charge*0.92;
					if(firstTimeUserFlag)
						charge=charge*0.88;
					if(couponCodeFlag)
						charge=charge-10;
					
					
					charge= charge*(1+SALES_TAX_PERCENTAGE);
					
				}
					
					
			
			skicustomers= customerName+", "+ charge;
			
			skicustomersArray[counter] = skicustomers;

		}
		String skicustomersArrayDisplay ="";
		for(int i =0;i<skicustomersArray.length;i++ ){
			skicustomersArrayDisplay=skicustomersArrayDisplay+skicustomersArray[i]+"\r\n";
		}
			
		System.out.println(skicustomersArray.toString());

	}

}
