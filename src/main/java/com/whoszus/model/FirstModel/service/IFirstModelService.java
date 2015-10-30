package com.whoszus.model.FirstModel.service;

import com.whoszus.model.FirstModel.entity.ClassCatcher;

import java.util.List;

/**
 * Created by Administrator on 2015/10/29.
 */
public interface IFirstModelService {
    List<ClassCatcher> getCc();

    void setCc(ClassCatcher cc);
}
