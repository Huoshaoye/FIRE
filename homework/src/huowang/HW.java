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
						JOptionPane.showMessageDialog(null, "invalidpassword");
						password = false;
						return password;
					}		
				}
			   if (count<2)
			   {
			  JOptionPane.showMessageDialog(null, "invalid password");
			   return password;
			   }
			  JOptionPane.showMessageDialog(null, "valid password");
				
			}
			else
			{
				JOptionPane.showMessageDialog(null, "invalid password");
				return password;
			}
			return password;
		}
		public static void main(String[]args)
		{
			String password = JOptionPane.showInputDialog("enter your password");
			isValidPassword(password);
			
		}
	}


