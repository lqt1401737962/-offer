package com.qitong.blog.service.impl;

import com.qitong.blog.entity.TbUser;
import com.qitong.blog.mapper.TbUserMapper;
import com.qitong.blog.service.TbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author 骐通啊
 * @since 2020-04-26
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements TbUserService {

}
