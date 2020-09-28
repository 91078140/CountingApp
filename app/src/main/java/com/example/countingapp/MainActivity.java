package com.example.countingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info", "-------Feed Back--------");
        Log.e("error", "-------That's an error--------");
        Log.w("warning", "--------Be Careful with this--------");
        Log.wtf("Can't Believe it", "--------That is the worse failure ever----------");

        Toast.makeText(this, "Your toast is ready", Toast.LENGTH_LONG).show();
    }

    public void onClickFirstBtn(View view)
    {
        Toast.makeText(this, "You clicked the first button", Toast.LENGTH_LONG).show();
    }

    public void onClickSecondBtn(View view)
    {
        Toast.makeText(this, "You clicked the second button", Toast.LENGTH_SHORT).show();
    }
}