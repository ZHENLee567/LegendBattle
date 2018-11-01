package LegendBattle;
/**
 * <p> 类{@code Hero}类是一个抽象英雄类
 * <br>他是类{@link ADC}、{@link APC}、{@link Tank}的父类
 * <br>拥有属性：生命值，攻击力，攻击范围，英雄位置，英雄名字，本回合已行动的次数
 * <br>拥有方法：
 * <blockquote>void move(int direction);<br>
 * 	void LevelUp();<br>void attack(Hero b);<br>void Q();
 * <br>void W();<br>void E();<br>void R();
 * </blockquote>
 * @author HP
 *
 */
abstract class Hero {

	protected int health;		//生命值
	protected int attack;		//攻击力
	protected int attackRange;	//攻击范围
	protected int armor;		//护甲值
	protected int x, y;			//英雄在地图上面的位置
	protected String name;		//英雄的名字
	protected int haveAttacked;	//英雄在此回合是否已经发起过攻击
	protected int ActionCounter;//英雄在此回合中行动的次数
	
	public Hero() {
		health = 500;
		attack = 60;
		attackRange = 1;
		armor = 25;
		haveAttacked = 0;
	}

	public Hero(int health, int attack, int attackRange, int armor, int x, int y, String name) {
		this.health = health;
		this.attack = attack;
		this.attackRange = attackRange;
		this.armor = armor;
		this.x = x;
		this.y = y;
		this.name = name;
		haveAttacked = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * 英雄的移动，每个英雄每回合只能移动3次
	 * @param direction 表示方向，从上开始顺时针4个方向分别对应 1， 2， 3， 4
	 */
	public void move(int direction) {
		
		switch (direction) 
		{
			case 1:
				y -= 1;		//向上移动一位
			case 2:
				x += 1;		//向右移动一位
			case 3:
				y += 1;		//向下移动一位
			case 4:
				x -= 1;		//向左移动一位
		}
	}
	
	/**
	 * 攻击函数，选择一个敌人进行攻击
	 * @param B 被攻击的英雄对象
	 */
	public void attack(Hero B) {
		
		if (haveAttacked == 1)	//判断英雄此回合是否已经发起过攻击
			return;
		if ((x - B.x) * (x - B.x) + (y - B.y) * (y - B.y) > attackRange)
			//判断所攻击的英雄是否在攻击范围内
			B.setHealth(B.health - attack);
		
		haveAttacked = 1;
	}
	
	/**
	 * 新回合开始，刷新所有英雄的状态
	 */
	public void NewRound() {
		
		ActionCounter = 0;
		haveAttacked = 0;
	}
	
	/**
	 * 英雄升级函数
	 */
	abstract public void LevelUp() ;
	
	abstract public void Q() ;
	
	abstract public void W() ;
	
	abstract public void E() ;
	
	abstract public void R() ;
}