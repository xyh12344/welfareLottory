package cn.com.xia.welfare.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import cn.com.xia.welfare.R;

public class KLBView extends BaseBallView {
    View rootView;

    RedBallView r1;
    RedBallView r2;
    RedBallView r3;
    RedBallView r4;
    RedBallView r5;
    RedBallView r6;
    RedBallView r7;
    RedBallView r8;

    public KLBView(@NonNull Context context) {
        super(context);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_klb_one, this);

        r1 = (RedBallView)rootView.findViewById(R.id.r1);
        r2 = (RedBallView)rootView.findViewById(R.id.r2);
        r3 = (RedBallView)rootView.findViewById(R.id.r3);
        r4 = (RedBallView)rootView.findViewById(R.id.r4);
        r5 = (RedBallView)rootView.findViewById(R.id.r5);
        r6 = (RedBallView)rootView.findViewById(R.id.r6);
        r7 = (RedBallView)rootView.findViewById(R.id.r7);
        r8 = (RedBallView)rootView.findViewById(R.id.r8);
    }

    public KLBView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_klb_one, this);
        r7 = (RedBallView)rootView.findViewById(R.id.r7);
        r8 = (RedBallView)rootView.findViewById(R.id.r8);
        r1 = (RedBallView)rootView.findViewById(R.id.r1);
        r2 = (RedBallView)rootView.findViewById(R.id.r2);
        r3 = (RedBallView)rootView.findViewById(R.id.r3);
        r4 = (RedBallView)rootView.findViewById(R.id.r4);
        r5 = (RedBallView)rootView.findViewById(R.id.r5);
        r6 = (RedBallView)rootView.findViewById(R.id.r6);
    }

    public KLBView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_klb_one, this);
        r7 = (RedBallView)rootView.findViewById(R.id.r7);
        r8 = (RedBallView)rootView.findViewById(R.id.r8);
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

    public  void setR7(String b)
    {
        r7.setBallValue(b);
    }

    public  void setR8(String b)
    {
        r8.setBallValue(b);
    }

    public void clear()
    {
        r1.clear();
        r2.clear();
        r3.clear();
        r4.clear();
        r5.clear();
        r7.clear();
        r6.clear();
        r8.clear();
    }

    public RedBallView getR7() {
        return r7;
    }

    public void setR7(RedBallView b1) {
        this.r7 = b1;
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
