package huowang;

import javax.swing.JOptionPane;

public class checkpassword {

    public static boolean checkPsw(String s){
        char character ;
        int cLetter = 0;
        int cDigit = 0;
        int cSpecial = 0;
        //check num of password
        if (s.length()<=7){ 	
        	int option = JOptionPane.showConfirmDialog(null, "Invalid password, would you like try again");
		if (option!=JOptionPane.YES_OPTION) 
			System.exit(0);
		else
		{
			String s1 = JOptionPane.showInputDialog("enter your password");
			checkPsw(s1);
		}   
        }
        for(int i = 0; i<s.length();i++){
            character=s.charAt(i);
            if (Character.isLetter(character)==true){
                cLetter++;
            } else if (Character.isDigit(character)==true) {
                cDigit++;
            } else if (character=='%'||character=='&'||character=='#'){
                cSpecial++;
            }
        }
        //check digit num
        if(cDigit<2)
        {
        	int option = JOptionPane.showConfirmDialog(null, "Invalid password, would you like try again");
			if (option!=JOptionPane.YES_OPTION) 
				System.exit(0);
			else
			{
				String s1 = JOptionPane.showInputDialog("enter your password");
				checkPsw(s1);
			}
        }
        //check special signal
        if( cSpecial<=0 )
        { 
         	int option = JOptionPane.showConfirmDialog(null, "Invalid password, would you like try again");
			if (option!=JOptionPane.YES_OPTION) 
				System.exit(0);
			else
			{
				String s1 = JOptionPane.showInputDialog("enter your password");
				checkPsw(s1);
			}
        }
        //all pass
        int option = JOptionPane.showConfirmDialog(null, "valid password, would you like try again");
		if (option!=JOptionPane.YES_OPTION) 
			System.exit(0);
		else
		{
			String s1 = JOptionPane.showInputDialog("enter your password");
			checkPsw(s1);
		}
		return true;
    }

    public static void main(String[]args)
    {
        String password = JOptionPane.showInputDialog("enter your password");
        //isValidPassword(password);
        checkPsw(password);

    }
}
