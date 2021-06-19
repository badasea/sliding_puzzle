package final_sample;

import java.awt.*;
import javax.swing.*;

class ImagePanel extends JPanel{
	Image _images;
	Toolkit toolkit = getToolkit();	
	public ImagePanel() {
		_images = toolkit.getImage("skon.jpg");	
	}
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		int cellWidth = width;
		int cellHeight = height;
		
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawImage(_images, 1, 1, cellWidth, cellHeight, this);
			
	}
}
