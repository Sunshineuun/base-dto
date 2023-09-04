package icu.uun.base.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author qiushengming
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseLogicEntity extends BaseEntity {
    private Integer isDeleted;
}
