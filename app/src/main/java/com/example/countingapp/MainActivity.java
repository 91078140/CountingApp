package com.example.countingapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int num = 0;
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
        num++;
        updateIntroTV();
        //Toast.makeText(this, "You clicked the first button", Toast.LENGTH_LONG).show();
    }

    public void onClickSecondBtn(View view)
    {
        if(num > 0) {
            num--;
            updateIntroTV();
        }

        //Toast.makeText(this, "You clicked the second button", Toast.LENGTH_SHORT).show();
    }

    public void onClickGoScreen2(View view)
    {
        startActivity(new Intent(MainActivity.this, screen2.class));
    }

    public void openDialogue(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm reset");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                num = 0;
                updateIntroTV();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    private void updateIntroTV()
    {
        TextView tally = findViewById(R.id.introTV);
        tally.setText("You have " + num + " goldfish.");
    }
}