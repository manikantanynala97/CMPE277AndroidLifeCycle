package com.example.mainactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static int counter;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("onCreate ------", "Main OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart ------", "Main OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume ------", "Main onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause ------", "Main onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("onStop ------", "Main onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy ------", "Main onDestroy");
    }

    public void switchActivityB(View view){
        counter += 5;
        Intent intent = new Intent(MainActivity.this, ActivityB.class);
        startActivity(intent);
    }

    public void switchActivityC(View view){
        counter += 10;
        Intent intent = new Intent(MainActivity.this, ActivityC.class);
        startActivity(intent);
    }

    public void openDialog(View view) {
        Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.activity_dialog);
        dialog.setTitle("Dialog is opened");
        dialog.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        TextView textView = findViewById(R.id.counterTextView);
        textView.setText("Counter: " + counter);
        Log.e("onRestart ------", "Main onRestart");
    }
    public void closeDialog(View view) {
        finish(); // Close the dialog
    }

}
