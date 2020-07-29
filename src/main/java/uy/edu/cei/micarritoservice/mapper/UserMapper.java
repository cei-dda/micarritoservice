package uy.edu.cei.micarritoservice.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import uy.edu.cei.micarritoservice.entities.User;

@Repository
@Mapper
public interface UserMapper {

	public User fetchById(@Param("id") Long id);
	
}
