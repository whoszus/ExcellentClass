/**
 *
 */
package com.phn.service;

import com.phn.model.UserEntity;

import java.util.List;

/**
 * @author phn
 */
public interface IUserService {
    boolean isExist(UserEntity user);

    List<UserEntity> getoneUser();
}
