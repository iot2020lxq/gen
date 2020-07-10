/*
 * UserFamilyShareService.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package test.dao;

import com.hcyt.familytree.hub.entity.family.UserFamilyShare;
import java.util.List;
import java.util.Map;

public interface UserFamilyShareService {
    List<UserFamilyShare> findList(Map param);

    List<UserFamilyShare> findList(Map param, List<SortDescriptor> sortList);

    Page<UserFamilyShare> findList(int pageNo, int pageSize, Map param);

    int insert(UserFamilyShare record);

    int updateList(List<UserFamilyShare> list);

    int insertList(List<UserFamilyShare> list);

    int saveList(List<UserFamilyShare> list);
}