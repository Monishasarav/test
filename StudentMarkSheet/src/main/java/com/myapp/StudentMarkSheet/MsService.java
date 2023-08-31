package com.myapp.StudentMarkSheet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MsService {
	@Autowired
	MsDao dao;

	public String display(List<MarkSheet> a) {
		a.forEach(x -> {
			x.setSem1Total(x.getSem1Practicals() + x.getSem1Theory());
			x.setSem2Total(x.getSem2Practicals() + x.getSem2Theory());
		});
		return dao.display(a);
	}

}
