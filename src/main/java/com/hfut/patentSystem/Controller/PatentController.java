package com.hfut.patentSystem.Controller;

import com.hfut.patentSystem.Dao.Entity.Patent;
import com.hfut.patentSystem.Service.Impl.PatentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatentController {
    @Autowired
    PatentService patentService;

    @RequestMapping("/getPatentById")
    public Patent getPatentById(long id) {
        return patentService.getPatentById(id);
    }
}
