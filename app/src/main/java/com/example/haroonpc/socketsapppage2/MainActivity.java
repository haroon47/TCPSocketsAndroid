package com.example.haroonpc.socketsapppage2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.editText);
    }

    public void sendMessage(View v)
    {
        MessageSender messageSender = new MessageSender();
        messageSender.execute(e1.getText().toString());

    }

}
