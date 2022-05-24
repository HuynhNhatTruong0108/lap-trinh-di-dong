package ontap.ontap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
EditText edc;
EditText edf;
Button btnCF;
Button btnFC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edc = findViewById(R.id.EdC);
        edf = findViewById(R.id.EdF);
        btnCF = findViewById(R.id.btnCF);
        btnFC = findViewById(R.id.btnFC);




        btnCF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                {
                    String giatriC = edc.getText().toString();
                    double C  = Double.parseDouble(giatriC);
                    double giatriF = (double) 9/5 * C  + 32;

                    String chuoiF = String.valueOf(giatriF);
                    edf.setText(""+ chuoiF);
                }
            }
        });
        btnFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}