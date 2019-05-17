package com.example.demo.service;

import com.example.demo.entity.Chapter;
import com.example.demo.entity.UserChapter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsechapterService {
    List<Chapter> findChapterByAll();
    int  addUsechapter(UserChapter userChapter);
}
