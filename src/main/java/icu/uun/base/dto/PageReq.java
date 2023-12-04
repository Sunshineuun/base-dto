package icu.uun.base.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PageReq extends CommonReq {
    @ApiModelProperty(value = "用户ID", example = "1", required = true)
    private Integer size;
    @ApiModelProperty(value = "页码", example = "1", required = true)
    private Integer page;

    public Integer getStartRow() {
        return (page - 1) * size;
    }
}