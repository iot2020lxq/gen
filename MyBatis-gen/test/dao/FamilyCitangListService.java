/*
 * FamilyCitangListService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package test.dao;

import com.hcyt.familytree.hub.entity.family.FamilyCitangList;
import java.util.List;
import java.util.Map;

public interface FamilyCitangListService {
    FamilyCitangList findByid(Integer id);

    List<FamilyCitangList> findList(Map param);

    List<FamilyCitangList> findList(Map param, List<SortDescriptor> sortList);

    Page<FamilyCitangList> findList(int pageNo, int pageSize, Map param);

    int insert(FamilyCitangList record);

    int update(FamilyCitangList record);

    int update(Map record);

    int updateList(List<FamilyCitangList> list);

    int insertList(List<FamilyCitangList> list);

    int saveList(List<FamilyCitangList> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}