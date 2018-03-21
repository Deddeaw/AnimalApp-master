package sdu.cs58.deddeaw.animalapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.jar.Attributes;

public class GameActivity extends AppCompatActivity {


    //Explicit
    Button btn1,btn2,btn3, btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;//เล่นไฟล์เสียง
    int questionCount = 10;//เป็นตัวแปรเก็บจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>();// qID เป็นตัวแปร Array ในการสุ่มคำถาม
    String answer;//เก็บคำตอบ
    int score = 0;//รวมคะแนน
    String getNameString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {//ออกแบบหน้าจอ
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //initial View ผูก element กับตัวแปรบน java
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        questionImageView = findViewById(R.id.imvQuestion);
        volumnImageButton = findViewById(R.id.imbVolumn);

        //เช็คหรือนับจำนวนคำถาม
        for (int i=1; i <= questionCount; i++) {
            qID.add(i);

        }// ปิดแสดงข้อคำถาม

        Collections.shuffle(qID); //กำหนดให้ Random คำถาม
        setQuestion(qID.remove(0));//method ที่ใช้แสดงรายละเอียดคำถาม , .remove คำถามที่ตอบแล้วจะลบไม่เอาอีก

    }//End onCreate Method

    private void setQuestion(int qID) { // method question ทำหน้าที่กำหนดข้อคำถาม และเฉลยในแต่ละข้อ
        if (qID == 1) {
            answer = "นก";
            questionImageView.setImageResource(R.drawable.bird);
            mediaPlayer = MediaPlayer.create(this,R.raw.bird);

            ArrayList<String> choice = new ArrayList<String>();//กำหนดการ Random choice
            choice.add("นก");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("แมว");
            choice.add("ม้า");
            choice.add("หมู");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));

        }
        if (qID == 2) {
            answer = "แมว";
            questionImageView.setImageResource(R.drawable.cat);
            mediaPlayer = MediaPlayer.create(this, R.raw.cat);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("แมว");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("แกะ");
            choice.add("สิงโต");
            choice.add("ช้าง");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 3) {
            answer = "วัว";
            questionImageView.setImageResource(R.drawable.cow);
            mediaPlayer = MediaPlayer.create(this, R.raw.cow);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("วัว");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("หมา");
            choice.add("ช้าง");
            choice.add("ม้า");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 4) {
            answer = "หมา";
            questionImageView.setImageResource(R.drawable.dog);
            mediaPlayer = MediaPlayer.create(this, R.raw.dog);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("หมา");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("แกะ");
            choice.add("นก");
            choice.add("ยุง");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 5) {
            answer = "ช้าง";
            questionImageView.setImageResource(R.drawable.elephant);
            mediaPlayer = MediaPlayer.create(this, R.raw.elephant);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("ช้าง");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("ม้า");
            choice.add("วัว");
            choice.add("แมว");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 6) {
            answer = "ม้า";
            questionImageView.setImageResource(R.drawable.horse);
            mediaPlayer = MediaPlayer.create(this, R.raw.horse);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("ม้า");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("ยุง");
            choice.add("หมา");
            choice.add("แมว");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 7) {
            answer = "สิงโต";
            questionImageView.setImageResource(R.drawable.lion);
            mediaPlayer = MediaPlayer.create(this, R.raw.lion);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("สิงโต");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("หมูะ");
            choice.add("นก");
            choice.add("แกะ");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 8) {
            answer = "ยุง";
            questionImageView.setImageResource(R.drawable.mosquito);
            mediaPlayer = MediaPlayer.create(this, R.raw.mosquito);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("ยุง");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("หมู");
            choice.add("ม้า");
            choice.add("วัว");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 9) {
            answer = "หมู";
            questionImageView.setImageResource(R.drawable.pig);
            mediaPlayer = MediaPlayer.create(this, R.raw.pig);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("หมู");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("หมา");
            choice.add("แมว");
            choice.add("ยุง");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }
        if (qID == 10) {
            answer = "แกะ";
            questionImageView.setImageResource(R.drawable.sheep);
            mediaPlayer = MediaPlayer.create(this, R.raw.sheep);

            ArrayList<String> choice = new ArrayList<>();
            choice.add("แกะ");//แสดงว่ามีสัตว์อะไรใน choice บ้าง
            choice.add("ม้า");
            choice.add("นก");
            choice.add("สิงโต");
            Collections.shuffle(choice);//กำหนดให้ ramdom choice
            btn1.setText(choice.remove(0));
            btn2.setText(choice.remove(0));
            btn3.setText(choice.remove(0));
            btn4.setText(choice.remove(0));
        }


    }//End setQuestion method

    public void choiceAns(View view){ //ตรวรคำถามของ choiceAns
        Button button = (Button) view;//ประกาศตัวแปรเพิ่มคือ button
        String buttonString = button.getText().toString();//แปลงให้ button ที่เป็นปุ่มมาแปลงให้เป็น String
        if (buttonString.equals(answer)) {//equals เช็คทุกคาแร็คเตอร์ว่าถูกต้องทุกตัวไหม
            score++;

        }
        if (qID.isEmpty()) {//ถ้าทำครบทุกข้อ นั่นคือ qID เป็นค่าว่าง
            getNameString = getIntent().getStringExtra("Name");
            dialogboxScore(getNameString);//เป็น method dialogboxScore() สำหรับแสดงคะแนนรวม

        } else {//ถ้ายังทำไม่ครบทุกข้อ
            setQuestion(qID.remove(0));//เรียก method setQuestion() แสดงคำถามถัดไป

        }

    }// End method choiceAns

    private void dialogboxScore(String name) {// Method สำหรับแสดงคะแนน

        AlertDialog.Builder builder = new AlertDialog.Builder(this); //การประกาศ instant
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("คุณ "+ name + " ได้คะแนน " + score + " คะแนน")
            .setCancelable(false)
            .setPositiveButton("ออกจากเกม", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();// ปิด activity เพื่ออกจาก app

                }
            })
            .setNegativeButton("เล่นอีกครั้ง", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Intent intent = getIntent();
                    finish();// ปิดหน้าปัจจุบัน
                    startActivity(intent);//เปิดหน้าเกมขึ้นมาใหม่

                }
            });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();//สั่งให้แสดง


    }


    public void playSound(View view) { //public =classอื่นสามารถเรียกใช้งานได้
        mediaPlayer.start();

    }//end playSound method

}//end class
