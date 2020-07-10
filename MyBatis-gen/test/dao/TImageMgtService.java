/*
 * TImageMgtService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package test.dao;

import com.hcyt.familytree.hub.entity.family.TImageMgt;
import java.util.List;
import java.util.Map;

public interface TImageMgtService {
    TImageMgt findByid(Integer id);

    List<TImageMgt> findList(Map param);

    List<TImageMgt> findList(Map param, List<SortDescriptor> sortList);

    Page<TImageMgt> findList(int pageNo, int pageSize, Map param);

    int insert(TImageMgt record);

    int update(TImageMgt record);

    int update(Map record);

    int updateList(List<TImageMgt> list);

    int insertList(List<TImageMgt> list);

    int saveList(List<TImageMgt> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}