package com.whoszus.model.FirstModel.service.impl;

import com.whoszus.model.FirstModel.DAO.IFirstModelDao;
import com.whoszus.model.FirstModel.entity.ClassCatcher;
import com.whoszus.model.FirstModel.service.IFirstModelService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2015/10/29.
 */

@Transactional
@Service("firstModelService")
public class IFirstModelServiceImpl implements IFirstModelService {
    @Resource
    private IFirstModelDao firstModelDao;


    @Override
    public List<ClassCatcher> getCc() {
        return null;
    }

    @Override
    public void setCc(ClassCatcher cc) {

        firstModelDao.setCc(cc);

    }
}
