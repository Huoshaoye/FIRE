import javax.swing.JOptionPane;

public class HWANGPA01 {

	public static void main(String[]args)
	{
	
		{
			JOptionPane.showMessageDialog(null, "Your Full name as: First name, Last name");
			String name = JOptionPane.showInputDialog("Your name");
			name = "name:" + name;
			 JOptionPane.showMessageDialog(null, name);
			JOptionPane.showMessageDialog(null, "Please enter your City and Country of birth"); 
			String city = JOptionPane.showInputDialog("City of Birth");
			JOptionPane.showMessageDialog(null, "city:" + city);
			String back = JOptionPane.showInputDialog("Please enter your academic background");
			JOptionPane.showMessageDialog(null, "academic background:"+back);
			String fun = JOptionPane.showInputDialog("Please enter something about yourself,"+"it can be information or a fun fact, fun facts may be shared with the class in the lecture");
			JOptionPane.showMessageDialog(null, fun);
		}
	}
}
