package hw_9;

import javax.swing.*;
import java.awt.*;

public class Exercise extends JFrame {
	public Exercise() {
		setTitle("sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();    //�������� Container
		c.setLayout(new BorderLayout());
		
		NorthPanel n = new NorthPanel();
		n.add(new JButton("Open"));
		n.add(new JButton("Read"));
		n.add(new JButton("Close"));
		c.add(n, BorderLayout.NORTH);    //Container�� NorthPanel ����
		
		CenterPanel ce = new CenterPanel();
		JLabel j1=new JLabel("Java");
		j1.setBounds(30,150,30,10);
		ce.add(j1);    //CenterPanel�� ������Ʈ ����
		
		JLabel j2=new JLabel("Hello");
		j2.setBounds(100,20,30,10);
		ce.add(j2);    //CenterPanel�� ������Ʈ ����
		
		JLabel j3=new JLabel("Love");
		j3.setBounds(180,110,30,10);
		ce.add(j3);    //CenterPanel�� ������Ʈ ����
		
		c.add(ce, BorderLayout.CENTER);    //Container�� CenterPanel ����
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Exercise();
	}
}