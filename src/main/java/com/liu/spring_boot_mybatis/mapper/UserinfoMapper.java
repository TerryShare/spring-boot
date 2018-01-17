package com.liu.spring_boot_mybatis.mapper;

import org.apache.ibatis.annotations.*;

import com.liu.spring_boot_mybatis.bean.Userinfo;

import java.util.List;

@Mapper
public interface UserinfoMapper {

	@Select("select * from userinfo")
	public List<Userinfo> Finduser(Userinfo userinfo);

	// #{id} 参数占位符
	@Select("select * from userinfo where id=#{id}")
	public Userinfo getid(int id);

	@Insert("insert into userinfo(id,username,password) values(#{id},#{username},#{password})")
	public int insert(Userinfo userinfo);

	@Update("update userinfo set username=#{username},password=#{password} where id=#{id} ")
	public int update(Userinfo userinfo);

	@Delete("delete from userinfo where id=#{id}")
	public  int delete(int id);

}
