package id.nicholasp.project002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private Button btn_to_main_activity, btn_to_third_activity;
    private TextView txt_display_fullname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //langkah 2: mengenalkan btn_to_second_activity
        btn_to_main_activity = findViewById(R.id.btn_to_main_activity);
        txt_display_fullname = findViewById(R.id.txt_display_fullname);

        //langkah 3: event handling btn_to_second_activity
        btn_to_main_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk berpindah activity
                //explicit intent
                Intent myIntent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        btn_to_third_activity = findViewById(R.id.btn_to_third_activity);

        //langkah 3: event handling btn_to_second_activity
        btn_to_third_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk berpindah activity
                //explicit intent
                Intent myIntent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(myIntent);
            }
        });

        //menerima data dari main activity
        Intent receiveIntent = getIntent();
        String display_fullname = receiveIntent.getStringExtra("fullname");

        //menampilkan data
        txt_display_fullname.setText("Hello " + display_fullname + "!");
    }
}