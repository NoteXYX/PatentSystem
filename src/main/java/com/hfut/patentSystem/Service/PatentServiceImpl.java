package com.hfut.patentSystem.Service;

import com.hfut.patentSystem.Dao.Entity.Patent;
import com.hfut.patentSystem.Dao.Mapper.PatentMapper;
import com.hfut.patentSystem.Service.Impl.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatentServiceImpl implements PatentService {

    @Autowired
    PatentMapper patentMapper;

    @Override
    public Patent getPatentById(int id) {
        return patentMapper.queryPatentById(id);
    }
}
