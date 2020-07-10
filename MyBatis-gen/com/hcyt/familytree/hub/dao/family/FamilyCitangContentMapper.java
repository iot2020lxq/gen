/*
 * FamilyCitangContentMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.dao.family;

import com.hcyt.familytree.hub.entity.family.FamilyCitangContent;
import java.util.List;
import java.util.Map;

public interface FamilyCitangContentMapper {
    int insert(FamilyCitangContent record);

    int update(FamilyCitangContent record);

    int delete(Integer id);

    int countParam(Map param);

    FamilyCitangContent selectById(Integer id);

    List<FamilyCitangContent> selectParam(Map param);

    List<FamilyCitangContent> selectParam_page(Map param);
}