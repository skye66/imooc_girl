package com.imooc.service;


import com.imooc.domain.Girl;
import com.imooc.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@Component
@RestController
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;
    @Transactional //同时插入两条数据，如果其中一条失败，则都不插入
    public void insertTwo(){
        Girl girlA = new Girl();
        Girl girlB = new Girl();

        girlA.setAge(18);
        girlA.setCupSize("A");
        girlRepository.save(girlA);
        girlB.setAge(17);
        girlB.setCupSize("B");
        girlRepository.save(girlB);

    }
}
