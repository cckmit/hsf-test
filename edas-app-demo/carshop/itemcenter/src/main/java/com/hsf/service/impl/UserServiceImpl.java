package com.hsf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsf.mapper.shiro.UUserMapper;
import com.hsf.model.UUser;
import com.hsf.model.UUserExample;
import com.hsf.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UUserMapper userMapper;
	
	@Override
	public long countByExample(UUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(UUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(UUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(UUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UUser> selectByExample(UUserExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UUser selectByPrimaryKey(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(UUser record, UUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(UUser record, UUserExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(UUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(UUser record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
