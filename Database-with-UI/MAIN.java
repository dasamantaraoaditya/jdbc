package jdbc;
import javax.swing.*;
public class MAIN {

	public static void main(String[] args) {
			frame obj=new frame();//constructor call
			
			obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//for a normal close operation
			
			obj.setBounds(500,500,500,500);
			
			obj.setVisible(true);
			
			obj.database_connectivity();
	}
}
