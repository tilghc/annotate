package com.baizhi.service;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class UserServiceImpl implements  UserService {
    @Autowired
    private UserDao userdao;
    @Override
    @Transactional
    public void register(User user) {
      userdao.save(user);
    }
}
