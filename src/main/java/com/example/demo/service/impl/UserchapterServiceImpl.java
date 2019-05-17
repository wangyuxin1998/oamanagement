package com.example.demo.service.impl;

import com.example.demo.dao.UsechapterDao;
import com.example.demo.entity.Chapter;
import com.example.demo.entity.UserChapter;
import com.example.demo.service.UsechapterService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserchapterServiceImpl implements UsechapterService {
    @Resource
    UsechapterDao usechapterDao;
    @Override
    public List<Chapter> findChapterByAll() {

        return usechapterDao.findChapterByAll();
    }

    @Override
    public int addUsechapter(UserChapter userChapter) {
        return usechapterDao.addUsechapter(userChapter);
    }
}
