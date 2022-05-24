package listsing.example.ontap2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {
Button btnDoc;
EditText etext;
    void getWiggetRef() {
        btnDoc = (Button)findViewById(R.id.btnDoc);
        etext = (EditText)findViewById(R.id.editText) ;
    }
    String readData(InputStream inp){
        String dongVanBan;
        InputStreamReader inpRdr=new InputStreamReader(inp);
        BufferedReader buffRdr=new BufferedReader(inpRdr);
        StringBuilder boTaoChuoi=new StringBuilder();
        try{
            while((dongVanBan=buffRdr.readLine())!=null){
                boTaoChuoi.append(dongVanBan);
                boTaoChuoi.append("\n");
            }
            inp.close();// Đông Luồng nhập
        }catch(IOException ex){
            Log.e("ERROR",ex.getMessage());
        }
        return boTaoChuoi.toString();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWiggetRef();
        btnDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputStream inputStream = getResources().openRawResource(R.raw.uocgi);
                etext.setText(readData(inputStream));
            }
        });


    }


}