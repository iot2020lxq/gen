/*
 * BoardExpandRankingMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.dao;

import com.hcyt.read.hub.entity.BoardExpandRanking;
import java.util.List;
import java.util.Map;

public interface BoardExpandRankingMapper {
    int insert(BoardExpandRanking record);

    int update(BoardExpandRanking record);

    int delete(Integer id);

    int countParam(Map param);

    BoardExpandRanking selectById(Integer id);

    List<BoardExpandRanking> selectParam(Map param);

    List<BoardExpandRanking> selectParam_page(Map param);
}