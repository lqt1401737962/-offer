package com.qitong.blog.service.impl;

import com.qitong.blog.entity.TbCategory;
import com.qitong.blog.mapper.TbCategoryMapper;
import com.qitong.blog.service.TbCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务实现类
 * </p>
 *
 * @author 骐通啊
 * @since 2020-04-26
 */
@Service
public class TbCategoryServiceImpl extends ServiceImpl<TbCategoryMapper, TbCategory> implements TbCategoryService {

}
