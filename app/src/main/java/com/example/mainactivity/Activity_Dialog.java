package com.example.mainactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Activity_Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        Log.e("onCreate", "Activity_Dialog onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "Activity_Dialog onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "Activity_Dialog onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "Activity_Dialog onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "Activity_Dialog onDestroy");
    }

}
