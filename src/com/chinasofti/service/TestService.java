package com.chinasofti.service;

import com.chinasofti.dao.TestDao;
import com.chinasofti.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Service
@Transactional
public class TestService {
    @Autowired
    private TestDao testDao;

    public void insertTb(User user){
        testDao.insertTb(user);
    }
}
