
package com.qiusm.parent.base.model;

import com.qiusm.parent.base.exception.BaseBusinessException;
import lombok.Data;
import org.springframework.util.DigestUtils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author qiushengming
 */ //@ApiModel(description = "接口统一返回BaseDTO<T>对象")
@Data
public class BaseDTO<T> implements Serializable {
    private static final long serialVersionUID = -5809782578272943999L;
    /*@ApiModelProperty(
        value = "响应码",
        name = "code",
        example = "接口返回值(1:成功;0:失败)",
        required = true
    )*/
    private String code;
    /*@ApiModelProperty(
        value = "响应消息",
        name = "msg",
        example = "提示信息代码对应的消息"
    )*/
    private String msg;
    /*@ApiModelProperty(
        value = "响应结果Map<String,Object>",
        name = "result"
    )*/
    private Map<String, Object> result;
    /*@ApiModelProperty(
        value = "具体vo对象",
        name = "resultVo"
    )*/
    private T resultVo;
    /*@ApiModelProperty(
        value = "签名",
        name = "sign",
        example = "签名"
    )*/
    private String sign;
    /*@ApiModelProperty(
        value = "附加码",
        name = "subcode"
    )*/
    private String subcode;

    public BaseDTO() {
        this.code = BaseDTOCode.SUCCESS.getCode();
        this.msg = "操作成功";
    }

    public void setCodeAndMsg(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setCodeAndMsg(String code, String msg, String subcode) {
        this.code = code;
        this.msg = msg;
        this.subcode = subcode;
    }

    public BaseDTO<T> addObject(String name, Object o) {
        if (this.result == null) {
            this.result = new HashMap<>(8);
        }

        this.result.put(name, o);
        return this.signature();
    }

    public BaseDTO<T> fail(String msg) {
        this.code = BaseDTOCode.FAILED.getCode();
        this.msg = msg;
        return this;
    }

    public T assertSuccess() {
        if (!this.isSuccess()) {
            throw new BaseBusinessException(this.getMsg(), this.getCode());
        } else {
            return this.getResultVo();
        }
    }

    public boolean isSuccess() {
        return BaseDTOCode.SUCCESS.getCode().equals(this.code);
    }

    public BaseDTO<T> signature() {
        this.sign = DigestUtils.md5DigestAsHex(this.toString().getBytes());
        return this;
    }

}
