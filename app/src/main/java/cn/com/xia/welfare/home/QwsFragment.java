package cn.com.xia.welfare.home;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.com.xia.welfare.R;
import cn.com.xia.welfare.Utilities;
import cn.com.xia.welfare.adapter.BallViewAdapter;
import cn.com.xia.welfare.adapter.CPType;
import cn.com.xia.welfare.bean.BaseBall;
import cn.com.xia.welfare.bean.QWSBall;
import cn.com.xia.welfare.bean.QXCBall;


/***
 * 主页Fragment
 */
public class QwsFragment extends BaseFragment {

    private RecyclerView mRecycleView;
    private BallViewAdapter mAdapter;//适配器
    private LinearLayoutManager mLinearLayoutManager;//布局管理器
    private List<BaseBall> mListRedAll;
    private List<BaseBall> mListBlueAll;
    private List<QWSBall> mList;
    Button mBtnOne;
    Button mBtnFive;
    Button mBtnClear;
    Button mBtnSave;

    TextView mTvTime;
    TextView mTvPlace;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_qws;
    }

    @Override
    protected void initView() {
        mTvTime = root.findViewById(R.id.txt_time);
        mTvTime.setText(Utilities.getDateTimeEs(new Date()));
        mTvPlace = root.findViewById(R.id.txt_place);
        mBtnOne = root.findViewById(R.id.button_first);
        mBtnFive = root.findViewById(R.id.button_five);
        mBtnClear = root.findViewById(R.id.button_clear);
        mBtnSave = root.findViewById(R.id.button_save);

        mRecycleView = root.findViewById(R.id.recycleView);

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mList.clear();
                mAdapter.notifyDataSetChanged();

                mList.add(Utilities.getQwsOne(mListRedAll));
                mTvTime.setText(Utilities.getDateTimeEs(new Date()));
                mAdapter.notifyDataSetChanged();

            }
        });

        mBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mList.clear();
                mAdapter.notifyDataSetChanged();

                mList.addAll(Utilities.getQwsFive(mListRedAll));
                mTvTime.setText(Utilities.getDateTimeEs(new Date()));
                mAdapter.notifyDataSetChanged();
            }
        });

        mBtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mList.clear();
                mAdapter.notifyDataSetChanged();

                mTvTime.setText(Utilities.getDateTimeEs(new Date()));
            }
        });

        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mList == null || mList.size() == 0)
                {
                    Toast.makeText(getActivity(), "请先随机号码！", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuilder sbTotal = new StringBuilder();
                int cnt = mList.size();

                if (cnt == 1)
                {
                    sbTotal.append("七位数，再随机4个：\n");
                }
                else
                    sbTotal.append("七位数\n");

                StringBuilder sb;
                for (QWSBall ball : mList)
                {
                    sb = new StringBuilder();

                    int cntRedball = ball.getmListRedBall().size();
                    for (int i =0;i < cntRedball; i++)
                    {
                        BaseBall b = ball.getmListRedBall().get(i);
                        sb.append(b.getValue() + "  ");
                    }
                    sb.append("\n");

                    sbTotal.append(sb.toString());
                }

                ClipboardManager cm = (ClipboardManager) getActivity().getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData mClipData = ClipData.newPlainText("Label", sbTotal.toString());
                cm.setPrimaryClip(mClipData);
            }
        });

        //创建布局管理器，垂直设置LinearLayoutManager.VERTICAL，水平设置LinearLayoutManager.HORIZONTAL
        mLinearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        //创建适配器，将数据传递给适配器
        mAdapter = new BallViewAdapter(getContext());
        mAdapter.setmCpType(CPType.QWS);

        //初始化数据
        if (mList == null)
            mList = new ArrayList();
        mAdapter.setListQws(mList);

        //设置布局管理器
        mRecycleView.setLayoutManager(mLinearLayoutManager);
        //设置适配器adapter
        mRecycleView.setAdapter(mAdapter);
    }

    @Override
    public void initData() {
        if (mListRedAll == null)
            mListRedAll  = new ArrayList<BaseBall>();

        mListRedAll.clear();

        for (int i = 0; i < 10;i++)
        {
            BaseBall ball = new BaseBall(i);
            ball.setNeedAddDis(false);
            mListRedAll.add(ball);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 101) {
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser)
        {
        }
        else
        {
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (isViewCreated)
        {
        }
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

        if (hidden) {
        } else {

        }
    }
}
