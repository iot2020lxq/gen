/*
 * BoardExpandRankingService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package test.dao;

import com.hcyt.read.hub.entity.BoardExpandRanking;
import java.util.List;
import java.util.Map;

public interface BoardExpandRankingService {
    BoardExpandRanking findByid(Integer id);

    List<BoardExpandRanking> findList(Map param);

    List<BoardExpandRanking> findList(Map param, List<SortDescriptor> sortList);

    Page<BoardExpandRanking> findList(int pageNo, int pageSize, Map param);

    int insert(BoardExpandRanking record);

    int update(BoardExpandRanking record);

    int update(Map record);

    int updateList(List<BoardExpandRanking> list);

    int insertList(List<BoardExpandRanking> list);

    int saveList(List<BoardExpandRanking> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}