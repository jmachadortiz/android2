package com.example.jmachadortiz.myapplication;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x = (Button) findViewById(R.id.button);
        x.setOnClickListener(this);


    }

    public void onClick(View view){
        this.llamarIntent(view);
    }

    public void llamarIntent(View view){
        Intent intent = null;
        switch (view.getId()){
            case R.id.button:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.androideity.com"));
                startActivity(intent);
                break;


        }
    }

}
