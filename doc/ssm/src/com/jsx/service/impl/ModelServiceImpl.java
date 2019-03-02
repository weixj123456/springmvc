package com.jsx.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsx.dao.ModelDao;
import com.jsx.model.User;
import com.jsx.service.ModelService;

@Service("modelService")
	public class ModelServiceImpl  implements ModelService {
	   @Autowired
	    private ModelDao modelDao;
	    
	    public ModelDao getModelDao() {
	        return modelDao;
	    }
	 
	    @Resource
	    public void setModelDao(ModelDao modelDao) {
	        this.modelDao = modelDao;
	    }
	 
	    public List<User> getAll() {
	        // TODO Auto-generated method stub
	        return modelDao.getAll();
	    }
	 
	    public User getUser(User user) {
	        // TODO Auto-generated method stub
	        return modelDao.getUser(user);
	    }
	 
	    public int delete(User user) {
	        // TODO Auto-generated method stub
	        return modelDao.delete(user);
	    }
	 
	    public int update(User user) {
	        // TODO Auto-generated method stub
	        return modelDao.update(user);
	    }
	 
	    public int add(User user) {
	        // TODO Auto-generated method stub
	        return modelDao.add(user);
	    }
	 
	    public List<User> find(Map<String, Object> map) {
	        // TODO Auto-generated method stub
	        return modelDao.find(map);
	    }
	 
	    public Long getTotal(Map<String, Object> map) {
	        // TODO Auto-generated method stub
	        return modelDao.getTotal(map);
	    }
	 
	}
	

