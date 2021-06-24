package final_sample;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class MouseHandler5 implements MouseListener {
	puzzle_5 _p;
	
	public MouseHandler5(puzzle_5 p5) {
		// TODO Auto-generated constructor stub
		_p = p5;
	}
	public void mouseEntered (MouseEvent e) {

	}
	public void mouseExited (MouseEvent e) {

	}
	public void mousePressed (MouseEvent e) {

	}
	public void mouseClicked (MouseEvent e) {
		int col = e.getX()/200;
		int row = e.getY()/200;
		int blank = 0;
		for (int i =0; i<4; i++)
		{
			for (int j =0; j<4; j++)
			{
				if (_p._cells[i][j] == 8)
				{
					blank =_p._cells[i][j];
				}
			}
		}
		
		int temp = _p._cells[row][col];

		if (_p._cells[row][col] < 16) {
			if (_p._cells[0][0] == blank)
			{
				if (_p._cells[0][1] == _p._cells[row][col])
				{
					temp = _p._cells[0][1];
					_p._cells[0][1] = blank;
					_p._cells[0][0] = temp;
				}
				if (_p._cells[1][0] == _p._cells[row][col])
				{
					temp = _p._cells[1][0];
					_p._cells[1][0] = blank;
					_p._cells[0][0] = temp;
				}
			}
			if (_p._cells[0][1] == blank)
			{
				if (_p._cells[0][0] == _p._cells[row][col])
				{
					temp = _p._cells[0][0];
					_p._cells[0][0] = blank;
					_p._cells[0][1] = temp;
				}
				if (_p._cells[0][2] == _p._cells[row][col])
				{
					temp = _p._cells[0][2];
					_p._cells[0][2] = blank;
					_p._cells[0][1] = temp;
				}
				if (_p._cells[1][1] == _p._cells[row][col])
				{
					temp = _p._cells[1][1];
					_p._cells[1][1] = blank;
					_p._cells[0][1] = temp;
				}
			}
			if (_p._cells[0][2] == blank)
			{
				if (_p._cells[0][1] == _p._cells[row][col])
				{
					temp = _p._cells[0][1];
					_p._cells[0][1] = blank;
					_p._cells[0][2] = temp;
				}
				if (_p._cells[0][3] == _p._cells[row][col])
				{
					temp = _p._cells[0][3];
					_p._cells[0][3] = blank;
					_p._cells[0][2] = temp;
				}
				if (_p._cells[1][2] == _p._cells[row][col])
				{
					temp = _p._cells[1][2];
					_p._cells[1][2] = blank;
					_p._cells[0][2] = temp;
				}
			}
			if (_p._cells[0][3] == blank)
			{
				if (_p._cells[0][2] == _p._cells[row][col])
				{
					temp = _p._cells[0][2];
					_p._cells[0][2] = blank;
					_p._cells[0][3] = temp;
				}
				if (_p._cells[0][4] == _p._cells[row][col])
				{
					temp = _p._cells[0][4];
					_p._cells[0][4] = blank;
					_p._cells[0][3] = temp;
				}
				if (_p._cells[1][3] == _p._cells[row][col])
				{
					temp = _p._cells[1][3];
					_p._cells[1][3] = blank;
					_p._cells[0][3] = temp;
				}
			}
			if (_p._cells[0][4] == blank)
			{
				if (_p._cells[0][3] == _p._cells[row][col])
				{
					temp = _p._cells[0][3];
					_p._cells[0][3] = blank;
					_p._cells[0][4] = temp;
				}
				if (_p._cells[1][4] == _p._cells[row][col])
				{
					temp = _p._cells[1][4];
					_p._cells[1][4] = blank;
					_p._cells[0][4] = temp;
				}
			}
			if (_p._cells[1][0] == blank)
			{
				if (_p._cells[0][0] == _p._cells[row][col])
				{
					temp = _p._cells[0][0];
					_p._cells[0][0] = blank;
					_p._cells[1][0] = temp;
				}
				if (_p._cells[1][1] == _p._cells[row][col])
				{
					temp = _p._cells[1][1];
					_p._cells[1][1] = blank;
					_p._cells[1][0] = temp;
				}
				if (_p._cells[2][0] == _p._cells[row][col])
				{
					temp = _p._cells[2][0];
					_p._cells[2][0] = blank;
					_p._cells[1][0] = temp;
				}
			}
			if (_p._cells[1][1] == blank)
			{
				if (_p._cells[1][0] == _p._cells[row][col])
				{
					temp = _p._cells[1][0];
					_p._cells[1][0] = blank;
					_p._cells[1][1] = temp;
				}
				if (_p._cells[0][1] == _p._cells[row][col])
				{
					temp = _p._cells[0][1];
					_p._cells[0][1] = blank;
					_p._cells[1][1] = temp;
				}
				if (_p._cells[1][2] == _p._cells[row][col])
				{
					temp = _p._cells[1][2];
					_p._cells[1][2] = blank;
					_p._cells[1][1] = temp;
				}
				if (_p._cells[2][1] == _p._cells[row][col])
				{
					temp = _p._cells[2][1];
					_p._cells[2][1] = blank;
					_p._cells[1][1] = temp;
				}
			}
			if (_p._cells[1][2] == blank)
			{
				if (_p._cells[0][2] == _p._cells[row][col])
				{
					temp = _p._cells[0][2];
					_p._cells[0][2] = blank;
					_p._cells[1][2] = temp;
				}
				if (_p._cells[1][1] == _p._cells[row][col])
				{
					temp = _p._cells[1][1];
					_p._cells[1][1] = blank;
					_p._cells[1][2] = temp;
				}
				if (_p._cells[1][3] == _p._cells[row][col])
				{
					temp = _p._cells[1][3];
					_p._cells[1][3] = blank;
					_p._cells[1][2] = temp;
				}
				if (_p._cells[2][2] == _p._cells[row][col])
				{
					temp = _p._cells[2][2];
					_p._cells[2][2] = blank;
					_p._cells[1][2] = temp;
				}
			}
			if (_p._cells[1][3] == blank)
			{
				if (_p._cells[0][3] == _p._cells[row][col])
				{
					temp = _p._cells[0][3];
					_p._cells[0][3] = blank;
					_p._cells[1][3] = temp;
				}
				if (_p._cells[1][2] == _p._cells[row][col])
				{
					temp = _p._cells[1][2];
					_p._cells[1][2] = blank;
					_p._cells[1][3] = temp;
				}
				if (_p._cells[1][4] == _p._cells[row][col])
				{
					temp = _p._cells[1][4];
					_p._cells[1][4] = blank;
					_p._cells[1][3] = temp;
				}
				if (_p._cells[2][3] == _p._cells[row][col])
				{
					temp = _p._cells[2][3];
					_p._cells[2][3] = blank;
					_p._cells[1][3] = temp;
				}
			}
			if (_p._cells[1][4] == blank)
			{
				if (_p._cells[0][4] == _p._cells[row][col])
				{
					temp = _p._cells[0][4];
					_p._cells[0][4] = blank;
					_p._cells[1][4] = temp;
				}
				if (_p._cells[1][3] == _p._cells[row][col])
				{
					temp = _p._cells[1][3];
					_p._cells[1][3] = blank;
					_p._cells[1][4] = temp;
				}
				if (_p._cells[2][4] == _p._cells[row][col])
				{
					temp = _p._cells[2][4];
					_p._cells[2][4] = blank;
					_p._cells[1][4] = temp;
				}
			}
			if (_p._cells[2][0] == blank)
			{
				if (_p._cells[1][0] == _p._cells[row][col])
				{
					temp = _p._cells[1][0];
					_p._cells[1][0] = blank;
					_p._cells[2][0] = temp;
				}
				if (_p._cells[2][1] == _p._cells[row][col])
				{
					temp = _p._cells[2][1];
					_p._cells[2][1] = blank;
					_p._cells[2][0] = temp;
				}
				if (_p._cells[3][0] == _p._cells[row][col])
				{
					temp = _p._cells[3][0];
					_p._cells[3][0] = blank;
					_p._cells[2][0] = temp;
				}
			}
			if (_p._cells[2][1] == blank)
			{
				if (_p._cells[2][2] == _p._cells[row][col])
				{
					temp = _p._cells[2][2];
					_p._cells[2][2] = blank;
					_p._cells[2][1] = temp;
				}
				if (_p._cells[2][0] == _p._cells[row][col])
				{
					temp = _p._cells[2][0];
					_p._cells[2][0] = blank;
					_p._cells[2][1] = temp;
				}
				if (_p._cells[1][1] == _p._cells[row][col])
				{
					temp = _p._cells[1][1];
					_p._cells[1][1] = blank;
					_p._cells[2][1] = temp;
				}
				if (_p._cells[3][1] == _p._cells[row][col])
				{
					temp = _p._cells[3][1];
					_p._cells[3][1] = blank;
					_p._cells[2][1] = temp;
				}
			}
			if (_p._cells[2][2] == blank)
			{
				if (_p._cells[1][2] == _p._cells[row][col])
				{
					temp = _p._cells[1][2];
					_p._cells[1][2] = blank;
					_p._cells[2][2] = temp;
				}
				if (_p._cells[2][1] == _p._cells[row][col])
				{
					temp = _p._cells[2][1];
					_p._cells[2][1] = blank;
					_p._cells[2][2] = temp;
				}
				if (_p._cells[2][3] == _p._cells[row][col])
				{
					temp = _p._cells[2][3];
					_p._cells[2][3] = blank;
					_p._cells[2][2] = temp;
				}
				if (_p._cells[3][2] == _p._cells[row][col])
				{
					temp = _p._cells[3][2];
					_p._cells[3][2] = blank;
					_p._cells[2][2] = temp;
				}
			}
			if (_p._cells[2][3] == blank)
			{
				if (_p._cells[1][3] == _p._cells[row][col])
				{
					temp = _p._cells[1][3];
					_p._cells[1][3] = blank;
					_p._cells[2][3] = temp;
				}
				if (_p._cells[2][2] == _p._cells[row][col])
				{
					temp = _p._cells[2][2];
					_p._cells[2][2] = blank;
					_p._cells[2][3] = temp;
				}
				if (_p._cells[2][4] == _p._cells[row][col])
				{
					temp = _p._cells[2][4];
					_p._cells[2][4] = blank;
					_p._cells[2][3] = temp;
				}
				if (_p._cells[3][3] == _p._cells[row][col])
				{
					temp = _p._cells[3][3];
					_p._cells[3][3] = blank;
					_p._cells[2][3] = temp;
				}
			}
			if (_p._cells[2][4] == blank)
			{
				if (_p._cells[1][4] == _p._cells[row][col])
				{
					temp = _p._cells[1][4];
					_p._cells[1][4] = blank;
					_p._cells[2][4] = temp;
				}
				if (_p._cells[2][3] == _p._cells[row][col])
				{
					temp = _p._cells[2][3];
					_p._cells[2][3] = blank;
					_p._cells[2][4] = temp;
				}
				if (_p._cells[3][4] == _p._cells[row][col])
				{
					temp = _p._cells[3][4];
					_p._cells[3][4] = blank;
					_p._cells[2][4] = temp;
				}
			}
			if (_p._cells[3][0] == blank)
			{
				if (_p._cells[2][0] == _p._cells[row][col])
				{
					temp = _p._cells[2][0];
					_p._cells[2][0] = blank;
					_p._cells[3][0] = temp;
				}
				if (_p._cells[3][1] == _p._cells[row][col])
				{
					temp = _p._cells[3][1];
					_p._cells[3][1] = blank;
					_p._cells[3][0] = temp;
				}
				if (_p._cells[4][0] == _p._cells[row][col])
				{
					temp = _p._cells[4][0];
					_p._cells[4][0] = blank;
					_p._cells[3][0] = temp;
				}
			}
			if (_p._cells[3][1] == blank)
			{
				if (_p._cells[2][1] == _p._cells[row][col])
				{
					temp = _p._cells[2][1];
					_p._cells[2][1] = blank;
					_p._cells[3][1] = temp;
				}
				if (_p._cells[3][0] == _p._cells[row][col])
				{
					temp = _p._cells[3][0];
					_p._cells[3][0] = blank;
					_p._cells[3][1] = temp;
				}
				if (_p._cells[3][2] == _p._cells[row][col])
				{
					temp = _p._cells[3][2];
					_p._cells[3][2] = blank;
					_p._cells[3][1] = temp;
				}
				if (_p._cells[4][1] == _p._cells[row][col])
				{
					temp = _p._cells[4][1];
					_p._cells[4][1] = blank;
					_p._cells[3][1] = temp;
				}
			}
			if (_p._cells[3][2] == blank)
			{
				if (_p._cells[2][2] == _p._cells[row][col])
				{
					temp = _p._cells[2][2];
					_p._cells[2][2] = blank;
					_p._cells[3][2] = temp;
				}
				if (_p._cells[3][1] == _p._cells[row][col])
				{
					temp = _p._cells[3][1];
					_p._cells[3][1] = blank;
					_p._cells[3][2] = temp;
				}
				if (_p._cells[3][3] == _p._cells[row][col])
				{
					temp = _p._cells[3][3];
					_p._cells[3][3] = blank;
					_p._cells[3][2] = temp;
				}
				if (_p._cells[4][2] == _p._cells[row][col])
				{
					temp = _p._cells[4][2];
					_p._cells[4][2] = blank;
					_p._cells[3][2] = temp;
				}
			}
			if (_p._cells[3][3] == blank)
			{
				if (_p._cells[2][3] == _p._cells[row][col])
				{
					temp = _p._cells[2][3];
					_p._cells[2][3] = blank;
					_p._cells[3][3] = temp;
				}
				if (_p._cells[3][2] == _p._cells[row][col])
				{
					temp = _p._cells[3][2];
					_p._cells[3][2] = blank;
					_p._cells[3][3] = temp;
				}
				if (_p._cells[3][4] == _p._cells[row][col])
				{
					temp = _p._cells[3][4];
					_p._cells[3][4] = blank;
					_p._cells[3][3] = temp;
				}
				if (_p._cells[4][3] == _p._cells[row][col])
				{
					temp = _p._cells[4][3];
					_p._cells[4][3] = blank;
					_p._cells[3][3] = temp;
				}
			}
			if (_p._cells[3][4] == blank)
			{
				if (_p._cells[2][4] == _p._cells[row][col])
				{
					temp = _p._cells[2][4];
					_p._cells[2][4] = blank;
					_p._cells[3][4] = temp;
				}
				if (_p._cells[3][3] == _p._cells[row][col])
				{
					temp = _p._cells[3][3];
					_p._cells[3][3] = blank;
					_p._cells[3][4] = temp;
				}
				if (_p._cells[4][4] == _p._cells[row][col])
				{
					temp = _p._cells[4][4];
					_p._cells[4][4] = blank;
					_p._cells[3][4] = temp;
				}
			}
			if (_p._cells[4][0] == blank)
			{
				if (_p._cells[3][0] == _p._cells[row][col])
				{
					temp = _p._cells[3][0];
					_p._cells[3][0] = blank;
					_p._cells[4][0] = temp;
				}
				if (_p._cells[4][1] == _p._cells[row][col])
				{
					temp = _p._cells[4][1];
					_p._cells[4][1] = blank;
					_p._cells[4][0] = temp;
				}
			}
			if (_p._cells[4][1] == blank)
			{
				if (_p._cells[3][1] == _p._cells[row][col])
				{
					temp = _p._cells[3][1];
					_p._cells[3][1] = blank;
					_p._cells[4][1] = temp;
				}
				if (_p._cells[4][0] == _p._cells[row][col])
				{
					temp = _p._cells[4][0];
					_p._cells[4][0] = blank;
					_p._cells[4][1] = temp;
				}
				if (_p._cells[4][2] == _p._cells[row][col])
				{
					temp = _p._cells[4][2];
					_p._cells[4][2] = blank;
					_p._cells[4][1] = temp;
				}
			}
			if (_p._cells[4][2] == blank)
			{
				if (_p._cells[3][2] == _p._cells[row][col])
				{
					temp = _p._cells[3][2];
					_p._cells[3][2] = blank;
					_p._cells[4][2] = temp;
				}
				if (_p._cells[4][1] == _p._cells[row][col])
				{
					temp = _p._cells[4][1];
					_p._cells[4][1] = blank;
					_p._cells[4][2] = temp;
				}
				if (_p._cells[4][3] == _p._cells[row][col])
				{
					temp = _p._cells[4][3];
					_p._cells[4][3] = blank;
					_p._cells[4][2] = temp;
				}
			}
			if (_p._cells[4][3] == blank)
			{
				if (_p._cells[3][3] == _p._cells[row][col])
				{
					temp = _p._cells[3][3];
					_p._cells[3][3] = blank;
					_p._cells[4][3] = temp;
				}
				if (_p._cells[4][2] == _p._cells[row][col])
				{
					temp = _p._cells[4][2];
					_p._cells[4][2] = blank;
					_p._cells[4][3] = temp;
				}
				if (_p._cells[4][4] == _p._cells[row][col])
				{
					temp = _p._cells[4][4];
					_p._cells[4][4] = blank;
					_p._cells[4][3] = temp;
				}
			}
			if (_p._cells[4][4] == blank)
			{
				if (_p._cells[4][3] == _p._cells[row][col])
				{
					temp = _p._cells[4][3];
					_p._cells[4][3] = blank;
					_p._cells[4][4] = temp;
				}
				if (_p._cells[3][4] == _p._cells[row][col])
				{
					temp = _p._cells[3][4];
					_p._cells[3][4] = blank;
					_p._cells[4][4] = temp;
				}
			}
		}
		_p.repaint();
	}
	public void mouseReleased (MouseEvent e) {

	}
}