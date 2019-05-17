package com.example.demo.dao;

import com.example.demo.entity.Chapter;
import com.example.demo.entity.UserChapter;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsechapterDao {
    /*获取所有的章*/
    List<Chapter> findChapterByAll();
    /*添加用章申请*/
    int  addUsechapter(@Param("userChapter") UserChapter userChapter);
}
