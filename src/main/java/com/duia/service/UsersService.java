package com.duia.service;

import com.duia.entity.Users;
import com.duia.entity.UsersExample;

import java.util.List;

public interface UsersService {
    List<Users> selectByExample(UsersExample example);
}
