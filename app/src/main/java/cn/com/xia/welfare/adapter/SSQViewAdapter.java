package cn.com.xia.welfare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cn.com.xia.welfare.R;
import cn.com.xia.welfare.bean.SSQBall;
import cn.com.xia.welfare.view.SSQView;

public class SSQViewAdapter extends RecyclerView.Adapter<SSQViewAdapter.BallHolder> {

    private List<SSQBall> mList;//数据源
    Context mContext;
    CPType mCpType = CPType.SSQ;

    public SSQViewAdapter(Context mCtx) {
        mContext = mCtx;
    }

    SSQViewAdapter(Context mCtx, CPType type) {
        mContext = mCtx;
        mCpType = type;
    }

    public List<SSQBall> getList() {
        return mList;
    }

    public int getListCount() {
        if (mList == null)
            return 0;
        else
            return mList.size();
    }

    public void setList(List<SSQBall> mList) {
        this.mList = mList;
    }

    @Override
    public BallHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_caipiao_one, parent, false);

        BallHolder holder = new BallHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(BallHolder holder, int position) {
        SSQBall ball = getList().get(position);
        if (ball == null)
            return;

        holder.mHolderView.setR1(ball.getmListRedBall().get(0).getValue());
        holder.mHolderView.setR2(ball.getmListRedBall().get(1).getValue());
        holder.mHolderView.setR3(ball.getmListRedBall().get(2).getValue());
        holder.mHolderView.setR4(ball.getmListRedBall().get(3).getValue());
        holder.mHolderView.setR5(ball.getmListRedBall().get(4).getValue());
        holder.mHolderView.setR6(ball.getmListRedBall().get(5).getValue());

        holder.mHolderView.setB1(ball.getmListBlueBall().get(0).getValue());
    }

    @Override
    public int getItemCount() {
        return getListCount();
    }

    class BallHolder extends RecyclerView.ViewHolder {

        SSQView mHolderView = null;

        public BallHolder(View itemView) {
            super(itemView);
            mHolderView = (SSQView) itemView.findViewById(R.id.ssqOne);
            mHolderView.setVisibility(View.VISIBLE);
        }

        CPType mCpType = CPType.SSQ;

    }
}