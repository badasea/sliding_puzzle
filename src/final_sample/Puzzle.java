package final_sample;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Puzzle extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Clip clip;
	private int off = 1;
	private JMenuBar menuBar;
	private JMenu Menu;
	private JMenuItem MenuItem_exit;
	private JMenuItem MenuItem_music;
	private JMenuItem MenuItem_4;
	private JMenuItem MenuItem_3;
	private JMenuItem MenuItem_5;
	private JPanel panel_select = new JPanel();
	private JButton button1 = new JButton("3x3");
	private JButton button2 = new JButton("4x4");
	private JButton button3 = new JButton("5x5");
	private JButton music = new JButton("Music ON/OFF");
	
	Container contentPane = getContentPane();
	puzzle_3 p3 = new puzzle_3();
	puzzle_4 p4 = new puzzle_4();
	puzzle_5 p5 = new puzzle_5();

	ImagePanel imagePanel = new ImagePanel();

	public void loadAudio(String pathName) {
		try {
			clip = AudioSystem.getClip();
			File audioFile = new File(pathName);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			clip.open(audioStream);
		} catch (LineUnavailableException e) {
			e.printStackTrace();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Puzzle() {
		super("puzzle");
		loadAudio("Game_Music.wav");
		clip.start();
		clip.loop(Clip.LOOP_CONTINUOUSLY);

		menuBar = new JMenuBar();
		add(menuBar);

		Menu = new JMenu("메뉴");
		menuBar.add(Menu);
		
		MenuItem_3 = new JMenuItem("3x3");
		MenuItem_3.addActionListener(new Listener());
		Menu.add(MenuItem_3);

		MenuItem_4 = new JMenuItem("4x4");
		MenuItem_4.addActionListener(new Listener());
		Menu.add(MenuItem_4);

		MenuItem_5 = new JMenuItem("5x5");
		MenuItem_5.addActionListener(new Listener());
		Menu.add(MenuItem_5);

		MenuItem_music = new JMenuItem("music");
		MenuItem_music.addActionListener(new Listener());
		Menu.add(MenuItem_music);
		
		MenuItem_exit = new JMenuItem("종료");
		MenuItem_exit.addActionListener(new Listener());
		Menu.add(MenuItem_exit);
		
		contentPane.add(imagePanel, BorderLayout.CENTER);

		contentPane.add(panel_select, BorderLayout.SOUTH);
		panel_select.setLayout(new FlowLayout());
		panel_select.add(button1);
		panel_select.add(button2);
		panel_select.add(button3);
		panel_select.add(music);
		button1.addActionListener(new Listener());
		button2.addActionListener(new Listener());
		button3.addActionListener(new Listener());
		music.addActionListener(new Listener());

		setJMenuBar(menuBar);
		setTitle("SKON PUZZLE GAME");
		setSize(586,586);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class Listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == music || e.getSource() == MenuItem_music) {
				if (off == 1) {
					clip.stop();
					off = 0;
				} else if (off == 0) {
					clip.start();
					off = 1;
				}
			}
			if (e.getSource() == button1 || e.getSource() == MenuItem_3) {
				if (Arrays.deepEquals(p3._cells, p3._res)) {
					long beforeTime = System.currentTimeMillis();
					long afterTime = System.currentTimeMillis();
					long secDiffTime = (afterTime - beforeTime)/1000;
					long score=0;
					if (secDiffTime < 90)
					{
						score=100;
					}
					else if (secDiffTime > 90 && secDiffTime < 180)
					{
						score=50;
					}
					else
					{
						score=30;
					}
					
					JOptionPane.showMessageDialog(null, "경과시간 : "+secDiffTime+"\n점수 : "+score);
					System.out.println("Puzzle Game Clear!");
				}
				contentPane.removeAll();
				contentPane.add(p3, BorderLayout.CENTER);
				contentPane.addMouseListener(new MouseHandler3(p3));
				contentPane.add(panel_select, BorderLayout.SOUTH);
				panel_select.setLayout(new FlowLayout());
				panel_select.add(button1);
				panel_select.add(button2);
				panel_select.add(button3);
				panel_select.add(music);
				button1.addActionListener(new Listener());
				button2.addActionListener(new Listener());
				button3.addActionListener(new Listener());
				music.addActionListener(new Listener());
				contentPane.revalidate();
				contentPane.repaint();
			}
			if (e.getSource() == button2 || e.getSource() == MenuItem_4) {
				if (Arrays.deepEquals(p4._cells, p4._res)) {
					long beforeTime = System.currentTimeMillis();
					long afterTime = System.currentTimeMillis();
					long secDiffTime = (afterTime - beforeTime)/1000;
					long score=0;
					if (secDiffTime < 180)
					{
						score=100;
					}
					else if (secDiffTime > 180 && secDiffTime < 270)
					{
						score=50;
					}
					else
					{
						score=30;
					}
					
					JOptionPane.showMessageDialog(null, "경과시간 : "+secDiffTime+"\n점수 : "+score);
					System.out.println("Puzzle Game Clear!");
				}
				contentPane.removeAll();
				contentPane.add(p4, BorderLayout.CENTER);
				contentPane.addMouseListener(new MouseHandler4(p4));

				contentPane.add(panel_select, BorderLayout.SOUTH);
				panel_select.setLayout(new FlowLayout());
				panel_select.add(button1);
				panel_select.add(button2);
				panel_select.add(button3);
				panel_select.add(music);
				button1.addActionListener(new Listener());
				button2.addActionListener(new Listener());
				button3.addActionListener(new Listener());
				music.addActionListener(new Listener());
				contentPane.revalidate();
				contentPane.repaint();
			}
			if (e.getSource() == button3 || e.getSource() == MenuItem_5) {
				if (Arrays.deepEquals(p4._cells, p4._res)) {
					long beforeTime = System.currentTimeMillis();
					long afterTime = System.currentTimeMillis();
					long secDiffTime = (afterTime - beforeTime)/1000;
					long score=0;
					if (secDiffTime < 270)
					{
						score=100;
					}
					else if (secDiffTime > 270 && secDiffTime < 360)
					{
						score=50;
					}
					else
					{
						score=30;
					}
					
					JOptionPane.showMessageDialog(null, "경과시간 : "+secDiffTime+"\n점수 : "+score);
					System.out.println("Puzzle Game Clear!");
				}
				contentPane.removeAll();
				contentPane.add(p5, BorderLayout.CENTER);
				contentPane.addMouseListener(new MouseHandler5(p5));

				contentPane.add(panel_select, BorderLayout.SOUTH);
				panel_select.setLayout(new FlowLayout());
				panel_select.add(button1);
				panel_select.add(button2);
				panel_select.add(button3);
				panel_select.add(music);
				button1.addActionListener(new Listener());
				button2.addActionListener(new Listener());
				button3.addActionListener(new Listener());
				music.addActionListener(new Listener());
				contentPane.revalidate();
				contentPane.repaint();
			}
			if (e.getSource() == MenuItem_exit)
			{
				System.exit(0);
			}
		}
	}
}