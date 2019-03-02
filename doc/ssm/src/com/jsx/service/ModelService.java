package com.jsx.service;

import java.util.List;
import java.util.Map;

import com.jsx.model.User;

public interface ModelService {
	public List<User> getAll();
    public User getUser(User user);
    public int delete(User user);
    public int update(User user);
    public int add(User user);
    public List<User> find(Map<String,Object> map);
    public Long getTotal(Map<String,Object> map);
}
