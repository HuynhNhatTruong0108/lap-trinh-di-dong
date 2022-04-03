package ma61133209.cntt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void BtnLogin(View v)
    {
        Intent iBtnlogin = new Intent(MainActivity.this , login.class);
        //chuyen
        startActivity(iBtnlogin);
    }
}