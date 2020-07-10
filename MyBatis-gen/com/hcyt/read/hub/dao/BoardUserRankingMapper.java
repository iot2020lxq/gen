/*
 * BoardUserRankingMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.dao;

import com.hcyt.read.hub.entity.BoardUserRanking;
import java.util.List;
import java.util.Map;

public interface BoardUserRankingMapper {
    int insert(BoardUserRanking record);

    int update(BoardUserRanking record);

    int delete(Integer id);

    int countParam(Map param);

    BoardUserRanking selectById(Integer id);

    List<BoardUserRanking> selectParam(Map param);

    List<BoardUserRanking> selectParam_page(Map param);
}