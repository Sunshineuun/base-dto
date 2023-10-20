package icu.uun.base.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageReq extends CommonReq {

    private Integer size;
    private Integer page;

    public Integer getStartRow() {
        return (page - 1) * size;
    }
}