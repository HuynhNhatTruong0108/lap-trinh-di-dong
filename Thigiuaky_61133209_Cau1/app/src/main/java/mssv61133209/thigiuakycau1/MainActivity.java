package mssv61133209.thigiuakycau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button tinh;
    Button tinhdt;
    EditText soA;
    EditText soB;
    EditText soH;
    TextView kq;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tinh = findViewById(R.id.btnTinh);
        soA = findViewById(R.id.editA);
        soB =findViewById(R.id.editB);
        soH =findViewById(R.id.editH);
        kq = findViewById(R.id.KQ);
        tinhdt = findViewById(R.id.Tinhdt);


        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sA = soA.getText().toString();
                String sB = soB.getText().toString();

                int a  = Integer.parseInt(sA);
                int b  = Integer.parseInt(sB);

                //chu vi
                int CV = (a+b)*2 ;
                String Chuvi = String.valueOf(CV);
                kq.setText(""+ Chuvi);
                //dien tich

            }



        });
        tinhdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sA = soA.getText().toString();
                String sH = soH.getText().toString();
                int a  = Integer.parseInt(sA);
                int h  = Integer.parseInt(sH);

                int DT = a * h;
                String Dientich = String.valueOf(DT);
                kq.setText(""+ Dientich);
            }
        });
    }

}