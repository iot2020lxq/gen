/*
 * IndexButtonMapper.java
 * Copyright(C) 20xx-2015 湖南拓维信息股份有限公司
 * All rights reserved.
 * -----------------------------------------------
 * 2020-05-13 Created
 */
package com.hcyt.familytree.hub.dao.family;

import com.hcyt.familytree.hub.entity.family.IndexButton;
import java.util.List;
import java.util.Map;

public interface IndexButtonMapper {
    int insert(IndexButton record);

    int update(IndexButton record);

    int delete(Integer id);

    int countParam(Map param);

    IndexButton selectById(Integer id);

    List<IndexButton> selectParam(Map param);

    List<IndexButton> selectParam_page(Map param);
}