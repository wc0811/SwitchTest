package com.eascs.switchtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.eascs.switchtest.lib.SwitchButton;

public class MainActivity extends AppCompatActivity {
    private SwitchButton sbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sbtn = (SwitchButton) findViewById(R.id.switch_btn);
        sbtn.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "选中", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "未选中", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
