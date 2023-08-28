package icu.uun.base.dto;

import lombok.Data;

import java.util.List;

@Data
public class CommonReq {
    /**
     * 用户ID
     */
    private Long userId;
    /**
     * 坐标定位区域代码
     */
    private String areaCode;
    /**
     * 品牌代码
     */
    private String brandCode;
    /**
     * 角色代码 没有就为空
     */
    private String roleCode;
    private List<Integer> roleIds;
}