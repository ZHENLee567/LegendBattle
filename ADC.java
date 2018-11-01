package LegendBattle;

/**
 * <p> 类{@code ADC}类是{@link Hero}类的子类
 * <br>拥有属性：生命值，攻击力，攻击范围，英雄位置，英雄名字，本回合已行动的次数
 * <br>拥有方法：
 * <blockquote>void move(int direction);<br>
 * 	void LevelUp();<br>void attack(Hero b);<br>void Q();
 * <br>void W();<br>void E();<br>void R();
 * </blockquote>
 * @author HP
 *
 */
public class ADC extends Hero{
	
	{	//构造代码块
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
		System.out.println("穿刺之箭");
	}
	
	@Override
	public void W() {
		System.out.println("枯萎箭袋");
	}
	
	@Override
	public void E() {
		System.out.println("死灵箭雨");
	}
	
	@Override
	public void R() {
		System.out.println("腐败锁链");
	}
}
