package cn.com.xia.welfare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cn.com.xia.welfare.R;
import cn.com.xia.welfare.bean.DLTBall;
import cn.com.xia.welfare.view.DLTView;

public class DLTViewAdapter extends RecyclerView.Adapter<DLTViewAdapter.BallHolder> {

    private List<DLTBall> mList;//数据源
    Context mContext;
    CPType mCpType = CPType.DLT;

    public DLTViewAdapter(Context mCtx) {
        mContext = mCtx;
    }

    public DLTViewAdapter(Context mCtx, CPType type) {
        mContext = mCtx;
        mCpType = type;
    }

    public List<DLTBall> getList() {
        return mList;
    }

    public int getListCount() {
        if (mList == null)
            return 0;
        else
            return mList.size();
    }

    public void setList(List<DLTBall> mList) {
        this.mList = mList;
    }

    @Override
    public BallHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType >= 0)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_caipiao_one, parent, false);
            BallHolder holder = new BallHolder(view);
            return holder;
        }
        else
            return null;
    }

    //通过方法提供的ViewHolder，将数据绑定到ViewHolder中
    @Override
    public void onBindViewHolder(BallHolder holder, int position) {

        DLTBall ball = getList().get(position);
        if (ball == null)
            return;

        holder.mHolderView.setR1(ball.getmListRedBall().get(0).getValue());
        holder.mHolderView.setR2(ball.getmListRedBall().get(1).getValue());
        holder.mHolderView.setR3(ball.getmListRedBall().get(2).getValue());
        holder.mHolderView.setR4(ball.getmListRedBall().get(3).getValue());
        holder.mHolderView.setR5(ball.getmListRedBall().get(4).getValue());

        holder.mHolderView.setB1(ball.getmListBlueBall().get(0).getValue());
        holder.mHolderView.setB2(ball.getmListBlueBall().get(1).getValue());
    }

    //获取数据源总的条数
    @Override
    public int getItemCount() {
        return getListCount();
    }

    /**
     * 自定义的大乐透holder
     */
    class BallHolder extends RecyclerView.ViewHolder {

        DLTView mHolderView = null;

        public BallHolder(View itemView) {
            super(itemView);
            mHolderView = (DLTView) itemView.findViewById(R.id.dltOne);
            mHolderView.setVisibility(View.VISIBLE);
        }

        CPType mCpType = CPType.DLT;
    }
}