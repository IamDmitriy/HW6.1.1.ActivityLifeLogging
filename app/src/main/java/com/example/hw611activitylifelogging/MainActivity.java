package com.example.hw611activitylifelogging;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Lifecycle";
    private static final String METHOD_CREATE = "onCreate";
    private static final String METHOD_START = "onStart";
    private static final String METHOD_RESUME = "onResume";
    private static final String METHOD_PAUSE = "onPause";
    private static final String METHOD_STOP = "onStop";
    private static final String METHOD_DESTROY = "onDestroy";
    private static final String METHOD_RESTART = "onRestart";
    private static final String METHOD_POST_CREATE = "onPostCreate";
    private static final String METHOD_POST_RESUME = "onPostResume";
    private static final String METHOD_KEY_DOWN = "onKeyDown";
    private static final String METHOD_KEY_LONG_PRESS = "onKeyLongPress";
    private static final String METHOD_BACK_PRESS = "onBackPressed";
    private static final String METHOD_SAVE_INSTANCE_STATE = "onSaveInstanceState";
    private static final String METHOD_RESTORE_INSTANCE_STATE = "onRestoreInstanceState";
    private static final String TEXT_KEY = "textView";
    private static final String SAVED_INSTANCE_STATE_NULL = "savedInstanceState == null";
    private static final String SAVED_INSTANCE_STATE_NOT_NULL = "savedInstanceState != null";

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        Button btnNewInstanceActivity = findViewById(R.id.btnNewInstanceActivity);
        btnNewInstanceActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        if (savedInstanceState == null) {
            Log.d(TAG, SAVED_INSTANCE_STATE_NULL);
            textView.append("\n" + SAVED_INSTANCE_STATE_NULL);
        } else {
            textView.setText(savedInstanceState.getString(TEXT_KEY));
            Log.d(TAG, SAVED_INSTANCE_STATE_NOT_NULL);
            textView.append("\n" + SAVED_INSTANCE_STATE_NOT_NULL);
        }

        Log.d(TAG, METHOD_CREATE);

        textView.append("\n" + METHOD_CREATE);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, METHOD_START);
        textView.append("\n" + METHOD_START);
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, METHOD_RESUME);
        textView.append("\n" + METHOD_RESUME);
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, METHOD_PAUSE);
        textView.append("\n" + METHOD_PAUSE);
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, METHOD_STOP);
        textView.append("\n" + METHOD_STOP);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, METHOD_DESTROY);
        textView.append("\n" + METHOD_DESTROY);
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, METHOD_RESTART);
        textView.append("\n" + METHOD_RESTART);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);

        Log.d(TAG, METHOD_POST_CREATE);
        textView.append("\n" + METHOD_POST_CREATE);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.d(TAG, METHOD_POST_RESUME);
        textView.append("\n" + METHOD_POST_RESUME);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        Log.d(TAG, METHOD_KEY_DOWN);
        textView.append("\n" + METHOD_KEY_DOWN);

        return super.onKeyDown(keyCode, event);
//        return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {

        Log.d(TAG, METHOD_KEY_LONG_PRESS);
        textView.append("\n" + METHOD_KEY_LONG_PRESS);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {

        Log.d(TAG, METHOD_BACK_PRESS);
        textView.append("\n" + METHOD_BACK_PRESS);
        super.onBackPressed();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (!TextUtils.isEmpty(textView.getText())) {
            outState.putString(TEXT_KEY, textView.getText().toString());
        }

        Log.d(TAG, METHOD_SAVE_INSTANCE_STATE);
        textView.append("\n" + METHOD_SAVE_INSTANCE_STATE);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {

        Log.d(TAG, METHOD_RESTORE_INSTANCE_STATE);
        textView.append("\n" + METHOD_RESTORE_INSTANCE_STATE);
        super.onRestoreInstanceState(savedInstanceState);
    }
}
