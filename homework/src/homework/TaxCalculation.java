package homework;

import javax.swing.JOptionPane;

public class TaxCalculation {

		public static void main(String[]args) 
		{
		  double T = 0 ;
		  boolean loop=true;
		  while(loop) 
			{
			JOptionPane.showMessageDialog(null," enter how many people you want?");//input people
			String num = JOptionPane.showInputDialog("number of people:");
			int n = Integer.parseInt(num);
			for(int x = 1; n >= x ;x++) // for loop (N people input)
			{
				JOptionPane.showMessageDialog(null, "which status? single/married"); //output status
				String status = JOptionPane.showInputDialog("Your status(0 for single/1 for married)");
				int a = Integer.parseInt(status);// define status
				switch (a)
				{
				// single tax
				case 0:
				{
					JOptionPane.showMessageDialog(null, "enter your income");
				    String income = JOptionPane.showInputDialog("Your income:");
				    double i = Double.parseDouble(income);
				    if ( i < 8351)
					{
					    T = i* 0.1;
					}
					else if ( i < 33951 )
					{
					    T = ( i - 8350 )*0.15+8350*0.1;
					}
					else if ( i<82251 )
					{
					    T = (i- 33950)*0.25+(33950-8350)*0.15+8350*0.1;
					}
					else if ( i<171551 )
					{
					    T = (i- 82250)*0.28+(82250- 33950)*0.25+(33950-8350)*0.15+8350*0.1;
					}
					else if ( i<372951 )
					{
					    T =(i-171550)*0.33+ (171550- 82250)*0.28+(82250- 33950)*0.25+(33950-8350)*0.15+8350*0.1;
					}
					else if (i>=372951)
					{
					    T =(i-372950)*0.35+(372950-171550)*0.33+ (171550- 82250)*0.28+(82250- 33950)*0.25+(33950-8350)*0.15+8350*0.1;
					}
				    JOptionPane.showMessageDialog(null, "income="+ income + "\nStatus(0:single;1:married)="+ status + "\nTAX="+T);
				}
				
				loop= false;
				  break;
				  // married tax
				  case 1:
				  {
				JOptionPane.showMessageDialog(null, "enter your income");
				String income = JOptionPane.showInputDialog("Your income");
				double i = Double.parseDouble(income);
				if (i <16701)
				{
				T = i* 0.1;
				}
				else if ( i<67901 )
				{
				T = (i-16700)*0.15+16700*0.1;
				}
				else if ( i<137051 )
				{
				T = (i- 67900)*0.25+(67900-16700)*0.15+16700*0.1;
				}
				else if ( i<208851 )
				{
				T = (i- 137050)*0.28+(137050- 67900)*0.25+(67900-16700)*0.15+16700*0.1;
				}
				else if ( i<372951 )
				{
		 		T =(i-208850)*0.33+ (208850- 137050)*0.28+(137050- 67900)*0.25+( 67900-16700)*0.15+16700*0.1;
				}
				else if (i>=372951)
				{
				T =(i-372950)*0.35+(i-208850)*0.33+ (208850- 137050)*0.28+(137050- 67900)*0.25+( 67900-16700)*0.15+16700*0.1;
				}
				JOptionPane.showMessageDialog(null, "income="+ income + "\nStatus(0:single;1:married)="+ status + "\nTAX="+T);
			     }
				  
				loop = false;
				  break;
				  // except wrong number for status.
				  default:
				  {
					JOptionPane.showMessageDialog(null, "enter 0 (for single)or 1(for married)");
				loop = true;
				  }
				}
			 } 
		   }
		}
	}

