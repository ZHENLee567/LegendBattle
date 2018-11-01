package LegendBattle;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;

/**
 * <p>类{@code BattleField}是一个战场类
 * <p>他继承了{@link JFrame}类
 * ，实现了界面的部分功能
 * <br>包括了一系列的方法
 * <br>包括变量: map, n, m
 * @author HP
 *
 */
public class BattleField extends JFrame{
	
	MyPanel mp = null;
	private int[][] map;
	private int n;
	private int m;
	private List<Hero> heros = new ArrayList<Hero>();
	
	public static void main(String[] args) {
		BattleField bf = new BattleField(30, 40);
	}
	public BattleField() {
		mp=new MyPanel();
		this.add(mp);
		
		//事件监听
		this.addKeyListener(mp);
		
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public BattleField(int n, int m) {
		this.n = n;
		this.m = m;
		
		map = new int[n][m];
		
		for (int i = 0; i < n; i++) 
			for (int j = 0; j < m; j++) {
				map[i][j] = 0;
			}
		
		mp=new MyPanel();
		mp.setSize(n, m);
		this.add(mp);
		
		//事件监听
		this.addKeyListener(mp);
		
		this.setSize(n * 10,m * 10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}
	
	public void printField() {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void AddHero(int x, int y) {
		if (x < m && y < n) {
			map[x][y] = 1;
		}

	}
	
}

class MyPanel extends JPanel implements KeyListener
{
	int x= 10;
	int y= 10;
	int m;
	int n;
	String name = "Hero";
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(90, 300, 30 ,30);
		g.drawString(name, 90, 300);
		g.fillOval(x, y, 10, 10);
		
		g.setColor(Color.BLACK);
		g.fillOval(160, 30, 30 ,30);
		g.drawString("Hero2", 160, 30);
		
		g.setColor(Color.BLUE);
		g.fillOval(90, 90, 30 ,30);
		g.drawString("Hero3", 90, 90);
		
		g.setColor(Color.GRAY);
		g.fillOval(200, 90, 30 ,30);
		g.drawString("Hero4", 200, 90);
		
		g.setColor(Color.BLACK);

		g.fillRect(0, 0, m * 10, 4);
		g.fillRect(0, 0, 4, n * 10);
		g.fillRect(m * 10 - 4, n * 10 - 4, m * 10, 4);
		g.fillRect(m * 10 - 4, n * 10 - 4, 4, n * 10);
	}
	
	public void setSize(int n, int m) {
		this.n = n;
		this.m = m;
	}
 
	@Override//键被按下
	public void keyPressed(KeyEvent e) {
		//System.out.println("被按下"+(char)e.getKeyCode());
		switch(e.getKeyCode())
		{
			case KeyEvent.VK_UP:
				if (y > 30)
				y-=30;name = "Hero";
				//调用repaint()函数，重新绘制小球位置
				this.repaint();
				break;
			case KeyEvent.VK_DOWN:
				if (y < m * 10 - 30)
				y+=30;name = "Hero";
				//调用repaint()函数，重新绘制小球位置
				this.repaint();
				break;
			case KeyEvent.VK_LEFT:
				if (x > 30)
				x-=30;name = "Hero";
				//调用repaint()函数，重新绘制小球位置
				this.repaint();
				break;
			case KeyEvent.VK_RIGHT:
				if (x < n * 10 - 30)
				x+=30;name = "Hero";
				//调用repaint()函数，重新绘制小球位置
				this.repaint();
				break;
			case KeyEvent.VK_E:
				x += 100;
				name="瞬移完成";
				System.out.println(name);
				this.repaint();
				break;
		}
		
	}
 
	
	@Override//表示具体一个值被输出，例如：F1
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override//键被释放
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}