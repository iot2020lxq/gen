/*
 * BoardVisitRankingService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package test.dao;

import com.hcyt.read.hub.entity.BoardVisitRanking;
import java.util.List;
import java.util.Map;

public interface BoardVisitRankingService {
    BoardVisitRanking findByid(Integer id);

    List<BoardVisitRanking> findList(Map param);

    List<BoardVisitRanking> findList(Map param, List<SortDescriptor> sortList);

    Page<BoardVisitRanking> findList(int pageNo, int pageSize, Map param);

    int insert(BoardVisitRanking record);

    int update(BoardVisitRanking record);

    int update(Map record);

    int updateList(List<BoardVisitRanking> list);

    int insertList(List<BoardVisitRanking> list);

    int saveList(List<BoardVisitRanking> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}