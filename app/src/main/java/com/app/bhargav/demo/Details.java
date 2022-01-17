package com.app.bhargav.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by bhargav on 8/3/17. updated in new branch
 */
public class Details extends AppCompatActivity {

    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        back = (ImageView) findViewById(R.id.backDetails);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
    }

    public void onBackPressed(){
        goBack();
    }

    public void goBack(){
        Intent i = new Intent(Details.this,MainActivity.class);
        startActivity(i);
        this.finish();
    }
}
