package huynhnhattruong.baikiemtra1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText user = (EditText)findViewById(R.id.user);
        EditText pass = (EditText)findViewById(R.id.pass)     ;

        Button button = (Button) findViewById(R.id.btnLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                        if (user.getText().toString().equals("maicuongtho") && pass.getText().toString().equals("Cntt60ntu")) {
                            Toast.makeText(MainActivity.this, "user and password is conect", Toast.LENGTH_SHORT).show();
                        } else
                            Toast.makeText(MainActivity.this, "user and password is wrong", Toast.LENGTH_SHORT).show();


            }
        });


    }
}
