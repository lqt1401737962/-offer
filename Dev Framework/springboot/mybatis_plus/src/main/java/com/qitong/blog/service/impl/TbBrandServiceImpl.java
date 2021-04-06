package com.qitong.blog.service.impl;

import com.qitong.blog.entity.TbBrand;
import com.qitong.blog.mapper.TbBrandMapper;
import com.qitong.blog.service.TbBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 服务实现类
 * </p>
 *
 * @author 骐通啊
 * @since 2020-04-26
 */
@Service
public class TbBrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand> implements TbBrandService {

}
