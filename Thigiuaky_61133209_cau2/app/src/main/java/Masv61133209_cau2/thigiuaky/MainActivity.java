package Masv61133209_cau2.thigiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Button Btnthem, Btncapnhat, Btnxoa;
    EditText Ed1;
    int vitri = -1;
    ArrayList<String> ararrCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.Listviewb3);
        Btnthem = (Button) findViewById(R.id.them);
        Btncapnhat = (Button) findViewById(R.id.sua) ;
        Ed1 = (EditText) findViewById(R.id.ed1);
        Btnxoa = (Button) findViewById(R.id.xoa) ;

        ararrCourse = new ArrayList<>();
        ararrCourse.add("Viật Bắc");
        ararrCourse.add("Đất Nước");
        ararrCourse.add("Tây tiến");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                ararrCourse
        );
        listView.setAdapter(adapter);
        Btnthem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String danhsach = Ed1.getText().toString();
                ararrCourse.add(danhsach);
                adapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Ed1.setText(ararrCourse.get(i));
                vitri = i;
            }
        });
        Btncapnhat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ararrCourse.set(vitri, Ed1.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });
        Btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view )  {
                ararrCourse.remove(vitri);
                adapter.notifyDataSetChanged();
            }
        });
    }
}