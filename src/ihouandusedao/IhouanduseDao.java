package ihouandusedao;

import java.util.List;

import entity.HouandUse;

public interface IhouanduseDao {
	//个人主页，查询发布房屋信息
public List<HouandUse> queryhandu(int username);
}
