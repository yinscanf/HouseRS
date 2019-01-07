package houanduseservcieimpl;

import java.util.List;

import entity.HouandUse;
import houandusedaoimpl.HouandUsedaoimpl;
import ihouandusedao.IhouanduseDao;
import ihouanduseservice.IhouanduseService;

public class HouanduseServiceimpl implements IhouanduseService {
	IhouanduseDao  houandusedao=new HouandUsedaoimpl();
	public List<HouandUse> queryhandu(int username){
		return houandusedao.queryhandu(username);
	}
}
