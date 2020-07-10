/*
 * BoardUserRankingService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package test.dao;

import com.hcyt.read.hub.entity.BoardUserRanking;
import java.util.List;
import java.util.Map;

public interface BoardUserRankingService {
    BoardUserRanking findByid(Integer id);

    List<BoardUserRanking> findList(Map param);

    List<BoardUserRanking> findList(Map param, List<SortDescriptor> sortList);

    Page<BoardUserRanking> findList(int pageNo, int pageSize, Map param);

    int insert(BoardUserRanking record);

    int update(BoardUserRanking record);

    int update(Map record);

    int updateList(List<BoardUserRanking> list);

    int insertList(List<BoardUserRanking> list);

    int saveList(List<BoardUserRanking> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}