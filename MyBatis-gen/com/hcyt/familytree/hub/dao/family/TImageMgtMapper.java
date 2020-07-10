/*
 * TImageMgtMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-11 Created
 */
package com.hcyt.familytree.hub.dao.family;

import com.hcyt.familytree.hub.entity.family.TImageMgt;
import java.util.List;
import java.util.Map;

public interface TImageMgtMapper {
    int insert(TImageMgt record);

    int update(TImageMgt record);

    int delete(Integer id);

    int countParam(Map param);

    TImageMgt selectById(Integer id);

    List<TImageMgt> selectParam(Map param);

    List<TImageMgt> selectParam_page(Map param);
}