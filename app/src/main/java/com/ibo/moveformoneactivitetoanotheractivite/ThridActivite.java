package com.ibo.moveformoneactivitetoanotheractivite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ThridActivite extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid_activite);

        textView=findViewById(R.id.textView4);

        Bundle bundle=getIntent().getExtras();
        String firstName=bundle.getString("firstName");
        String lastname=bundle.getString("lastName");
        String welcome=bundle.getString("welcomeMassge");
        int age=bundle.getInt("age");
        int salary=bundle.getInt("salary");

        textView.setText(welcome+"\n"+firstName+"\n"+lastname+"\n"+age+"\n"+salary);
    }
}