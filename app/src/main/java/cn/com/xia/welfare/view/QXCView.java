package cn.com.xia.welfare.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import cn.com.xia.welfare.R;

public class QXCView extends BaseBallView {
    View rootView;

    BlueBallView b1;
    RedBallView r1;
    RedBallView r2;
    RedBallView r3;
    RedBallView r4;
    RedBallView r5;
    RedBallView r6;

    public QXCView(@NonNull Context context) {
        super(context);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_ssq_one, this);
        b1 = (BlueBallView)rootView.findViewById(R.id.b1);

        r1 = (RedBallView)rootView.findViewById(R.id.r1);
        r2 = (RedBallView)rootView.findViewById(R.id.r2);
        r3 = (RedBallView)rootView.findViewById(R.id.r3);
        r4 = (RedBallView)rootView.findViewById(R.id.r4);
        r5 = (RedBallView)rootView.findViewById(R.id.r5);
        r6 = (RedBallView)rootView.findViewById(R.id.r6);
    }

    public QXCView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_ssq_one, this);
        b1 = (BlueBallView)rootView.findViewById(R.id.b1);

        r1 = (RedBallView)rootView.findViewById(R.id.r1);
        r2 = (RedBallView)rootView.findViewById(R.id.r2);
        r3 = (RedBallView)rootView.findViewById(R.id.r3);
        r4 = (RedBallView)rootView.findViewById(R.id.r4);
        r5 = (RedBallView)rootView.findViewById(R.id.r5);
        r6 = (RedBallView)rootView.findViewById(R.id.r6);
    }

    public QXCView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_ssq_one, this);
        b1 = (BlueBallView)rootView.findViewById(R.id.b1);

        r1 = (RedBallView)rootView.findViewById(R.id.r1);
        r2 = (RedBallView)rootView.findViewById(R.id.r2);
        r3 = (RedBallView)rootView.findViewById(R.id.r3);
        r4 = (RedBallView)rootView.findViewById(R.id.r4);
        r5 = (RedBallView)rootView.findViewById(R.id.r5);
        r6 = (RedBallView)rootView.findViewById(R.id.r6);
    }

    public  void setR1(String r)
    {
        r1.setBallValue(r);
    }

    public  void setR2(String r)
    {
        r2.setBallValue(r);
    }

    public  void setR3(String r)
    {
        r3.setBallValue(r);
    }

    public  void setR4(String r)
    {
        r4.setBallValue(r);
    }

    public  void setR5(String r)
    {
        r5.setBallValue(r);
    }

    public  void setR6(String r)
    {
        r6.setBallValue(r);
    }

    public  void setB1(String b)
    {
        b1.setBallValue(b);
    }

    public void clear()
    {
        r1.clear();
        r2.clear();
        r3.clear();
        r4.clear();
        r5.clear();
        b1.clear();
        r6.clear();
    }

    public void setAllValue(String r1,String r2,String r3,String r4,String r5,String r6,String b1)
    {
        setB1(b1);
        setR1(r1);
        setR2(r2);
        setR3(r3);
        setR4(r4);
        setR5(r5);
        setR6(r6);
    }

    public BlueBallView getB1() {
        return b1;
    }

    public void setB1(BlueBallView b1) {
        this.b1 = b1;
    }

    public RedBallView getR1() {
        return r1;
    }

    public void setR1(RedBallView r1) {
        this.r1 = r1;
    }

    public RedBallView getR2() {
        return r2;
    }

    public void setR2(RedBallView r2) {
        this.r2 = r2;
    }

    public RedBallView getR3() {
        return r3;
    }

    public void setR3(RedBallView r3) {
        this.r3 = r3;
    }

    public RedBallView getR4() {
        return r4;
    }

    public void setR4(RedBallView r4) {
        this.r4 = r4;
    }

    public RedBallView getR5() {
        return r5;
    }

    public void setR5(RedBallView r5) {
        this.r5 = r5;
    }

    public RedBallView getR6() {
        return r6;
    }

    public void setR6(RedBallView r6) {
        this.r6 = r6;
    }
}
