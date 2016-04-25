package battlegame.gumble.entity;

public class GachaCharacter {
	private Integer id;
	private Integer gachaId;
	private Integer characterId;
	private Float probability;
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
	public Integer getCharacterId() {
		return characterId;
	}
	public void setCharacterId(Integer characterId) {
		this.characterId = characterId;
	}
	public Float getProbability() {
		return probability;
	}
	public void setProbability(Float probability) {
		this.probability = probability;
	}
	
}
