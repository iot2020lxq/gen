/*
 * TIndexFloorService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-12 Created
 */
package test.dao;

import com.hcyt.familytree.hub.entity.family.TIndexFloor;
import java.util.List;
import java.util.Map;

public interface TIndexFloorService {
    TIndexFloor findByid(Integer id);

    List<TIndexFloor> findList(Map param);

    List<TIndexFloor> findList(Map param, List<SortDescriptor> sortList);

    Page<TIndexFloor> findList(int pageNo, int pageSize, Map param);

    int insert(TIndexFloor record);

    int update(TIndexFloor record);

    int update(Map record);

    int updateList(List<TIndexFloor> list);

    int insertList(List<TIndexFloor> list);

    int saveList(List<TIndexFloor> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}