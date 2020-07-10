/*
 * TIndexFloorMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-12 Created
 */
package com.hcyt.familytree.hub.dao.family;

import com.hcyt.familytree.hub.entity.family.TIndexFloor;
import java.util.List;
import java.util.Map;

public interface TIndexFloorMapper {
    int insert(TIndexFloor record);

    int update(TIndexFloor record);

    int delete(Integer id);

    int countParam(Map param);

    TIndexFloor selectById(Integer id);

    List<TIndexFloor> selectParam(Map param);

    List<TIndexFloor> selectParam_page(Map param);
}