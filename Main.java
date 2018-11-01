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
		
		 //Ϊ�¼������̰߳���һ������
        //��������ʾ��������ͼ���û�����
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
	 * �»غϿ�ʼ��״̬����
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
	
	//����ͼ���û����棬����ʾ
    //Ϊ���̰߳�ȫ���������Ӧ��
    //���¼������߳��е���
    private static void createAndShowGUI() {
        //���������ô���
        JFrame frame = new JFrame("�ҵ�С��Ϸ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //��ȡ������
        Container pane = frame.getContentPane();
        //��������������ΪBorderLayout
        pane.setLayout(new BorderLayout());
        
        //��Ӱ�ť
        JPanel SkillBar = new JPanel(new FlowLayout(1, 100, 10));
        MyPanel BF = new MyPanel();
        pane.add(SkillBar, BorderLayout.SOUTH);
        pane.add(BF, BorderLayout.CENTER);
        
        //��Ӱ�ť
        SkillBar.add(new JButton("ʩ��Q����"));
        SkillBar.add(new JButton("ʩ��W����"));
        SkillBar.add(new JButton("ʩ��E����"));
        SkillBar.add(new JButton("ʩ��R����"));
        

        //�Զ����������С
        frame.setSize(1680, 800);
        //��ʾ����
        frame.setVisible(true);
    }
}
