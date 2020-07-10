/*
 * BoardIndexDataMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.dao;

import com.hcyt.read.hub.entity.BoardIndexData;
import java.util.List;
import java.util.Map;

public interface BoardIndexDataMapper {
    int insert(BoardIndexData record);

    int update(BoardIndexData record);

    int delete(Integer id);

    int countParam(Map param);

    BoardIndexData selectById(Integer id);

    List<BoardIndexData> selectParam(Map param);

    List<BoardIndexData> selectParam_page(Map param);
}