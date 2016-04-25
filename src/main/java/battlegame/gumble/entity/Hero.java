package battlegame.gumble.entity;

public class Hero {
	private String name;
	private Integer id;
	private Integer attack;
	private Integer hp;
	private Integer defense;
	private Integer rare;
	public Integer getRare() {
		return rare;
	}
	public void setRare(Integer rare) {
		this.rare = rare;
	}
	public Integer getAttack() {
		return attack;
	}
	public void setAttack(Integer attack) {
		this.attack = attack;
	}
	public Integer getHp() {
		return hp;
	}
	public void setHp(Integer hp) {
		this.hp = hp;
	}
	public Integer getDefense() {
		return defense;
	}
	public void setDefense(Integer defense) {
		this.defense = defense;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
}
