package com.qitong.blog.service;

import com.qitong.blog.entity.TbCategory;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务类
 * </p>
 *
 * @author 骐通啊
 * @since 2020-04-26
 */
public interface TbCategoryService extends IService<TbCategory> {

}
