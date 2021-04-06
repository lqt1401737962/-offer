package com.qitong.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品分类和品牌的中间表，两者是多对多关系
 * </p>
 *
 * @author 骐通啊
 * @since 2020-04-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="TbCategoryBrand对象", description="商品分类和品牌的中间表，两者是多对多关系")
public class TbCategoryBrand implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品类目id")
    @TableId(value = "category_id", type = IdType.ID_WORKER)
    private Long categoryId;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;


}
