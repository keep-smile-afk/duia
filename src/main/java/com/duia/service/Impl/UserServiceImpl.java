package com.duia.service.Impl;

import com.duia.entity.Users;
import com.duia.entity.UsersExample;
import com.duia.mapping.UsersMapper;
import com.duia.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Service
public class UserServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    public List<Users> selectByExample(UsersExample example) {
        return null;
    }
}
