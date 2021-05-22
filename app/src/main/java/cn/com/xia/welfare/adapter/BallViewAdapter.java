package cn.com.xia.welfare.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import cn.com.xia.welfare.R;
import cn.com.xia.welfare.bean.DLTBall;
import cn.com.xia.welfare.bean.KLBBall;
import cn.com.xia.welfare.bean.LJYBall;
import cn.com.xia.welfare.bean.PLWBall;
import cn.com.xia.welfare.bean.QLCBall;
import cn.com.xia.welfare.bean.QWSBall;
import cn.com.xia.welfare.bean.QXCBall;
import cn.com.xia.welfare.bean.SSQBall;
import cn.com.xia.welfare.view.DLTView;
import cn.com.xia.welfare.view.KLBView;
import cn.com.xia.welfare.view.LJYView;
import cn.com.xia.welfare.view.PLWView;
import cn.com.xia.welfare.view.QLCView;
import cn.com.xia.welfare.view.QWSView;
import cn.com.xia.welfare.view.QXCView;
import cn.com.xia.welfare.view.SSQView;

public class BallViewAdapter extends RecyclerView.Adapter<BallViewAdapter.BallHolder> {

    /********************************************************************
     * 数据源
     */
    private List<SSQBall> mListSsq;//数据源
    private List<DLTBall> mListDlt;//数据源1
    private List<QXCBall> mListQxc;//数据源2
    private List<LJYBall> mListLjy;//数据源3
    private List<QWSBall> mListQws;//数据源4
    private List<QLCBall> mListQlc;//数据源5
    private List<PLWBall> mListPlw;//数据源6
    private List<KLBBall> mListKlb;//数据源7

    public List<SSQBall> getListSsq() {
        return mListSsq;
    }
    public List<DLTBall> getListDlt() {
        return mListDlt;
    }
    public List<QXCBall> getListQxc() {
        return mListQxc;
    }
    public List<LJYBall> getListLjy() {
        return mListLjy;
    }
    public List<QWSBall> getListQws() {
        return mListQws;
    }
    public List<QLCBall> getListQlc() { return mListQlc; }
    public List<PLWBall> getListPlw() { return mListPlw; }
    public List<KLBBall> getListKlb() { return mListKlb; }

    public int getListCountSsq() {
        if (mListSsq == null)
            return 0;
        else
            return mListSsq.size();
    }
    public int getListCountDlt() {
        if (mListDlt == null)
            return 0;
        else
            return mListDlt.size();
    }
    public int getListCountQxc() {
        if (mListQxc == null)
            return 0;
        else
            return mListQxc.size();
    }
    public int getListCountLjy() {
        if (mListLjy == null)
            return 0;
        else
            return mListLjy.size();
    }

    public int getListCountQws() {
        if (mListQws == null)
            return 0;
        else
            return mListQws.size();
    }

    public int getListCountQlc() {
        if (mListQlc == null)
            return 0;
        else
            return mListQlc.size();
    }

    public int getListCountPlw() {
        if (mListPlw == null)
            return 0;
        else
            return mListPlw.size();
    }

    public int getListCountKlb() {
        if (mListKlb == null)
            return 0;
        else
            return mListKlb.size();
    }

    public void setListSsq(List<SSQBall> mList) {
        this.mListSsq = mList;
    }
    public void setListDlt(List<DLTBall> mList) {
        this.mListDlt = mList;
    }
    public void setListQxc(List<QXCBall> mList) {
        this.mListQxc = mList;
    }
    public void setListLjy(List<LJYBall> mList) {
        this.mListLjy = mList;
    }
    public void setListQws(List<QWSBall> mList) {
        this.mListQws = mList;
    }
    public void setListQlc(List<QLCBall> mList) {
        this.mListQlc = mList;
    }
    public void setListPlw(List<PLWBall> mList) {
        this.mListPlw = mList;
    }
    public void setListKlb(List<KLBBall> mList) {
        this.mListKlb = mList;
    }
    /***
     * 数据源
     * *****************************************************************
     */

    Context mContext;
    CPType mCpType = CPType.SSQ;

    public BallViewAdapter(Context mCtx) {
        mContext = mCtx;
    }

    BallViewAdapter(Context mCtx, CPType type) {
        mContext = mCtx;
        mCpType = type;
    }

    public CPType getmCpType() {
        return mCpType;
    }

    public void setmCpType(CPType mCpType) {
        this.mCpType = mCpType;
    }

    @Override
    public BallHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_caipiao_one, parent, false);

        BallHolder holder = new BallHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(BallHolder holder, int position) {

        switch (mCpType)
        {
            case SSQ:
                SSQBall ball = getListSsq().get(position);

                if (ball == null)
                    return;

                holder.mHolderViewSsq.setR1(ball.getmListRedBall().get(0).getValue());
                holder.mHolderViewSsq.setR2(ball.getmListRedBall().get(1).getValue());
                holder.mHolderViewSsq.setR3(ball.getmListRedBall().get(2).getValue());
                holder.mHolderViewSsq.setR4(ball.getmListRedBall().get(3).getValue());
                holder.mHolderViewSsq.setR5(ball.getmListRedBall().get(4).getValue());
                holder.mHolderViewSsq.setR6(ball.getmListRedBall().get(5).getValue());

                holder.mHolderViewSsq.setB1(ball.getmListBlueBall().get(0).getValue());

                break;
            case DLT:
                DLTBall ballDlt = getListDlt().get(position);
                if (ballDlt == null)
                    return;

                holder.mHolderViewDlt.setR1(ballDlt.getmListRedBall().get(0).getValue());
                holder.mHolderViewDlt.setR2(ballDlt.getmListRedBall().get(1).getValue());
                holder.mHolderViewDlt.setR3(ballDlt.getmListRedBall().get(2).getValue());
                holder.mHolderViewDlt.setR4(ballDlt.getmListRedBall().get(3).getValue());
                holder.mHolderViewDlt.setR5(ballDlt.getmListRedBall().get(4).getValue());

                holder.mHolderViewDlt.setB1(ballDlt.getmListBlueBall().get(0).getValue());
                holder.mHolderViewDlt.setB2(ballDlt.getmListBlueBall().get(1).getValue());
                break;
            case QXC:
                QXCBall ballQxc = getListQxc().get(position);
                if (ballQxc == null)
                    return;

                holder.mHolderViewQxc.setR1(ballQxc.getmListRedBall().get(0).getValue());
                holder.mHolderViewQxc.setR2(ballQxc.getmListRedBall().get(1).getValue());
                holder.mHolderViewQxc.setR3(ballQxc.getmListRedBall().get(2).getValue());
                holder.mHolderViewQxc.setR4(ballQxc.getmListRedBall().get(3).getValue());
                holder.mHolderViewQxc.setR5(ballQxc.getmListRedBall().get(4).getValue());
                holder.mHolderViewQxc.setR6(ballQxc.getmListRedBall().get(5).getValue());

                holder.mHolderViewQxc.setB1(ballQxc.getmListBlueBall().get(0).getValue());
                break;
            case LJY:
                LJYBall ballLjy = getListLjy().get(position);
                if (ballLjy == null)
                    return;

                holder.mHolderViewLjy.setR1(ballLjy.getmListRedBall().get(0).getValue());
                holder.mHolderViewLjy.setR2(ballLjy.getmListRedBall().get(1).getValue());
                holder.mHolderViewLjy.setR3(ballLjy.getmListRedBall().get(2).getValue());
                holder.mHolderViewLjy.setR4(ballLjy.getmListRedBall().get(3).getValue());
                holder.mHolderViewLjy.setR5(ballLjy.getmListRedBall().get(4).getValue());
                holder.mHolderViewLjy.setR6(ballLjy.getmListRedBall().get(5).getValue());

                holder.mHolderViewLjy.setB1(ballLjy.getmListBlueBall().get(0).getValue());

                break;
            case QWS:
                QWSBall ballQws = getListQws().get(position);
                if (ballQws == null)
                    return;

                holder.mHolderViewQws.setR1(ballQws.getmListRedBall().get(0).getValue());
                holder.mHolderViewQws.setR2(ballQws.getmListRedBall().get(1).getValue());
                holder.mHolderViewQws.setR3(ballQws.getmListRedBall().get(2).getValue());
                holder.mHolderViewQws.setR4(ballQws.getmListRedBall().get(3).getValue());
                holder.mHolderViewQws.setR5(ballQws.getmListRedBall().get(4).getValue());
                holder.mHolderViewQws.setR6(ballQws.getmListRedBall().get(5).getValue());
                holder.mHolderViewQws.setR7(ballQws.getmListRedBall().get(6).getValue());

                break;
            case QLC:
                QLCBall ballQlc = getListQlc().get(position);
                if (ballQlc == null)
                    return;

                holder.mHolderViewQlc.setR1(ballQlc.getmListRedBall().get(0).getValue());
                holder.mHolderViewQlc.setR2(ballQlc.getmListRedBall().get(1).getValue());
                holder.mHolderViewQlc.setR3(ballQlc.getmListRedBall().get(2).getValue());
                holder.mHolderViewQlc.setR4(ballQlc.getmListRedBall().get(3).getValue());
                holder.mHolderViewQlc.setR5(ballQlc.getmListRedBall().get(4).getValue());
                holder.mHolderViewQlc.setR6(ballQlc.getmListRedBall().get(5).getValue());
                holder.mHolderViewQlc.setR7(ballQlc.getmListRedBall().get(6).getValue());

                break;
            case PLW:
                PLWBall ballPlw = getListPlw().get(position);
                if (ballPlw == null)
                    return;

                holder.mHolderViewPlw.setR1(ballPlw.getmListRedBall().get(0).getValue());
                holder.mHolderViewPlw.setR2(ballPlw.getmListRedBall().get(1).getValue());
                holder.mHolderViewPlw.setR3(ballPlw.getmListRedBall().get(2).getValue());
                holder.mHolderViewPlw.setR4(ballPlw.getmListRedBall().get(3).getValue());
                holder.mHolderViewPlw.setR5(ballPlw.getmListRedBall().get(4).getValue());

                break;
            case KLB:
                KLBBall ballKlb = getListKlb().get(position);
                if (ballKlb == null)
                    return;

                holder.mHolderViewKlb.setR1(ballKlb.getmListRedBall().get(0).getValue());
                holder.mHolderViewKlb.setR2(ballKlb.getmListRedBall().get(1).getValue());
                holder.mHolderViewKlb.setR3(ballKlb.getmListRedBall().get(2).getValue());
                holder.mHolderViewKlb.setR4(ballKlb.getmListRedBall().get(3).getValue());
                holder.mHolderViewKlb.setR5(ballKlb.getmListRedBall().get(4).getValue());
                holder.mHolderViewKlb.setR6(ballKlb.getmListRedBall().get(5).getValue());
                holder.mHolderViewKlb.setR7(ballKlb.getmListRedBall().get(6).getValue());
                holder.mHolderViewKlb.setR8(ballKlb.getmListRedBall().get(7).getValue());

            default:
                break;
        }

    }

    @Override
    public int getItemCount() {
        switch (mCpType)
        {
            case SSQ:
                return getListCountSsq();
            case DLT:
                return getListCountDlt();
            case QXC:
                return getListCountQxc();
            case LJY:
                return getListCountLjy();
            case QWS:
                return getListCountQws();
            case QLC:
                return getListCountQlc();
            case PLW:
                return getListCountPlw();
            case KLB:
                return getListCountKlb();
            default:
                return 0;
        }
    }

    class BallHolder extends RecyclerView.ViewHolder {

        SSQView mHolderViewSsq = null;
        DLTView mHolderViewDlt = null;
        QXCView mHolderViewQxc = null;
        LJYView mHolderViewLjy = null;
        QWSView mHolderViewQws = null;
        QLCView mHolderViewQlc = null;
        PLWView mHolderViewPlw = null;
        KLBView mHolderViewKlb = null;

        public BallHolder(View itemView) {
            super(itemView);
            switch (mCpType)
            {
                case SSQ:
                    mHolderViewSsq = (SSQView) itemView.findViewById(R.id.ssqOne);
                    mHolderViewSsq.setVisibility(View.VISIBLE);
                    break;
                case DLT:
                    mHolderViewDlt = (DLTView) itemView.findViewById(R.id.dltOne);
                    mHolderViewDlt.setVisibility(View.VISIBLE);
                    break;
                case QXC:
                    mHolderViewQxc = (QXCView) itemView.findViewById(R.id.qxcOne);
                    mHolderViewQxc.setVisibility(View.VISIBLE);
                    break;
                case LJY:
                    mHolderViewLjy = (LJYView) itemView.findViewById(R.id.ljyOne);
                    mHolderViewLjy.setVisibility(View.VISIBLE);
                    break;
                case QWS:
                    mHolderViewQws = (QWSView) itemView.findViewById(R.id.qwsOne);
                    mHolderViewQws.setVisibility(View.VISIBLE);
                    break;
                case QLC:
                    mHolderViewQlc = (QLCView) itemView.findViewById(R.id.qlcOne);
                    mHolderViewQlc.setVisibility(View.VISIBLE);
                    break;
                case PLW:
                    mHolderViewPlw = (PLWView) itemView.findViewById(R.id.plwOne);
                    mHolderViewPlw.setVisibility(View.VISIBLE);
                    break;
                case KLB:
                    mHolderViewKlb = (KLBView) itemView.findViewById(R.id.klbOne);
                    mHolderViewKlb.setVisibility(View.VISIBLE);
                    break;
                default:
                    break;
            }

        }
    }
}