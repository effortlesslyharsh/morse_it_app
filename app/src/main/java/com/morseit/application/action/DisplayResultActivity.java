package com.morseit.application.action;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.morseit.application.R;
import com.morseit.application.constants.MorseItConstants;
import com.morseit.application.utils.MorseItConverterUtil;

public class DisplayResultActivity extends AppCompatActivity {
private TextView resultTextView;
private String inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);
        resultTextView = (TextView)findViewById(R.id.textViewResult);
    }

    @Override
    protected void onStart() {
        super.onStart();
        inputText = getIntent().getStringExtra(MorseItConstants.INTENT_KEYS.USER_INPUT);
        String encodedText =  MorseItConverterUtil.getMorseEncodedValuesForString(inputText);
        resultTextView.setText(encodedText);
    }

    @Override
    protected void onPause() {
        super.onPause();
        resultTextView.clearComposingText();
    }
}