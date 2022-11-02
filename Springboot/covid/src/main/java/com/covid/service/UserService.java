package com.covid.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.covid.entity.User;
import com.covid.entity.User;

public interface UserService extends IService<User> {
    public String login(User user);
    public String register(User user);
}
