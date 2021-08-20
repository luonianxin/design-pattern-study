package org.itstack.demo.design;

/**
 * @author luonianxin
 * @Description 奖品发放返回实体类
 * @Date 2021/8/20
 */
public class AwardRes {
    private String code;
    private String info;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }
}

