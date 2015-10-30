/**
 *
 */
package com.phn.dao;

import com.phn.model.UserEntity;

import java.util.List;

/**
 * @author phn
 */
public interface IUserDao {
    boolean isExist(UserEntity user);

    List<UserEntity> getoneUser();
}
