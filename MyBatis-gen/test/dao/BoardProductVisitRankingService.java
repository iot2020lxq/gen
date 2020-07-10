/*
 * BoardProductVisitRankingService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package test.dao;

import com.hcyt.read.hub.entity.BoardProductVisitRanking;
import java.util.List;
import java.util.Map;

public interface BoardProductVisitRankingService {
    BoardProductVisitRanking findByid(Integer id);

    List<BoardProductVisitRanking> findList(Map param);

    List<BoardProductVisitRanking> findList(Map param, List<SortDescriptor> sortList);

    Page<BoardProductVisitRanking> findList(int pageNo, int pageSize, Map param);

    int insert(BoardProductVisitRanking record);

    int update(BoardProductVisitRanking record);

    int update(Map record);

    int updateList(List<BoardProductVisitRanking> list);

    int insertList(List<BoardProductVisitRanking> list);

    int saveList(List<BoardProductVisitRanking> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}