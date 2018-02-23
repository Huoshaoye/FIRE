package huowang;

import javax.swing.JOptionPane;

public class HW 
{
	
		public static boolean isValidPassword(String s)
		{	
			char character;
			int count =0;
			boolean password= true;
			if (s.length()>7 )
			{
				for(int i= 0;i<s.length();i++)
				{
					character=s.charAt(i);
					if (Character.isLetter(character)==true)
						password = true;
					else if (Character.isDigit(character)==true)
					{    
						count++;
					}
					else if (character=='%'||character=='&'||character=='#')
						password = true;
					else
					{
                        int option = JOptionPane.showConfirmDialog(null, "Invalid password, would you like try again");
						if (option!=JOptionPane.YES_OPTION) 
							System.exit(0);
						else
						{
							String s1 = JOptionPane.showInputDialog("enter your password");
							isValidPassword(s1);
						}
							
					}		
				}
			   if (count<2)
			   {
				   int option = JOptionPane.showConfirmDialog(null, "Invalid password, would you like try again");
					if (option!=JOptionPane.YES_OPTION) 
						System.exit(0);
					else
					{
						String s1 = JOptionPane.showInputDialog("enter your password");
						isValidPassword(s1);
					}
			   }
			   else if(count >=2)
				{
					int option = JOptionPane.showConfirmDialog(null, "valid password, would you like try again");
					if (option!=JOptionPane.YES_OPTION) 
						System.exit(0);
					else
					{
						String s1 = JOptionPane.showInputDialog("enter your password");
						isValidPassword(s1);
					}
				}	
			}
			return password;
		}
		public static void main(String[]args)
		{
			String password = JOptionPane.showInputDialog("enter your password");
			isValidPassword(password);
			
		}
}


