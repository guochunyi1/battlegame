package battlegame.gumble.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import battlegame.gumble.entity.GachaHero;

public interface GachaHeroMapper {
	List<GachaHero> selectGachaHero(@Param("gachaId") Integer gachaId);
}
