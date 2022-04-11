package huynhnhattruong.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button phay, cham, cach, xoa, gach, tick;
    TextView Manhinh;
    String tinhtoan;
    double ketqua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = Manhinh.getText().toString();
                Manhinh.setText(tinhtoan + "9");
            }
        });
        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Manhinh.setText("");
                tinhtoan = "";
            }
        });
       
    }
    protected void anhxa()
    {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        Manhinh = findViewById(R.id.manhinh);
        xoa = findViewById(R.id.dauxoa);
    }

}