/*
 * UserFamilyShareMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.dao.family;

import com.hcyt.familytree.hub.entity.family.UserFamilyShare;
import java.util.List;
import java.util.Map;

public interface UserFamilyShareMapper {
    int insert(UserFamilyShare record);

    int countParam(Map param);

    List<UserFamilyShare> selectParam(Map param);

    List<UserFamilyShare> selectParam_page(Map param);
}