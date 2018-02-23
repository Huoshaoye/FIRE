package huowang;

import javax.swing.JOptionPane;

public class Password {
	public static boolean checkPsw(String s){
        char character ;
        int cDigit = 0;
        int cSpecial = 0;
        int temp = 0;
        //判断密码位数
        if (s.length()<=7){
            return false;
        }
        for(int i = 0; i<s.length();i++){
            character=s.charAt(i);
            if (Character.isLetter(character)==true){
            	
            }
            else if (Character.isDigit(character)==true) {
                cDigit++;
            } else if (character=='%'||character=='&'||character=='#'){
                cSpecial++;
            }
        }
        //判断字符的个数
        if(cDigit<2){
            return false;
        }
        //判断是否有其他特殊符号
        if(cSpecial==0)
        {   
        	return false;
        }
        //所有条件都通过,返回true
        return true;
    }

    public static void main(String[]args)
    {
      	boolean flag = true;
      	while(flag)
      	{
            String password = JOptionPane.showInputDialog("enter your password");
        //isValidPassword(password);
             checkPsw(password);
             boolean judge=checkPsw(password);
             JOptionPane.showMessageDialog(null, "Enter a string for password:"+password);
             if (judge = true)
             {
            	 	int option = JOptionPane.showConfirmDialog(null, "valid password, would you like try again");
            	 	if (option!=JOptionPane.YES_OPTION) 
            	 		System.exit(0);
            	 	else
       			{
       				flag = false;  
       			}
           }
           else 
           {
        	   	int option = JOptionPane.showConfirmDialog(null, "Invalid password, would you like try again");
   			if (option!=JOptionPane.YES_OPTION) 
   				System.exit(0);
   			else
   			{
   				flag = false; 
   			}
           }
 		}
     }
}








