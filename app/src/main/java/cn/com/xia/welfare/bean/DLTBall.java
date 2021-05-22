package cn.com.xia.welfare.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DLTBall {

    List<BaseBall> mListRedBall = new ArrayList<>();
    List<BaseBall> mListBlueBall = new ArrayList<>();

    public void clearRedBall()
    {
        mListRedBall.clear();
        r1.clear();
        r2.clear();
        r3.clear();
        r4.clear();
        r5.clear();
    }

    public void clearBlueBall()
    {
        mListBlueBall.clear();
        b1.clear();
        b2.clear();
    }

    public void clear()
    {
        clearRedBall();
        clearBlueBall();
    }

    public void sortAll()
    {
        if (mListRedBall == null)
            mListRedBall = new ArrayList<>();

        mListRedBall.clear();

        if (mListBlueBall == null)
            mListBlueBall = new ArrayList<>();

        mListBlueBall.clear();

        mListRedBall.add(r1);
        mListRedBall.add(r2);
        mListRedBall.add(r3);
        mListRedBall.add(r4);
        mListRedBall.add(r5);

        mListBlueBall.add(b1);
        mListBlueBall.add(b2);

        Collections.sort(mListRedBall);
        Collections.sort(mListBlueBall);
    }

    public List<BaseBall> getmListRedBall() {
        if (mListRedBall == null)
            mListRedBall = new ArrayList<>();

        return mListRedBall;
    }

    public void setmListRedBall(List<BaseBall> mListRedBall) {
        this.mListRedBall = mListRedBall;
    }

    public List<BaseBall> getmListBlueBall() {
        if (mListBlueBall == null)
            mListBlueBall = new ArrayList<>();

        return mListBlueBall;
    }

    public void setmListBlueBall(List<BaseBall> mListBlueBall) {
        this.mListBlueBall = mListBlueBall;
    }

    public BaseBall r1 = new BaseBall();
    public BaseBall r2 = new BaseBall();
    public BaseBall r3 = new BaseBall();
    public BaseBall r4 = new BaseBall();
    public BaseBall r5 = new BaseBall();

    public BaseBall b1 = new BaseBall();
    public BaseBall b2 = new BaseBall();

    public BaseBall getB2() {
        return b2;
    }

    public void setB2(BaseBall b2) {
        this.b2 = b2;
    }

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

    public BaseBall getB1() {
        return b1;
    }

    public void setB1(BaseBall b1) {
        this.b1 = b1;
    }
}
