package com.example.hw611activitylifelogging;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

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

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, METHOD_CREATE);

        init();

        textView.append("\n" + METHOD_CREATE);
    }

    private void init() {
        textView = findViewById(R.id.textView);
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

        //return super.onKeyDown(keyCode, event);
        return true;
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
