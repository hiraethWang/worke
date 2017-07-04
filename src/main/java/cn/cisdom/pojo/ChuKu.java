package cn.cisdom.pojo;

import java.util.Date;

public class ChuKu {
    private Integer cChukuId;

    private String cChukuWupinming;

    private String cChukuShuxing;

    private String cChukuShuliang;

    private Date cChukuShijian;

    private Integer cChukuChukuid;

    private String cChukuKuwei;

    public Integer getcChukuId() {
        return cChukuId;
    }

    public void setcChukuId(Integer cChukuId) {
        this.cChukuId = cChukuId;
    }

    public String getcChukuWupinming() {
        return cChukuWupinming;
    }

    public void setcChukuWupinming(String cChukuWupinming) {
        this.cChukuWupinming = cChukuWupinming == null ? null : cChukuWupinming.trim();
    }

    public String getcChukuShuxing() {
        return cChukuShuxing;
    }

    public void setcChukuShuxing(String cChukuShuxing) {
        this.cChukuShuxing = cChukuShuxing == null ? null : cChukuShuxing.trim();
    }

    public String getcChukuShuliang() {
        return cChukuShuliang;
    }

    public void setcChukuShuliang(String cChukuShuliang) {
        this.cChukuShuliang = cChukuShuliang == null ? null : cChukuShuliang.trim();
    }

    public Date getcChukuShijian() {
        return cChukuShijian;
    }

    public void setcChukuShijian(Date cChukuShijian) {
        this.cChukuShijian = cChukuShijian;
    }

    public Integer getcChukuChukuid() {
        return cChukuChukuid;
    }

    public void setcChukuChukuid(Integer cChukuChukuid) {
        this.cChukuChukuid = cChukuChukuid;
    }

    public String getcChukuKuwei() {
        return cChukuKuwei;
    }

    public void setcChukuKuwei(String cChukuKuwei) {
        this.cChukuKuwei = cChukuKuwei == null ? null : cChukuKuwei.trim();
    }
}