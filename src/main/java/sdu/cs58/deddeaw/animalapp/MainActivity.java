package sdu.cs58.deddeaw.animalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    Button startButton;
    String nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial view ผูกตัวแปร
        nameEditText = findViewById(R.id.edtName);
        startButton = findViewById(R.id.btnStart);

        startButton.setOnClickListener(new View.OnClickListener() {//เช็คว่า User มีการกดแล้วหรือยัง
            @Override
            public void onClick(View view) {//ถ้า user กดแล้ว
                nameString = nameEditText.getText().toString().trim();//การเอาข้อความที่ user พิมที่เป็นตัวหนังสือและไม่มีช่องว่างมาเก็บในข้อความ nameString

                //check ค่าว่างตัวแปร nameString
                if (nameString.length() == 0) {//nameString เป็นค่าว่าง ==0
                    Toast.makeText(getApplicationContext(), "กรุณากรอกชื่อ", Toast.LENGTH_SHORT).show();//Toast ใช้แสดงคำพูด
                } else {//ถ้าไม่เป็นค่าว่างให้เปิดหน้าเกม
                    Intent startIntent = new Intent(MainActivity.this, GameActivity.class);//การเรียกใช้ Instent
                    startIntent.putExtra("Name", nameString);
                    startActivity(startIntent);
                }

            }
        });//end setOnClickListener Mothod



    }// end  onCreate method
}//End class
