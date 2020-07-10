/*
 * BoardExpandUserRankingMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package com.hcyt.read.hub.dao;

import com.hcyt.read.hub.entity.BoardExpandUserRanking;
import java.util.List;
import java.util.Map;

public interface BoardExpandUserRankingMapper {
    int insert(BoardExpandUserRanking record);

    int update(BoardExpandUserRanking record);

    int delete(Integer id);

    int countParam(Map param);

    BoardExpandUserRanking selectById(Integer id);

    List<BoardExpandUserRanking> selectParam(Map param);

    List<BoardExpandUserRanking> selectParam_page(Map param);
}