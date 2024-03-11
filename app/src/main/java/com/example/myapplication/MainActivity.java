package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGe = "com.mycompany.myfirstapp.MESSAGE";
//    Button NA_Button = findViewById(R.id.NA_Button);
//    NA_Button.set
//    public void sendMessage(View view){
//        Intent intent = new Intent(this, DisplayMessageActivity.class);
//        EditText editText = findViewById(R.id.edit_message);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGe, message);
//        startActivity(intent);
//    }
    private final String TAG = "Proverka";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "debug in OnCreate");
        Button NA_Button = findViewById(R.id.NA_Button);
        NA_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                EditText editText = findViewById(R.id.edit_message);
                String message = editText.getText().toString();
                intent.putExtra(EXTRA_MESSAGe, message);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Запись в лог при старте активности
        Log.d(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Запись в лог при возобновлении активности
        Log.d(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();

        // Запись в лог при приостановке активности
        Log.d(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();

        // Запись в лог при остановке активности
        Log.d(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Запись в лог при уничтожении активности
        Log.d(TAG, "onDestroy()");
    }
//    private void setUpActionBar(){ //
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//        } else {
//        }
//    }
}