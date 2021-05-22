package cn.com.xia.welfare.bean;

import java.util.ArrayList;
import java.util.List;

public class PLWBall {

    List<BaseBall> mListRedBall = new ArrayList<>();

    public void clearRedBall()
    {
        mListRedBall.clear();
        r1.clear();
        r2.clear();
        r3.clear();
        r4.clear();
        r5.clear();
    }

    public List<BaseBall> getmListRedBall() {
        return mListRedBall;
    }

    public void setmListRedBall(List<BaseBall> mListRedBall) {
        this.mListRedBall = mListRedBall;
    }

    public void clear()
    {
        clearRedBall();
    }

    public void addAll()
    {
        if (mListRedBall == null)
            mListRedBall = new ArrayList<>();

        mListRedBall.clear();

        mListRedBall.add(r1);
        mListRedBall.add(r2);
        mListRedBall.add(r3);
        mListRedBall.add(r4);
        mListRedBall.add(r5);
    }

    public BaseBall r1 = new BaseBall(false);
    public BaseBall r2 = new BaseBall(false);
    public BaseBall r3 = new BaseBall(false);
    public BaseBall r4 = new BaseBall(false);
    public BaseBall r5 = new BaseBall(false);

    public BaseBall getR1() {
        return r1;
    }

    public void setR1(BaseBall r1) {
        this.r1 = r1;
    }

    public BaseBall getR2() {
        return r2;
    }

    public void setR2(BaseBall r2) {
        this.r2 = r2;
    }

    public BaseBall getR3() {
        return r3;
    }

    public void setR3(BaseBall r3) {
        this.r3 = r3;
    }

    public BaseBall getR4() {
        return r4;
    }

    public void setR4(BaseBall r4) {
        this.r4 = r4;
    }

    public BaseBall getR5() {
        return r5;
    }

    public void setR5(BaseBall r5) {
        this.r5 = r5;
    }

}
