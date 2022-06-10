package com.qiusm.parent.base.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qiushengming
 */ /*@ApiModel(
    value = "基础vo",
    description = "基础Vo信息"
)*/
@Data
public class BaseVo implements Serializable {
    private static final long serialVersionUID = -12331639218814045L;
    /*@ApiModelProperty(
        value = "id",
        name = "id"
    )*/
    private Long id;
    /*@ApiModelProperty(
        value = "删除标志0,1",
        name = "isDel"
    )*/
    private Boolean isDel;
    /*@ApiModelProperty(
        value = "创建时间",
        name = "createTime"
    )*/
    private Date createTime;
    /*@ApiModelProperty(
        value = "更新时间",
        name = "updateTime"
    )*/
    private Date updateTime;
    /*@ApiModelProperty(
        value = "备注",
        name = "remark"
    )*/
    private String remark;
}
