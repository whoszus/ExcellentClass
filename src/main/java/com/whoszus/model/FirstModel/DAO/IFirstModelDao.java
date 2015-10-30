package com.whoszus.model.FirstModel.DAO;

import com.whoszus.model.FirstModel.entity.ClassCatcher;

import java.util.List;

/**
 * Created by Administrator on 2015/10/29.
 */
public interface IFirstModelDao {
    List<ClassCatcher> getCc();

    void setCc(ClassCatcher cc);
}
