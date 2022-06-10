package com.qiusm.parent.base.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qiushengming
 */ /*@ApiModel(
    value = "基础分页vo",
    description = "基础分页Vo信息"
)*/
@Data
public class BaseSearch implements Serializable {
    private static final long serialVersionUID = -12111639212210044L;
    /*@ApiModelProperty(
        name = "pageNum",
        value = "页数,默认1"
    )*/
    private Integer pageNum = 1;
    /*@ApiModelProperty(
        name = "pageSize",
        value = "页大小，默认10"
    )*/
    private Integer pageSize = 10;
    /*@ApiModelProperty(
        name = "countSql",
        value = "是否count"
    )*/
    private Boolean countSql = true;
    /*@ApiModelProperty(
        name = "pages",
        value = "总页数,默认0"
    )*/
    private Integer pages = 0;
    /*@ApiModelProperty(
        name = "orderBy",
        value = "排序语法"
    )*/
    private String orderBy;
}
