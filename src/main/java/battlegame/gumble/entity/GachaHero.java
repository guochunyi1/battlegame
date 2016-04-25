package battlegame.gumble.entity;

public class GachaHero {
	private Integer id;
	private Integer gachaId;
	private Integer heroId;
	private Float probability;
	
	public Integer getHeroId() {
		return heroId;
	}
	public void setHeroId(Integer heroId) {
		this.heroId = heroId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getGachaId() {
		return gachaId;
	}
	public void setGachaId(Integer gachaId) {
		this.gachaId = gachaId;
	}
	public Float getProbability() {
		return probability;
	}
	public void setProbability(Float probability) {
		this.probability = probability;
	}
	
}
