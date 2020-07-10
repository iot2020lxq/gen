/*
 * BoardShareRankingService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package test.dao;

import com.hcyt.read.hub.entity.BoardShareRanking;
import java.util.List;
import java.util.Map;

public interface BoardShareRankingService {
    BoardShareRanking findByid(Integer id);

    List<BoardShareRanking> findList(Map param);

    List<BoardShareRanking> findList(Map param, List<SortDescriptor> sortList);

    Page<BoardShareRanking> findList(int pageNo, int pageSize, Map param);

    int insert(BoardShareRanking record);

    int update(BoardShareRanking record);

    int update(Map record);

    int updateList(List<BoardShareRanking> list);

    int insertList(List<BoardShareRanking> list);

    int saveList(List<BoardShareRanking> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}