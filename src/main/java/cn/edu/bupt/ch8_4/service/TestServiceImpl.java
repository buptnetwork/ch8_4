package cn.edu.bupt.ch8_4.service;

import cn.edu.bupt.ch8_4.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService{
    @Autowired
    private TestDao testDao;
    @Override
    public void save() {
        testDao.save();
        System.out.println("testService Save");
    }
}
