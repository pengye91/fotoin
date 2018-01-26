package com.example.root.myfirstapplication;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends BaseActivity {
    private static final String TAG = "ThirdActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d(TAG, "onCreate");
        Log.d(TAG, "task id is: " + getTaskId());
        setContentView(R.layout.activity_third);
    }
}
