package com.myapp.electronics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectronicsService {

	@Autowired
	ElectronicsDao dao;

public String display(List<Electronics> a) {
	return dao.display(a);
}

	public String update(List<Electronics> a,int id) {
		return dao.update(a,id);
	}

	public String patch(List<Electronics> a,int id) {
		return dao.patch(a,id);
	}

}
