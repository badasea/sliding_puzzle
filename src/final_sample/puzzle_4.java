package final_sample;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

class puzzle_4 extends JPanel{
	Image[] _images;
	int[][] _cells = {
			{ 0, 1, 2, 3},
			{ 4, 5, 6, 7},
			{ 8, 9, 10, 11},
			{ 12, 13, 14, 15}
	};
	int[][] _res = {
			{ 0, 1, 2, 3},
			{ 4, 5, 6, 7},
			{ 8, 9, 10, 11},
			{ 12, 13, 14, 15}
	};
	Toolkit toolkit = getToolkit();	
	public puzzle_4() {
		Random r = new Random();
		int num; // 랜덤 값 변수
		boolean condition = false;
		_images = new Image[16];

		for(int i=0; i < 10; ++i)
		{
			_images[i] = toolkit.getImage("skon_00"+(i+1)+""+"a.jpg");	
		}
		for(int i=9; i < 16; ++i)
		{
			_images[i] = toolkit.getImage("skon_0"+(i+1)+""+"a.jpg");	
		}
		// 랜덤 변수 생성
		for (int i = 0; i < _cells.length; i++) {
			for (int j = 0; j < _cells.length; j++) {
				_cells[i][j] = -1;
			}
		}
		for (int i = 0; i < _cells.length; i++) {
			for (int j = 0; j < _cells.length; j++) {
				num = r.nextInt(16);
				if (!(i == 0 && j == 0)) {
					for (int k = 0; k < _cells.length; k++) {
						int l = 0;
						while (l < _cells.length) {
							if (num == _cells[k][l]) {
								num = r.nextInt(16);
								condition = true;
							} else {
								condition = false;
							}
							l++;
							if (condition == true) {
								k = 0;
								l = 0;
							}
						}
					}
				}
				_cells[i][j] = num;
			}
		}

		/////
		if (Arrays.deepEquals(_cells, _res)) {
			JOptionPane.showMessageDialog(null, "Puzzle Game Clear!");
			System.out.println("Puzzle Game Clear!");
		}
	}
	public void paint(Graphics g) {
		int width = getWidth();
		int height = getHeight();
		int cellWidth = width/4;
		int cellHeight = height/4;
		
		g.clearRect(0, 0, getWidth(), getHeight());
		for (int row = 0; row < 4; ++row)
		{
			for (int col = 0; col < 4; ++col)
			{
				int x = col*cellWidth;
				int y = row*cellHeight;
				g.drawImage(_images[_cells[row][col]], x, y, cellWidth, cellHeight, this);
			}
		}
	}
}
