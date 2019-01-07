package houseserviceimpl;

import entity.House;
import housedaoimpl.HouseDaoimpl;
import ihousedao.IhouseDao;
import ihouseservice.IhouseService;

public class HouseServiceimpl implements IhouseService {
IhouseDao housedao=new HouseDaoimpl();
public boolean addhouse(House house) {
	return housedao.addhouse(house);
}
public boolean deletehouse(int username) {
	return housedao.deletehouse(username);
}
public boolean addhouse2(House house) {
	return housedao.addhouse2(house);
	
}
}
