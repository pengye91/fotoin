package com.example.root.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ViceActivity extends BaseActivity {
    private static final String TAG = "ViceActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vice);
        Log.d(TAG, this.toString());
        Log.d(TAG, "task id is: " + getTaskId());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("extra_data", "this is a return data if back is pressed");
        setResult(RESULT_OK, intent);
        finish();
    }
}
