package com.edu118.commodity.dao;

import com.edu118.common.entity.commodity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 21:58:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
