package icu.uun.base.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author qiushengming
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BrandBaseResp extends BaseResp{
    private String brandCode;
    private String areaCode;
    private String areaName;
    private String parentName;
}
