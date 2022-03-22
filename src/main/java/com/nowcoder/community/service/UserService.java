package com.nowcoder.community.service;

import com.nowcoder.community.entity.User;

public interface UserService {
    User selectById(int id);
    User selectByName(String name);
    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);
    int updateHeader(int id,String headerUrl);
    int updatePassword(int id,String password);

}
