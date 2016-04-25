package battlegame.gumble.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import battlegame.gumble.dao.GachaHeroDao;
import battlegame.gumble.entity.GachaHero;

public class HeroService {
	
	@Resource
	GachaHeroDao gachaHeroDao;
	
	public List<GachaHero> getGachaHeros() {
		List<GachaHero> list = new ArrayList<>();
		return list;
	}
	
	public void generateOneHero(Integer rare) {
	}
}
