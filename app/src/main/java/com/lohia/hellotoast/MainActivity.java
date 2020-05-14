package com.lohia.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer mCount = 0;
    private TextView mCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCountText = (TextView) findViewById(R.id.count_text);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if(mCountText != null) {
            mCountText.setText(Integer.toString(mCount));
        }
    }

    public void countDown(View view) {
        mCount--;
        if(mCountText != null) {
            mCountText.setText(Integer.toString(mCount));
        }
    }
}
