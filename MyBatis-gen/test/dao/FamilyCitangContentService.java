/*
 * FamilyCitangContentService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package test.dao;

import com.hcyt.familytree.hub.entity.family.FamilyCitangContent;
import java.util.List;
import java.util.Map;

public interface FamilyCitangContentService {
    FamilyCitangContent findByid(Integer id);

    List<FamilyCitangContent> findList(Map param);

    List<FamilyCitangContent> findList(Map param, List<SortDescriptor> sortList);

    Page<FamilyCitangContent> findList(int pageNo, int pageSize, Map param);

    int insert(FamilyCitangContent record);

    int update(FamilyCitangContent record);

    int update(Map record);

    int updateList(List<FamilyCitangContent> list);

    int insertList(List<FamilyCitangContent> list);

    int saveList(List<FamilyCitangContent> list);

    int delete(Integer id);

    int deleteList(List<Integer> list);
}