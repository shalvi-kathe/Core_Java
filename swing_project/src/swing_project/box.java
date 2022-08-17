package swing_project;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class box extends JFrame implements ActionListener{
	JRadioButton r1, r2;
	JButton btn;
	box()
	{
		r1=new JRadioButton("Male");
		r1.setBounds(300, 80, 100, 50);
		
		r2=new JRadioButton("Female");
		r2.setBounds(300, 150, 100, 50);
		
		btn=new JButton("Button");
		btn.setBounds(300, 250, 100, 30);
		btn.addActionListener(this);
		
		
		ButtonGroup bg =new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		add(r1);
		add(r2);
		add(btn);
		
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box b=new box();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(r1.isSelected())
		{
			JOptionPane.showMessageDialog(this,"This is Male");
			//Simple2 s=new Simple2();
			
		}
		if(r2.isSelected())
		{
			JOptionPane.showMessageDialog(this,"This is Female");
			//tarea ta=new tarea();
		}
		
	}

}
