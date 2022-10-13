package com.ibo.moveformoneactivitetoanotheractivite;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivite extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activite);

        textView=findViewById(R.id.textView3);
        button=findViewById(R.id.button3);

        Bundle bundle=getIntent().getExtras();
        String firstName=bundle.getString("firstName");
        String lastname=bundle.getString("lastName");
        String welcome=bundle.getString("welcomeMassge");
        int age=bundle.getInt("age");
        int salary=bundle.getInt("salary");

        textView.setText(welcome+"\n"+firstName+"\n"+lastname+"\n"+age+"\n"+salary);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                intent.putExtra("welcome","bach from second view");
                setResult(RESULT_OK,intent);
                finish();

            }
        });
    }


}