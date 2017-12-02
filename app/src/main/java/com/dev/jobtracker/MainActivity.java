package com.dev.jobtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mCompany, mFreelancer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCompany = (Button) findViewById(R.id.company);
        mFreelancer = (Button) findViewById(R.id.freelancer);

        mCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CompanyLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mFreelancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FreelanceLoginActivity.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}
