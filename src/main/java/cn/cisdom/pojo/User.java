package cn.cisdom.pojo;

import java.util.Date;

public class User {
    private Integer uId;

    private String uName;

    private String uMima;

    private String uShoujihao;

    private String uZhuzhi;

    private Integer uZhiwei;

    private Date uZhuceShijian;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuMima() {
        return uMima;
    }

    public void setuMima(String uMima) {
        this.uMima = uMima == null ? null : uMima.trim();
    }

    public String getuShoujihao() {
        return uShoujihao;
    }

    public void setuShoujihao(String uShoujihao) {
        this.uShoujihao = uShoujihao == null ? null : uShoujihao.trim();
    }

    public String getuZhuzhi() {
        return uZhuzhi;
    }

    public void setuZhuzhi(String uZhuzhi) {
        this.uZhuzhi = uZhuzhi == null ? null : uZhuzhi.trim();
    }

    public Integer getuZhiwei() {
        return uZhiwei;
    }

    public void setuZhiwei(Integer uZhiwei) {
        this.uZhiwei = uZhiwei;
    }

    public Date getuZhuceShijian() {
        return uZhuceShijian;
    }

    public void setuZhuceShijian(Date uZhuceShijian) {
        this.uZhuceShijian = uZhuceShijian;
    }
}