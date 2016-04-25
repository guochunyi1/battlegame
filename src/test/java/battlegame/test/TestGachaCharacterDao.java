package battlegame.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import battlegame.gumble.dao.GachaCharacterDao;
import battlegame.gumble.entity.GachaCharacter;

public class TestGachaCharacterDao extends BaseTest {
	
	@Resource
	GachaCharacterDao gachaCharacterDao;
	
	@Test
	public void testGetGachaCharacter() {
		Integer gachaId = 1;
		List<GachaCharacter> list = gachaCharacterDao.getGachaCharacter(gachaId);
		for(GachaCharacter gacha : list) {
			System.out.println(gacha.getCharacterId());
		}
	}
}
