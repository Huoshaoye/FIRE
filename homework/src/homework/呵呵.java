package homework;

import javax.swing.JOptionPane;

class 呵呵 
{
	public static boolean isValidPassword(String s)
	{	
		char character;
		boolean password= true;
		if (s.length()>7 )
		{
			for(int i= 0;i<s.length();i++)
			{
				character=s.charAt(i);
				if (Character.isLetter(character)==true)
					password = true;
				else if (Character.isDigit(character)==true)
					password = true;
				else if (character=='%'||character=='&'||character=='#')
					password = true;
				else
				{
					password = false;
					JOptionPane.showMessageDialog(null, "invalidpassword");
					return password;
				}
					
			}
			JOptionPane.showMessageDialog(null, "valid password");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "invalidpassword");
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
