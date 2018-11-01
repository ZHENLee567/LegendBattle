package LegendBattle;

/**
 * <p> 类{@code APC}类是{@link Hero}类的子类
 * <br>拥有属性：生命值，攻击力，攻击范围，英雄位置，英雄名字，本回合已行动的次数
 * <br>拥有方法：
 * <blockquote>void move(int direction);<br>
 * 	void LevelUp();<br>void attack(Hero b);<br>void Q();
 * <br>void W();<br>void E();<br>void R();
 * </blockquote>
 * @author HP
 *
 */
public class APC extends Hero {

	{
		this.name = "APC";
	}
	
	public APC() {
		super();
		this.health = 400;
		this.attackRange = 2;
	}
	
	@Override
	public void LevelUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Q() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void W() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void E() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void R() {
		// TODO Auto-generated method stub
		
	}
	
}
