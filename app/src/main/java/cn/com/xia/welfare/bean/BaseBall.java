package cn.com.xia.welfare.bean;

import java.io.Serializable;

public class BaseBall implements Cloneable, Serializable ,Comparable<BaseBall>
{
    private boolean isNeedAddDis = true;

    private boolean isChineseZodiacSigns = false;

    public boolean isChineseZodiacSigns() {
        return isChineseZodiacSigns;
    }

    public void setChineseZodiacSigns(boolean chineseZodiacSigns) {
        isChineseZodiacSigns = chineseZodiacSigns;
    }

    public boolean isNeedAddDis() {
        return isNeedAddDis;
    }

    public void setNeedAddDis(boolean needAddDis) {
        isNeedAddDis = needAddDis;
    }

    /***
     * 展示的值
     */
    private String value = "";

    /***
     * 权重
     */
    private float qz = 0.0f;

    /***
     * 随机号码的值
     */
    private int number = 0;

    public BaseBall()
    {
        number = 0;
    }

    public BaseBall(boolean isNeedAddDis)
    {
        setNeedAddDis(isNeedAddDis);
    }

    public BaseBall(int val)
    {
        number = val;
    }

    public String getValue() {

        if (isChineseZodiacSigns())
        {
            switch (number)
            {
                case 1:
                    value = "鼠";
                    break;
                case 2:
                    value = "牛";
                    break;
                case 3:
                    value = "虎";
                    break;
                case 4:
                    value = "兔";
                    break;
                case 5:
                    value = "龙";
                    break;
                case 6:
                    value = "蛇";
                    break;
                case 7:
                    value = "马";
                    break;
                case 8:
                    value = "羊";
                    break;
                case 9:
                    value = "猴";
                    break;
                case 10:
                    value = "鸡";
                    break;
                case 11:
                    value = "狗";
                    break;
                case 12:
                    value = "猪";
                    break;
                default:
                    break;
            }
        }
        else {
            if (isNeedAddDis()) {
                if (number < 10) {
                    value = "0" + number;
                } else {
                    value = "" + number;
                }
            } else {
                value = "" + number;
            }
        }

        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public float getQz() {
        return qz;
    }

    public void setQz(float qz) {
        this.qz = qz;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    protected Object clone() {
        BaseBall ball = null;
        try {
            ball = (BaseBall) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return ball;
    }

    @Override
    public int compareTo(BaseBall ball) {
        return this.number - ball.getNumber();
    }

    public void clear()
    {
        value = "";
        qz = 0.0f;
        number = 0;
    }
}
