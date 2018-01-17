package com.liu.spring_boot_mybatis.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liu.spring_boot_mybatis.bean.Userinfo;
import com.liu.spring_boot_mybatis.mapper.UserinfoMapper;

@Service
public class UserinfoService {
	@Autowired
	private UserinfoMapper userinfoMapper;

	public List<Userinfo>  Finduser(Userinfo userinfo){return userinfoMapper.Finduser(userinfo);}
	public Userinfo getid(int id ) {
		return userinfoMapper.getid(id);
	}
	public  int insert(Userinfo userinfo) {
		return userinfoMapper.insert(userinfo);
	}
	public  int update(Userinfo userinfo){return  userinfoMapper.update(userinfo);}
	public  int delete(int id){return  userinfoMapper.delete(id);}
}
