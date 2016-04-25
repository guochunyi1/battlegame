package battlegame.gumble.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import battlegame.gumble.entity.GachaHero;
import battlegame.gumble.persistence.GachaHeroMapper;

@Repository
public class GachaHeroDao {
	@Resource
	GachaHeroMapper gachaHeroMapper;
	
	public List<GachaHero> getGachaHero(Integer gachaId) {
		return gachaHeroMapper.selectGachaHero(gachaId);
	}
}
