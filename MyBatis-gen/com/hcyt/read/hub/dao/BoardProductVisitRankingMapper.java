/*
 * BoardProductVisitRankingMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.dao;

import com.hcyt.read.hub.entity.BoardProductVisitRanking;
import java.util.List;
import java.util.Map;

public interface BoardProductVisitRankingMapper {
    int insert(BoardProductVisitRanking record);

    int update(BoardProductVisitRanking record);

    int delete(Integer id);

    int countParam(Map param);

    BoardProductVisitRanking selectById(Integer id);

    List<BoardProductVisitRanking> selectParam(Map param);

    List<BoardProductVisitRanking> selectParam_page(Map param);
}