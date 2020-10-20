package com.xl.service;

import com.xl.entity.manager;
import com.xl.dao.managerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class managerServiceImpl implements managerService{

    @Autowired
    private managerDao managerDao;
    @Override
    public manager login(String account, String password) {

        return managerDao.login(account, password);
    }


}
