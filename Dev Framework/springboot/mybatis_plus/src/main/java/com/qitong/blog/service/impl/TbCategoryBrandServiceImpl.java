package com.qitong.blog.service.impl;

import com.qitong.blog.entity.TbCategoryBrand;
import com.qitong.blog.mapper.TbCategoryBrandMapper;
import com.qitong.blog.service.TbCategoryBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系 服务实现类
 * </p>
 *
 * @author 骐通啊
 * @since 2020-04-26
 */
@Service
public class TbCategoryBrandServiceImpl extends ServiceImpl<TbCategoryBrandMapper, TbCategoryBrand> implements TbCategoryBrandService {

}
