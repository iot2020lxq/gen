/*
 * BoardExpandUserRankingService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package test.dao;

import com.hcyt.read.hub.entity.BoardExpandUserRanking;
import java.util.List;
import java.util.Map;

public interface BoardExpandUserRankingService {
    BoardExpandUserRanking findByid(Integer id);

    List<BoardExpandUserRanking> findList(Map param);

    List<BoardExpandUserRanking> findList(Map param, List<SortDescriptor> sortList);

    Page<BoardExpandUserRanking> findList(int pageNo, int pageSize, Map param);

    int insert(BoardExpandUserRanking record);

    int update(BoardExpandUserRanking record);

    int update(Map record);

    int updateList(List<BoardExpandUserRanking> list);

    int insertList(List<BoardExpandUserRanking> list);

    int saveList(List<BoardExpandUserRanking> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}