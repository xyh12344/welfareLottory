package cn.com.xia.welfare.adapter;

public enum CPType {

    SSQ("SSQ"),
    QXC("QXC"),
    LJY("LJY"),
    QWS("QWS"),
    QLC("QLC"),
    PLW("PLW"),
    KLB("KLB"),
    DLT("DLT");

    private String mCpType = "";
    public String getCpType() {
        return this.mCpType == null ? "" : mCpType;
    }
    public static CPType fromCPTypeValue(String types) {
        for (CPType cptype : CPType.values()) {
            if (cptype.getCpType().equals(types)) {
                return cptype;
            }
        }
        return SSQ;
    }

    CPType(String type)
    {
        this.mCpType = type;
    }
}
