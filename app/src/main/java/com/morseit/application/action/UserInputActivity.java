package com.morseit.application.action;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.morseit.application.R;
import com.morseit.application.constants.MorseItConstants;

import org.apache.commons.lang3.StringUtils;

public class UserInputActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextUserInput;
    private Button encodeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
        editTextUserInput =(EditText)findViewById(R.id.editTextTextMultiLineUserInput);
        encodeButton = (Button)findViewById(R.id.encodeButton);
        encodeButton.setOnClickListener(this);
    }


    @Override
    protected void onPause() {
        super.onPause();
        editTextUserInput.clearComposingText();
    }

    @Override
    public void onClick(View view) {
        String userInput =  editTextUserInput.getText()!=null?
                editTextUserInput.getText().toString():null;
        if(StringUtils.isNotBlank(userInput)){
            Intent intent = new Intent(UserInputActivity.this,DisplayResultActivity.class);
            intent.putExtra(MorseItConstants.INTENT_KEYS.USER_INPUT,userInput);
            startActivity(intent);
        }else{
            Toast.makeText(UserInputActivity.this,"Please enter your message to encode",Toast.LENGTH_SHORT);
        }


    }
}