package swing02chp05;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Swing2 {
	private static void createGUI()
	{
		// JFrame指一个窗口，构造方法的参数为窗口标题
		// 语法：因为MyFrame是JFrame的子类，所以可以这么写
		JFrame frame = new MyFrame("Swing Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// 设置窗口的其他参数，如窗口大小
		frame.setSize(500, 300);
		
		// 显示窗口
		frame.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				createGUI();
			}
		});
	}

}
