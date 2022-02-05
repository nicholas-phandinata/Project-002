package id.nicholasp.project002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast myToast = null;
    private Button btn_to_second_activity, btn_implicit_intent;
    private EditText edit_fullname;
    //lifecycle activity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myToast = Toast.makeText(MainActivity.this, "onCreate Activity", Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0,0);
        myToast.show();

        //langkah 2: mengenalkan btn_to_second_activity
        btn_to_second_activity = findViewById(R.id.btn_to_second_activity);
        btn_implicit_intent =  findViewById(R.id.btn_implicit_intent);
        edit_fullname = findViewById(R.id.edit_fullname);

        //langkah 3: event handling btn_to_second_activity
        btn_to_second_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //data yang akan dikirim
                String fullname = edit_fullname.getText().toString();
                //perintah untuk berpindah activity
                //explicit intent
                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                myIntent.putExtra("fullname", fullname);
                startActivity(myIntent);
            }
        });

        btn_implicit_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //perintah untuk open implicit intent
                Intent myImplicitIntent = new Intent(Intent.ACTION_VIEW);
                myImplicitIntent.setData(Uri.parse("https://www.inixindo.id"));
                startActivity(myImplicitIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        myToast = Toast.makeText(MainActivity.this, "onStart Activity", Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0,0);
        myToast.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        myToast = Toast.makeText(MainActivity.this, "onResume Activity", Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0,0);
        myToast.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        myToast = Toast.makeText(MainActivity.this, "onPause Activity", Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0,0);
        myToast.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        myToast = Toast.makeText(MainActivity.this, "onStop Activity", Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0,0);
        myToast.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        myToast = Toast.makeText(MainActivity.this, "onRestart Activity", Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0,0);
        myToast.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        myToast = Toast.makeText(MainActivity.this, "onDestroy Activity", Toast.LENGTH_SHORT);
        myToast.setGravity(Gravity.CENTER, 0,0);
        myToast.show();
    }
}