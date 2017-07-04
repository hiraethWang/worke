package cn.cisdom.pojo;

public class ShuXing {
    private Integer wId;

    private String wWupinName;

    private String wWupinShuxing;

    private String wWupinXinghao;

    private String wWuoinTuan;

    public Integer getwId() {
        return wId;
    }

    public void setwId(Integer wId) {
        this.wId = wId;
    }

    public String getwWupinName() {
        return wWupinName;
    }

    public void setwWupinName(String wWupinName) {
        this.wWupinName = wWupinName == null ? null : wWupinName.trim();
    }

    public String getwWupinShuxing() {
        return wWupinShuxing;
    }

    public void setwWupinShuxing(String wWupinShuxing) {
        this.wWupinShuxing = wWupinShuxing == null ? null : wWupinShuxing.trim();
    }

    public String getwWupinXinghao() {
        return wWupinXinghao;
    }

    public void setwWupinXinghao(String wWupinXinghao) {
        this.wWupinXinghao = wWupinXinghao == null ? null : wWupinXinghao.trim();
    }

    public String getwWuoinTuan() {
        return wWuoinTuan;
    }

    public void setwWuoinTuan(String wWuoinTuan) {
        this.wWuoinTuan = wWuoinTuan == null ? null : wWuoinTuan.trim();
    }
}