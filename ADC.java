package LegendBattle;

/**
 * <p> ��{@code ADC}����{@link Hero}�������
 * <br>ӵ�����ԣ�����ֵ����������������Χ��Ӣ��λ�ã�Ӣ�����֣����غ����ж��Ĵ���
 * <br>ӵ�з�����
 * <blockquote>void move(int direction);<br>
 * 	void LevelUp();<br>void attack(Hero b);<br>void Q();
 * <br>void W();<br>void E();<br>void R();
 * </blockquote>
 * @author HP
 *
 */
public class ADC extends Hero{
	
	{	//��������
		this.name = "ADC";
	}
	
	public ADC() {
		super();
		this.attackRange = 2;
		this.health = 450;
	}
	
	public ADC(int health, int attack, int attackRange, int armor, int x, int y, String name) {
		super(health, attack, attackRange, armor, x, y, name);
	}
	
	@Override
	public void LevelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Q() {
		System.out.println("����֮��");
	}
	
	@Override
	public void W() {
		System.out.println("��ή����");
	}
	
	@Override
	public void E() {
		System.out.println("�������");
	}
	
	@Override
	public void R() {
		System.out.println("��������");
	}
}
