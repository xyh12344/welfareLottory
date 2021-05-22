package cn.com.xia.welfare.home;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

import cn.com.xia.welfare.R;
import cn.com.xia.welfare.Utilities;

public class HomeActivity extends AppCompatActivity {

    Toolbar toolbar;
    public Handler mHandler;
    BaseFragment mCurrentragment;
    List<BaseFragment> mListFragment = new ArrayList<>();
    SsqFragment ssqFragment;
    DltFragment dltFragment;
    QxcFragment qxcFragment;
    LjyFragment ljyFragment;
    QwsFragment qwsFragment;
    QlcFragment qlcFragment;
    PlwFragment plwFragment;
    KlbFragment klbFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        initView();
    }

    /*********************************************************
     * 初始化布局
     */
    private void initView() {

        mHandler = new Handler() {
            public void handleMessage(Message msg) {
                if (msg.what == 0x11) {
                    finish();
                }
            }
        };



        int weekDay = Utilities.getDayofWeek();
        switch (weekDay)
        {
            case 1:
            case 3:
            case 5:
                ssqFragment = new SsqFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container_id, ssqFragment, ssqFragment.getClass().getSimpleName())
                        .addToBackStack(ssqFragment.getClass().getSimpleName())
                        .commit();
                break;
            case 2:
            case 4:
            case 7:
                dltFragment = new DltFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container_id, dltFragment, dltFragment.getClass().getSimpleName())
                        .addToBackStack(dltFragment.getClass().getSimpleName())
                        .commit();
                break;
            case 6:
                qxcFragment = new QxcFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .add(R.id.container_id, qxcFragment, qxcFragment.getClass().getSimpleName())
                        .addToBackStack(qxcFragment.getClass().getSimpleName())
                        .commit();
                break;
            default:
                break;
        }
    }

    /*********************************************************
     * Fragment 自由切换
     */
    public void startFragment(BaseFragment toFragment) {

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_id, toFragment, toFragment.getClass().getSimpleName())
//                .addToBackStack(toFragment.getClass().getSimpleName())
                .commit();
        toFragment.setCurrentFragment(true);

    }

    //添加fragment，隐藏了当前fragment，点击返回时当前的视图和数据还依然存在
    public void switchContent(BaseFragment fromFragment,BaseFragment toFragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction().setCustomAnimations(android.R.anim.fade_in, R.anim.abc_fade_out);

        if (!toFragment.isAdded()) {
            // 先判断是否被add过
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container_id, toFragment, toFragment.getClass().getSimpleName())
                    .addToBackStack(toFragment.getClass().getSimpleName())
                    .commit();
        } else {
            getSupportFragmentManager()
                    .beginTransaction()
                    .hide(fromFragment)
                    .show(toFragment)
                    .commit(); // 隐藏当前的fragment，显示下一个
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        int weekDay = Utilities.getDayofWeek();
        switch (weekDay)
        {
            case 1:
            case 3:
                getMenuInflater().inflate(R.menu.menu_main_two, menu);
                break;
            case 2:
            case 4:
                getMenuInflater().inflate(R.menu.menu_main_one, menu);
                break;
            case 5:
                getMenuInflater().inflate(R.menu.menu_main_three, menu);
                break;
            case 6:
                getMenuInflater().inflate(R.menu.menu_main_five, menu);
                break;
            case 7:
                getMenuInflater().inflate(R.menu.menu_main_four, menu);
                break;
            default:
                getMenuInflater().inflate(R.menu.menu_main, menu);
                break;
        }

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_dlt) {
            if (dltFragment == null)
                dltFragment = new DltFragment();

            startFragment(dltFragment);
            return true;
        }

        if (id == R.id.action_ssq) {
            if (ssqFragment == null)
                ssqFragment = new SsqFragment();

            startFragment(ssqFragment);
            return true;
        }

        if (id == R.id.action_qxc) {
            if (qxcFragment == null)
                qxcFragment = new QxcFragment();

            startFragment(qxcFragment);
            return true;
        }

        if (id == R.id.action_ljy) {
            if (ljyFragment == null)
                ljyFragment = new LjyFragment();

            startFragment(ljyFragment);
            return true;
        }

        if (id == R.id.action_qws) {
            if (qwsFragment == null)
                qwsFragment = new QwsFragment();

            startFragment(qwsFragment);
            return true;
        }

        if (id == R.id.action_qlc) {
            if (qlcFragment == null)
                qlcFragment = new QlcFragment();

            startFragment(qlcFragment);
            return true;
        }

        if (id == R.id.action_plw) {
            if (plwFragment == null)
                plwFragment = new PlwFragment();

            startFragment(plwFragment);
            return true;
        }

        if (id == R.id.action_klb) {
            if (klbFragment == null)
                klbFragment = new KlbFragment();

            startFragment(klbFragment);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
