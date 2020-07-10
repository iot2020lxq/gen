/*
 * BoardIndexDataService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-07-09 Created
 */
package test.dao;

import com.hcyt.read.hub.entity.BoardIndexData;
import java.util.List;
import java.util.Map;

public interface BoardIndexDataService {
    BoardIndexData findByid(Integer id);

    List<BoardIndexData> findList(Map param);

    List<BoardIndexData> findList(Map param, List<SortDescriptor> sortList);

    Page<BoardIndexData> findList(int pageNo, int pageSize, Map param);

    int insert(BoardIndexData record);

    int update(BoardIndexData record);

    int update(Map record);

    int updateList(List<BoardIndexData> list);

    int insertList(List<BoardIndexData> list);

    int saveList(List<BoardIndexData> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}