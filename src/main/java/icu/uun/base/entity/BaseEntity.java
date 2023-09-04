package icu.uun.base.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qiushengming
 */
@Data
public class BaseEntity<T> implements Serializable {
    private T id;
    private Date createTime;
    private Date updateTime;
    private String updateBy;
}
