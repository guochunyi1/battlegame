package battlegame.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import battlegame.gumble.dao.GachaHeroDao;
import battlegame.gumble.entity.GachaHero;

public class TestGachaHeroDao extends BaseTest {
	
	@Resource
	GachaHeroDao gachaHeroDao;
	
	@Test
	public void testGetGachaHero() {
		Integer gachaId = 1;
		List<GachaHero> list = gachaHeroDao.getGachaHero(gachaId);
		for(GachaHero gacha : list) {
			System.out.println(gacha.getHeroId());
		}
	}
}
