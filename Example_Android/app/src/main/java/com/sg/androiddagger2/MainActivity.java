package com.sg.androiddagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.sg.androiddagger2.components.DiComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject NetworkApi networkApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApplication) getApplication()).getComponent().inject(this);

        boolean injected = !(networkApi == null);

        TextView userAvailable = (TextView) findViewById(R.id.tv_available);

        String displayText = getResources().getString(R.string.di_worked, String.valueOf(injected));
        userAvailable.setText(displayText);
    }
}
