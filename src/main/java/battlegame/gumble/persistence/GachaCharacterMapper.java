package battlegame.gumble.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import battlegame.gumble.entity.GachaCharacter;

public interface GachaCharacterMapper {
	List<GachaCharacter> selectGachaCharacter(@Param("gachaId") Integer gachaId);
}
