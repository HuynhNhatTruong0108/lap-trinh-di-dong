package thi.Cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Manhhinh2 extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhhinh2);
        tv = findViewById(R.id.TV);
        Intent MH2 = getIntent();
        String username = MH2.getExtras().getString("Hello World");
        tv.setText(username);
    }
}