package com.tse.resume.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity implements  View.OnClickListener {

    private  Button buttonValidate;
    private EditText editTextName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        initViews();
    }

    private void initViews(){
        buttonValidate = findViewById(R.id.activity_form_button_validate);
        editTextName = findViewById(R.id.activity_form_edittext_name);
    buttonValidate.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
      saveData();
    }
});

    }

    private void saveData(){
        Intent intent = new Intent();
        String username = getIntent().getStringExtra("USERNAME");
        intent.putExtra("USERNAME", editTextName.getText().toString());

        finish();
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.activyt_main_button_next :
                break;
        }
    }
}
