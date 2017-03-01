/**
 * 
 */
package com.sl.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author shiyam
 *
 */
public class SampleFrame extends JFrame
{
    private static final long serialVersionUID = 1L;

    JPanel contentPanel = new JPanel(new GridBagLayout());

    JLabel redLabel1 = new JLabel("WED");

    JLabel redLabel2 = new JLabel("251217 Christmas Day");

    JLabel blackLabel1 = new JLabel("Doctor*,Doctor*");

    String day = "WED";
    
    String holiday = "251217 Christmas Day";
    
    String resOrService = "Doctor*, Doctor*";

    int widthDay = contentPanel.getFontMetrics(contentPanel.getFont()).stringWidth(day);

    int widthHoliday = contentPanel.getFontMetrics(contentPanel.getFont()).stringWidth(holiday);

    int widthResService = contentPanel.getFontMetrics(contentPanel.getFont()).stringWidth(resOrService);

    int abs = widthDay + widthHoliday + widthResService;

    public static void main(String[] args)
    {
	new SampleFrame().setUPGUI();
    }

    private void setUPGUI()
    {

	this.getContentPane().add(contentPanel);
	contentPanel.add(redLabel1, new GridBagConstraints(0, 0, 1, 0, 1, 0, GridBagConstraints.NORTH,
		GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
	contentPanel.add(redLabel2, new GridBagConstraints(1, 0, 1, 0, 1, 0, GridBagConstraints.CENTER,
		GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
	contentPanel.add(blackLabel1, new GridBagConstraints(2, 0, 1, 0, 1, 0, GridBagConstraints.EAST,
		GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
	setPreferredSize(new Dimension(500, 500));
	setSize(500, 500);
	setLocationRelativeTo(null);
	setTitle("Example For Panel and Label");

	String type = "Holiday";
	if (type.equals("Holiday"))
	{
	    redLabel1.setForeground(Color.RED);
	    redLabel2.setForeground(Color.RED);
	} else if (type.equals("Day Before Holdaiy"))
	{
	    redLabel1.setForeground(Color.RED);
	}

	redLabel1.setText(day);
	redLabel2.setText(holiday);
	blackLabel1.setText(resOrService);

	blackLabel1.addComponentListener(new ComponentListener()
	{

	    @Override
	    public void componentShown(ComponentEvent e)
	    {
		// TODO Auto-generated method stub

	    }

	    @Override
	    public void componentResized(ComponentEvent e)
	    {
		// TODO Auto-generated method stub
		System.out.println("Label has resized");
		updateGUI();

	    }

	    @Override
	    public void componentMoved(ComponentEvent e)
	    {
		// TODO Auto-generated method stub

	    }

	    @Override
	    public void componentHidden(ComponentEvent e)
	    {
		// TODO Auto-generated method stub

	    }
	});

	setVisible(true);
    }

    protected void updateGUI()
    {
	// TODO Auto-generated method stub
	if (widthResService < this.getWidth() / 3)
	{
	    day = "WED";
	    holiday = "Christmas 251217";
	    resOrService = "Doctor*, Doctor*";
	    
	    redLabel1.setText(day);
	    redLabel2.setText(holiday);
	    blackLabel1.setText(resOrService);
	} 
	else if(widthResService >= this.getWidth() / 3)
	{
	    day = "WED";
	    holiday = "251217";
	    resOrService = "Doctor*, Doctor*";
	    
	    redLabel1.setText(day);
	    redLabel2.setText(holiday);
	    blackLabel1.setText(resOrService);   
	}
	else
	{
	    day = "WED";
	    holiday = "251217";
	    resOrService = "DD2";
	    redLabel1.setText(day);
	    redLabel2.setText(holiday);
	    blackLabel1.setText(resOrService);
	}
    }

}
