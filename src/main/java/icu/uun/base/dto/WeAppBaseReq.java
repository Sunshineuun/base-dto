package icu.uun.base.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author qiushengming
 */
@Data
public class WeAppBaseReq {
    @ApiModelProperty(value = "用户ID", example = "1", required = true)
    private String userId;
    @ApiModelProperty(value = "行政区编码", example = "331002", required = true)
    private String areaCode;
    @ApiModelProperty(value = "区域ID", example = "-")
    private String areaId;
    @ApiModelProperty(value = "品牌编码", example = "DHZX", required = true)
    private String brandCode;
}
