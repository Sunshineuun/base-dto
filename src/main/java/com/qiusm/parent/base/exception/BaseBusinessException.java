package com.qiusm.parent.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * 所有业务异常必须继承该类，这样在异常统一处理的时候会进行拦截，并报告给CAT <br>
 *
 * @author qiushengming
 */
public class BaseBusinessException extends RuntimeException {
    private static final Logger log = LoggerFactory.getLogger(BaseBusinessException.class);
    protected String businessCode;
    protected Object[] args;
    protected String subcode;
    protected BaseBusinessException.Level level;

    public BaseBusinessException(String message) {
        super(message);
        this.level = BaseBusinessException.Level.WARN;
    }

    public BaseBusinessException(String message, String businessCode) {
        super(message);
        this.level = BaseBusinessException.Level.WARN;
        this.businessCode = businessCode;
    }

    public BaseBusinessException(String message, String businessCode, String subcode) {
        super(message);
        this.level = BaseBusinessException.Level.WARN;
        this.businessCode = businessCode;
        this.subcode = subcode;
    }

    public String getBusinessCode() {
        return this.businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public Object[] getArgs() {
        return this.args;
    }

    public void setArgs(Object[] args) {
        this.args = args;
    }

    public BaseBusinessException.Level getLevel() {
        return this.level;
    }

    public void setLevel(BaseBusinessException.Level level) {
        this.level = level;
    }

    public String getSubcode() {
        return this.subcode;
    }

    public void setSubcode(String subcode) {
        this.subcode = subcode;
    }

    @Override
    public String toString() {
        StringBuffer argsBuf = new StringBuffer();

        for (int i = 0; this.args != null && i < this.args.length; ++i) {
            argsBuf.append(this.args[i]);
            if (i + 1 < this.args.length) {
                argsBuf.append(",");
            }
        }

        return "{" + this.getClass().getName() + "@" + this.hashCode() + "[" + this.businessCode + "(" + argsBuf + ")]:" + this.getMessage() + "," + this.subcode + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj.getClass() != this.getClass()) {
            return false;
        } else {
            BaseBusinessException otherBe = (BaseBusinessException) obj;
            if (!otherBe.businessCode.equals(this.businessCode)) {
                return false;
            } else if (!otherBe.getLevel().equals(this.level)) {
                return false;
            } else if (otherBe.args.length != this.args.length) {
                return false;
            } else if (!otherBe.subcode.equals(this.subcode)) {
                return false;
            } else {
                for (int i = 0; i < this.args.length; ++i) {
                    if (!this.args[i].equals(otherBe.args[i])) {
                        return false;
                    }
                }

                return true;
            }
        }
    }

    @Override
    public int hashCode() {
        int subHashCode = 0;
        if (null != this.subcode) {
            subHashCode = this.subcode.hashCode();
        }

        int result = this.businessCode.hashCode() + subHashCode;
        result = 31 * result + Arrays.hashCode(this.args);
        result = 31 * result + this.level.hashCode();
        return result;
    }

    public enum Level {
        INFO,
        WARN,
        ERROR,
        FATAL;

        Level() {
        }
    }
}
