/*
 * BoardVisitRankingMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.dao;

import com.hcyt.read.hub.entity.BoardVisitRanking;
import java.util.List;
import java.util.Map;

public interface BoardVisitRankingMapper {
    int insert(BoardVisitRanking record);

    int update(BoardVisitRanking record);

    int delete(Integer id);

    int countParam(Map param);

    BoardVisitRanking selectById(Integer id);

    List<BoardVisitRanking> selectParam(Map param);

    List<BoardVisitRanking> selectParam_page(Map param);
}