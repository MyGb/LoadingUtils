package com.example.developer.loading.utils;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;

import com.example.developer.loading.R;

/**
 * Created by Developer on 2016/11/24.
 */

public class LoadingUtil {

    private static FrameLayout frameLayout;
    private static View loadingView;

    public static void showLoadingView(Activity activity) {
        showLoadingView(activity, R.layout.loading_default_style);
    }

    public static void showLoadingView(Activity activity, int resId) {
        if (frameLayout != null && loadingView != null || null == activity) {
            return;
        }
        frameLayout = (FrameLayout) activity.getWindow().getDecorView();
        loadingView = View.inflate(activity, resId, null);
        frameLayout.addView(loadingView);
    }

    public static void dismissLoadingView() {
        if (null == frameLayout || null == loadingView) {
            return;
        }
        frameLayout.removeView(loadingView);
        frameLayout = null;
        loadingView = null;
    }
}
