package com.ibo.moveformoneactivitetoanotheractivite;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button2,button3;

    private final int REQUEST_CODE=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2=findViewById(R.id.button);
        button3=findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(MainActivity.this,SecondActivite.class));
                Intent intent=new Intent(MainActivity.this,SecondActivite.class);

                intent.putExtra("firstName","ibo");
                intent.putExtra("lastName","wahbeh");
                intent.putExtra("age",26);
                intent.putExtra("salary",0);
                intent.putExtra("welcomeMassge","hello from main view to second");
                //startActivity(intent);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ThridActivite.class);

                intent.putExtra("firstName","abo");
                intent.putExtra("lastName","talal");
                intent.putExtra("age",22);
                intent.putExtra("salary",6700);
                intent.putExtra("welcomeMassge","hello from main view to thrid");
                startActivity(intent);

            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE){
            if(resultCode==RESULT_OK){
                String rdata=data.getStringExtra("welcome");
                Toast.makeText(getApplicationContext(),rdata,Toast.LENGTH_LONG).show();
            }
        }
    }
}