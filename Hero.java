package LegendBattle;
/**
 * <p> ��{@code Hero}����һ������Ӣ����
 * <br>������{@link ADC}��{@link APC}��{@link Tank}�ĸ���
 * <br>ӵ�����ԣ�����ֵ����������������Χ��Ӣ��λ�ã�Ӣ�����֣����غ����ж��Ĵ���
 * <br>ӵ�з�����
 * <blockquote>void move(int direction);<br>
 * 	void LevelUp();<br>void attack(Hero b);<br>void Q();
 * <br>void W();<br>void E();<br>void R();
 * </blockquote>
 * @author HP
 *
 */
abstract class Hero {

	protected int health;		//����ֵ
	protected int attack;		//������
	protected int attackRange;	//������Χ
	protected int armor;		//����ֵ
	protected int x, y;			//Ӣ���ڵ�ͼ�����λ��
	protected String name;		//Ӣ�۵�����
	protected int haveAttacked;	//Ӣ���ڴ˻غ��Ƿ��Ѿ����������
	protected int ActionCounter;//Ӣ���ڴ˻غ����ж��Ĵ���
	
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
	 * Ӣ�۵��ƶ���ÿ��Ӣ��ÿ�غ�ֻ���ƶ�3��
	 * @param direction ��ʾ���򣬴��Ͽ�ʼ˳ʱ��4������ֱ��Ӧ 1�� 2�� 3�� 4
	 */
	public void move(int direction) {
		
		switch (direction) 
		{
			case 1:
				y -= 1;		//�����ƶ�һλ
			case 2:
				x += 1;		//�����ƶ�һλ
			case 3:
				y += 1;		//�����ƶ�һλ
			case 4:
				x -= 1;		//�����ƶ�һλ
		}
	}
	
	/**
	 * ����������ѡ��һ�����˽��й���
	 * @param B ��������Ӣ�۶���
	 */
	public void attack(Hero B) {
		
		if (haveAttacked == 1)	//�ж�Ӣ�۴˻غ��Ƿ��Ѿ����������
			return;
		if ((x - B.x) * (x - B.x) + (y - B.y) * (y - B.y) > attackRange)
			//�ж���������Ӣ���Ƿ��ڹ�����Χ��
			B.setHealth(B.health - attack);
		
		haveAttacked = 1;
	}
	
	/**
	 * �»غϿ�ʼ��ˢ������Ӣ�۵�״̬
	 */
	public void NewRound() {
		
		ActionCounter = 0;
		haveAttacked = 0;
	}
	
	/**
	 * Ӣ����������
	 */
	abstract public void LevelUp() ;
	
	abstract public void Q() ;
	
	abstract public void W() ;
	
	abstract public void E() ;
	
	abstract public void R() ;
}