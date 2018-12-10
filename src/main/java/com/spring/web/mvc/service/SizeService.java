package com.spring.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.mvc.dao.ISizeDao;

@Service("SizeService")
public class SizeService implements ISizeService {

	@Autowired //byTpe , @Qualifier , byName
	private ISizeDao sizeDao;
	
	@Override
	public List<String> findSizes(){
		return sizeDao.findSizes();
	}

}
