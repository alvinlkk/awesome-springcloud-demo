package com.alvinlkk.cloud.userservice.service;

import java.util.List;

import com.alvinlkk.cloud.userservice.domain.User;

/**
 * @author : alvinlkk
 * @version V1.0
 * @date Date : 2020-08-12 20:45
 */
public interface UserService {

    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);

}
