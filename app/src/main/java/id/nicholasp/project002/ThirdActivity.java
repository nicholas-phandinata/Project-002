package id.nicholasp.project002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    private Button btn_to_second_from_third;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        btn_to_second_from_third = findViewById(R.id.btn_to_second_from_third);

        btn_to_second_from_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(myIntent);
            }
        });
    }
}