package cn.com.xia.welfare.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import cn.com.xia.welfare.R;

public class RedBallView extends BaseBallView {
    View rootView;
    TextView mTextView;

    public RedBallView(@NonNull Context context) {
        super(context);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_ball_red, this);
        mTextView = (TextView)rootView.findViewById(R.id.textview_one);
    }

    public RedBallView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_ball_red, this);
        mTextView = (TextView)rootView.findViewById(R.id.textview_one);
    }

    public RedBallView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        rootView = LayoutInflater.from(context).inflate(R.layout.view_ball_red, this);
        mTextView = (TextView)rootView.findViewById(R.id.textview_one);
    }

    public void setBallValue(String value)
    {
        mTextView.setText(value);
    }

    public String getBallValue()
    {
        return mTextView.getText().toString();
    }

    public void clear()
    {
        mTextView.setText("");
    }
}
