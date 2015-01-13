package Opdracht_B12;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;

public abstract class GUI implements ActionListener
{
	protected JFrame frame = new JFrame();
	protected GridBagConstraints gbc = new GridBagConstraints();
	private Font font = new Font("Arial", Font.BOLD, 20);
	
	public GUI(int width, int height, String title, boolean resizable)
	{
		frame.setLayout(new GridBagLayout());
		gbc.insets = new Insets(5, 5, 5, 5);
		gbc.anchor = GridBagConstraints.WEST;
		
		frame.setVisible(false);
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setResizable(resizable);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}
	
	public GUI(int width, int height, String title)
	{
		this(width, height, title, false);
	}
	
	public void setVisible(boolean visible)
	{
		frame.setVisible(visible);
	}
	
	public boolean isVisible()
	{
		return frame.isVisible();
	}
	
	public void add(JComponent comp)
	{
		add(comp, false);
	}
	
	public void add(JComponent comp, boolean incr_y)
	{
		frame.add(comp, gbc);
		if (incr_y)
			gbc.gridy++;
		comp.setFont(font);
	}
}
