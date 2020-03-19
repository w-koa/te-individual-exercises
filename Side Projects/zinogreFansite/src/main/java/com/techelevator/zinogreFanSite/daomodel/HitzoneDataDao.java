package com.techelevator.zinogreFanSite.daomodel;

import java.util.List;

public interface HitzoneDataDao {

	public List<HitzoneData> getAllHitzoneData();
	
	// Don't need these, just for practice purposes
	public void updateHitzoneData();
	public void deleteHitzoneData();
	public void saveHitzoneData();
}
