package com.hfut.patentSystem.Dao.Mapper;

import com.hfut.patentSystem.Dao.Entity.Patent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
public interface PatentMapper {
    @Select("select * from tb_patent where id = #{id}")
    Patent queryPatentById(Integer id);
}
