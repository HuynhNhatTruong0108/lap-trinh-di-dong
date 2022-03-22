package com.example.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //khai bao doi tuong lam viec
    EditText editsoA, editsoB;
    TextView textViewKetQua;
    Button nutCong, nutTru, nutNhan, nutChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      timwidget();
    }
    void timwidget()
    {

        editsoA = findViewById(R.id.edsoA);
        editsoB = findViewById(R.id.edsoB);
        textViewKetQua = (TextView)findViewById(R.id.tvKetQua);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }
    //ham xu li
    public void XuLyCong(View v){
        String sA = editsoA.getText().toString();
        String sB = editsoB.getText().toString();
        //chuyen kieu so\
        int a  = Integer.parseInt(sA);
        int b  = Integer.parseInt(sB);
        //tinh tong
        int tong = a+b ;
        //chuyen tong thanh chuoi
        String chuoitong = String.valueOf(tong);
        //xuat ket qua
        textViewKetQua.setText("tong la: " + chuoitong);
    }
    public void XuLyTru(View v){
        String sA = editsoA.getText().toString();
        String sB = editsoB.getText().toString();
        //chuyen kieu so\
        int a  = Integer.parseInt(sA);
        int b  = Integer.parseInt(sB);
        //tinh tong
        int tong = a-b ;
        //chuyen tong thanh chuoi
        String chuoitong = String.valueOf(tong);
        //xuat ket qua
        textViewKetQua.setText("hieu la: " + chuoitong);
    }
    public void XuLyNhan(View v){
        String sA = editsoA.getText().toString();
        String sB = editsoB.getText().toString();
        //chuyen kieu so\
        int a  = Integer.parseInt(sA);
        int b  = Integer.parseInt(sB);
        //tinh tong
        int tong = a*b ;
        //chuyen tong thanh chuoi
        String chuoitong = String.valueOf(tong);
        //xuat ket qua
        textViewKetQua.setText("tich la: " + chuoitong);
    }
    public void XuLyChia(View v){
        String sA = editsoA.getText().toString();
        String sB = editsoB.getText().toString();
        //chuyen kieu so\
        float a  = Integer.parseInt(sA);
        float b  = Integer.parseInt(sB);
        //tinh tong
        float tong = a/b ;
        //chuyen tong thanh chuoi
        String chuoitong = String.valueOf(tong);
        //xuat ket qua
        textViewKetQua.setText("thuong la: " + chuoitong);
    }
}