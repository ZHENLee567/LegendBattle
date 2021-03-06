package LegendBattle;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		
		 //为事件调度线程安排一个任务
        //创建并显示这个程序的图形用户界面
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
		
		ADC p1ADC, p2ADC;
		Tank p1Tank, p2Tank;
		APC p1APC, p2APC;
		
		
	}
	
	/**
	 * 新回合开始，状态更新
	 * @param p1ADC
	 * @param p2ADC
	 * @param p1Tank
	 * @param p2Tank
	 * @param p1APC
	 * @param p2APC
	 */
	public static void NewRound(ADC p1ADC,ADC p2ADC,
								Tank p1Tank,Tank p2Tank,
								APC p1APC,APC p2APC) {
		p1ADC.NewRound();
		p2ADC.NewRound();
		p1APC.NewRound();
		p2APC.NewRound();
		p1Tank.NewRound();
		p2Tank.NewRound();
	}
	
	//创建图形用户界面，并显示
    //为了线程安全，这个方法应该
    //从事件调度线程中调用
    private static void createAndShowGUI() {
        //创建并设置窗体
        JFrame frame = new JFrame("我的小游戏");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //获取内容区
        Container pane = frame.getContentPane();
        //设置内容区布局为BorderLayout
        pane.setLayout(new BorderLayout());
        
        //添加按钮
        JPanel SkillBar = new JPanel(new FlowLayout(1, 100, 10));
        MyPanel BF = new MyPanel();
        pane.add(SkillBar, BorderLayout.SOUTH);
        pane.add(BF, BorderLayout.CENTER);
        
        //添加按钮
        SkillBar.add(new JButton("施放Q技能"));
        SkillBar.add(new JButton("施放W技能"));
        SkillBar.add(new JButton("施放E技能"));
        SkillBar.add(new JButton("施放R技能"));
        

        //自动调整窗体大小
        frame.setSize(1680, 800);
        //显示窗体
        frame.setVisible(true);
    }
}
