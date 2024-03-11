package com.example.mainactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        Log.e("onCreate", "ActivityC onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "ActivityC onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "ActivityC onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop", "ActivityC onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "ActivityC onDestroy");
    }
}
