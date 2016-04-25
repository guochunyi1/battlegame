package battlegame.gumble.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import battlegame.gumble.dao.GachaCharacterDao;
import battlegame.gumble.entity.GachaCharacter;

public class CharacterService {
	
	@Resource
	GachaCharacterDao gachaCharacterDao;
	
	public List<GachaCharacter> getGachaCharacters() {
		List<GachaCharacter> list = new ArrayList<>();
		return list;
	}
}
