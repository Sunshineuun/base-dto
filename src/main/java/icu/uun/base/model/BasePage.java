package icu.uun.base.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author qiushengming
 */ /*@ApiModel(
    value = "基础分页vo",
    description = "基础分页信息"
)*/
@Data
public class BasePage<T> implements Serializable {
    private static final long serialVersionUID = -11231639218814045L;
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
    /*@ApiModelProperty(
        name = "list",
        value = "返回结果list对象"
    )*/
    private List<T> list;
}
