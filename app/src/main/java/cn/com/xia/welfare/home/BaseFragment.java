package cn.com.xia.welfare.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public abstract class BaseFragment extends Fragment {
    protected View root;
    private boolean isInitData;
    public boolean isFirstVisible = true;
    public boolean isFirstInvisible = true;

    public boolean isViewCreated = false;
    public boolean isUIVisible = false;
    public AppCompatActivity mActivity;
    public LayoutInflater inflater;
    public Context mContext;

    private boolean isCurrentFragment = false;

    public boolean isCurrentFragment() {
        return isCurrentFragment;
    }

    public void setCurrentFragment(boolean currentFragment) {
        isCurrentFragment = currentFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
        mActivity = (AppCompatActivity)getActivity();

        inflater = (LayoutInflater) mActivity.getSystemService(AppCompatActivity.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (root == null) {
            root = inflater.inflate(getLayoutId(), container, false);
            initView();
        } else {
            ViewGroup viewparent = (ViewGroup) root.getParent();
            if (null != viewparent) viewparent.removeView(root);
        }
        isViewCreated = true;
        return root;
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
            if (!isInitData) {
                initData();
                isInitData = true;
            }
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        isViewCreated = false;
    }

    protected abstract void initView();

    public abstract void initData();

    protected abstract  int getLayoutId();

    public interface FragmentBackListener {
        void  onBackForward();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser)
        {
            if (isViewCreated)
            {

            }
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
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);

        if (hidden) {

        } else {

        }
    }
}
