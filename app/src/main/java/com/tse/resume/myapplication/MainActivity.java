package com.tse.resume.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    private  TextView textViewName;
    private Button buttonNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);*


        initViews();
    }

    private void initViews(){
            textViewName = findViewById(R.id.activyt_main_textview_name);
            buttonNext = findViewById(R.id.activyt_main_button_next);
            textViewName.setText(R.string.activyt_main_textview_name);
            buttonNext.setOnClickListener(this);
        }

        @Override
        public void onActvityResult(int requestCode, int resultCode, @Nullable Intent){

            if (requestCode == 1 ){
                if (resultCode == RESULT_OK && data.getExtras()!= null){
                    Bundle args = data.getExtras();
                    String username = args.getString(key: "USERNAME");
                    textViewName.setText(username);
                }else{
                    //code
                }
            }
        }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.activyt_main_button_next :
                Intent intent  = new Intent(this, FormActivity.class);
                startActivityForResult(intent, requestCode:1);
                startActivity(intent);
                break;
        }
    }
}
