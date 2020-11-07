package com.hfut.patentSystem.Dao.Mapper;

import com.hfut.patentSystem.Dao.Entity.Patent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatentMapper {
    Patent queryPatentById(Long id);
}
