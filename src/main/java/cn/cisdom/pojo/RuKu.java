package cn.cisdom.pojo;

import java.util.Date;

public class RuKu {
    private Integer cRukuId;

    private String cRukuWupinming;

    private String cRukuShuxing;

    private Integer cRukuShuliang;

    private Integer cRukuRenid;

    private Date cRukuRiqi;

    private String cRukuZhuangtai;

    public Integer getcRukuId() {
        return cRukuId;
    }

    public void setcRukuId(Integer cRukuId) {
        this.cRukuId = cRukuId;
    }

    public String getcRukuWupinming() {
        return cRukuWupinming;
    }

    public void setcRukuWupinming(String cRukuWupinming) {
        this.cRukuWupinming = cRukuWupinming == null ? null : cRukuWupinming.trim();
    }

    public String getcRukuShuxing() {
        return cRukuShuxing;
    }

    public void setcRukuShuxing(String cRukuShuxing) {
        this.cRukuShuxing = cRukuShuxing == null ? null : cRukuShuxing.trim();
    }

    public Integer getcRukuShuliang() {
        return cRukuShuliang;
    }

    public void setcRukuShuliang(Integer cRukuShuliang) {
        this.cRukuShuliang = cRukuShuliang;
    }

    public Integer getcRukuRenid() {
        return cRukuRenid;
    }

    public void setcRukuRenid(Integer cRukuRenid) {
        this.cRukuRenid = cRukuRenid;
    }

    public Date getcRukuRiqi() {
        return cRukuRiqi;
    }

    public void setcRukuRiqi(Date cRukuRiqi) {
        this.cRukuRiqi = cRukuRiqi;
    }

    public String getcRukuZhuangtai() {
        return cRukuZhuangtai;
    }

    public void setcRukuZhuangtai(String cRukuZhuangtai) {
        this.cRukuZhuangtai = cRukuZhuangtai == null ? null : cRukuZhuangtai.trim();
    }
}