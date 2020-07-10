/*
 * IndexButtonService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-13 Created
 */
package test.dao;

import com.hcyt.familytree.hub.entity.family.IndexButton;
import java.util.List;
import java.util.Map;

public interface IndexButtonService {
    IndexButton findByid(Integer id);

    List<IndexButton> findList(Map param);

    List<IndexButton> findList(Map param, List<SortDescriptor> sortList);

    Page<IndexButton> findList(int pageNo, int pageSize, Map param);

    int insert(IndexButton record);

    int update(IndexButton record);

    int update(Map record);

    int updateList(List<IndexButton> list);

    int insertList(List<IndexButton> list);

    int saveList(List<IndexButton> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}