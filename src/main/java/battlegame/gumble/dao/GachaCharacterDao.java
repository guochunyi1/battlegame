package battlegame.gumble.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import battlegame.gumble.entity.GachaCharacter;
import battlegame.gumble.persistence.GachaCharacterMapper;

@Repository
public class GachaCharacterDao {
	@Resource
	GachaCharacterMapper gachaCharacterMapper;
	
	public List<GachaCharacter> getGachaCharacter(Integer gachaId) {
		return gachaCharacterMapper.selectGachaCharacter(gachaId);
	}
}
