package cn.edu.bupt.ch8_4.dao;

import org.springframework.stereotype.Repository;

@Repository
public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("testDao Save");
    }
}
