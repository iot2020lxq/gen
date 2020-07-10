/*
 * FamilyCitangListMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.dao.family;

import com.hcyt.familytree.hub.entity.family.FamilyCitangList;
import java.util.List;
import java.util.Map;

public interface FamilyCitangListMapper {
    int insert(FamilyCitangList record);

    int update(FamilyCitangList record);

    int delete(Integer id);

    int countParam(Map param);

    FamilyCitangList selectById(Integer id);

    List<FamilyCitangList> selectParam(Map param);

    List<FamilyCitangList> selectParam_page(Map param);
}