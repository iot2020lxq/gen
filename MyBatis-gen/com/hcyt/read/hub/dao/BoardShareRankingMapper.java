/*
 * BoardShareRankingMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.dao;

import com.hcyt.read.hub.entity.BoardShareRanking;
import java.util.List;
import java.util.Map;

public interface BoardShareRankingMapper {
    int insert(BoardShareRanking record);

    int update(BoardShareRanking record);

    int delete(Integer id);

    int countParam(Map param);

    BoardShareRanking selectById(Integer id);

    List<BoardShareRanking> selectParam(Map param);

    List<BoardShareRanking> selectParam_page(Map param);
}