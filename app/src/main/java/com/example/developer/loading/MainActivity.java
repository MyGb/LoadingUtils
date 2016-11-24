package com.example.developer.loading;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.developer.loading.utils.LoadingUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_begin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DemonstrationLoadingAnimation();
            }
        });

    }

    private void DemonstrationLoadingAnimation() {
        LoadingUtil.showLoadingView(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                LoadingUtil.dismissLoadingView();
            }
        }, 2500);
    }
}
