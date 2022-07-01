package thi.Cau2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    Button send ;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send =findViewById(R.id.BtnSend);
        name = findViewById(R.id.Name);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                Toast.makeText(MainActivity.this, "Huynh Nhat Truong + 61133209", Toast.LENGTH_SHORT).show();
                Intent MH2 = new Intent(MainActivity.this,Manhhinh2.class);
                MH2.putExtra("Hello World", username);
                startActivity(MH2);
            }
        });
    }
}