package cn.com.xia.welfare;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.com.xia.welfare.adapter.DLTViewAdapter;
import cn.com.xia.welfare.bean.BaseBall;
import cn.com.xia.welfare.bean.DLTBall;

/****
 * 大乐透随机获取工具
 * 支持一注，五注同时获取等
 * 100%模拟真实开球
 */
public class FirstFragment extends Fragment {

    private RecyclerView mRecycleView;
    private DLTViewAdapter mAdapter;//适配器
    private LinearLayoutManager mLinearLayoutManager;//布局管理器
    private List<BaseBall> mListRedAll;
    private List<BaseBall> mListBlueAll;
    private List<DLTBall> mList;
    Button mBtnOne;
    Button mBtnFive;
    Button mBtnClear;
    Button mBtnSave;

    TextView mTvTime;
    TextView mTvPlace;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        mTvTime = view.findViewById(R.id.txt_time);
        mTvTime.setText(Utilities.getDateTimeEs(new Date()));
        mTvPlace = view.findViewById(R.id.txt_place);
        mBtnOne = view.findViewById(R.id.button_first);
        mBtnFive = view.findViewById(R.id.button_five);
        mBtnClear = view.findViewById(R.id.button_clear);
        mBtnSave = view.findViewById(R.id.button_save);

        mRecycleView = view.findViewById(R.id.recycleView);

        initCtrl();
    }

    public void initCtrl()
    {
        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDltData();
                mList.clear();
                mAdapter.notifyDataSetChanged();

                mList.add(Utilities.getDltOne(mListRedAll,mListBlueAll));
                mTvTime.setText(Utilities.getDateTimeEs(new Date()));
                mAdapter.notifyDataSetChanged();

            }
        });

        mBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDltData();
                mList.clear();
                mAdapter.notifyDataSetChanged();

                mList.addAll(Utilities.getDltFive(mListRedAll,mListBlueAll));
                mTvTime.setText(Utilities.getDateTimeEs(new Date()));
                mAdapter.notifyDataSetChanged();
            }
        });

        mBtnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mList.clear();
                mAdapter.notifyDataSetChanged();
                initDltData();
                mTvTime.setText(Utilities.getDateTimeEs(new Date()));
            }
        });

        mBtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        //创建布局管理器，垂直设置LinearLayoutManager.VERTICAL，水平设置LinearLayoutManager.HORIZONTAL
        mLinearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);

        //创建适配器，将数据传递给适配器
        mAdapter = new DLTViewAdapter(getContext());

        //初始化数据
        if (mList == null)
            mList = new ArrayList();

        mAdapter.setList(mList);

        //设置布局管理器
        mRecycleView.setLayoutManager(mLinearLayoutManager);
        //设置适配器adapter
        mRecycleView.setAdapter(mAdapter);
    }

    public void initDltData() {
        if (mListRedAll == null)
            mListRedAll  = new ArrayList<BaseBall>();

        mListRedAll.clear();

        for (int i = 1; i < 36;i++)
        {
            BaseBall ball = new BaseBall(i);
            mListRedAll.add(ball);
        }

        if (mListBlueAll == null)
            mListBlueAll  = new ArrayList<BaseBall>();

        mListBlueAll.clear();

        for (int i = 1; i < 13;i++)
        {
            BaseBall ball = new BaseBall(i);
            mListBlueAll.add(ball);
        }
    }
}
