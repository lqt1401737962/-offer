package com.qitong.blog.mapper;

import com.qitong.blog.entity.TbCategoryBrand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 Mapper 接口
 * </p>
 *
 * @author 骐通啊
 * @since 2020-04-26
 */
public interface TbCategoryBrandMapper extends BaseMapper<TbCategoryBrand> {

}
