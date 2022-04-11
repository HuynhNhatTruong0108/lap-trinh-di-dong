package huynhnhattruong.baikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    Button phay, cham, cach, xoa, gach, tick, bang;
    TextView Manhinh, ketqua;
    String tinhtoan;
    double  kq, so1;

    RadioButton R1, R2, R3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double Rd1 = 0.13;
        double Rd2 = 0.15;
        double Rd3 = 0.15;
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
        bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tinhtoan = ketqua.getText().toString();
                ketqua.setText("");
                if (R1.isChecked()){
                    kq = 100 * Rd1;
                }
                else if (R2.isChecked()){
                    kq = 100 * Rd2;
                }
                else  if (R3.isChecked()){
                    kq = 100 * Rd3;
                }
                else return;
                ketqua.setText("you tip will be $"+ kq + "" );
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
        tick = findViewById(R.id.dautick);
        R1 = findViewById(R.id.R1);
        R2 = findViewById(R.id.R2);
        R3 = findViewById(R.id.R3);
        bang =findViewById(R.id.Bang);
        ketqua =findViewById(R.id.ketqua);

    }

}