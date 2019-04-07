package com.example.nh.fragment2;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button add,replace,remove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.add);
        replace=findViewById(R.id.replace);
        remove=findViewById(R.id.remove);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment1 fragment1 =new fragment1();
                FragmentManager manager=getSupportFragmentManager();
                FragmentTransaction transaction=manager.beginTransaction();
                transaction.add(R.id.linear,fragment1,"A");
                transaction.commit();
            }
        });



    }
}
