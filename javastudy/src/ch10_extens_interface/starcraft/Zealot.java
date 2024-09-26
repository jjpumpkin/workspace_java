package ch10_extens_interface.starcraft;

public class Zealot extends StarUnit {

	 private int shield; // 질럿은 보호막이 있음

	public Zealot() {
		super();
	}
	public Zealot(String name, int damage, int hp, int armor, int shield) {
		super(name, damage, hp, armor);
		this.shield = shield;
		
	}
	public int getShield() {
		return shield;
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	@Override
	public String toString() {
		return "Zealot [shield=" + shield + ", getShield()=" + getShield() + ", getName()=" + getName()
				+ ", getDamage()=" + getDamage() + ", getHp()=" + getHp() + ", getArmor()=" + getArmor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	}

	
	
	
	 

