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

public class GameActivity extends AppCompatActivity {


    //Explicit
    Button btn1,btn2,btn3, btn4;
    ImageView questionImageView;
    ImageButton volumnImageButton;
    MediaPlayer mediaPlayer;//เล่นไฟล์เสียง
    int questionCount = 1;//เป็นตัวแปรเก็บจำนวนข้อคำถาม
    ArrayList<Integer> qID = new ArrayList<Integer>();// qID เป็นตัวแปร Array ในการสุ่มคำถาม
    String answer;//เก็บคำตอบ
    int score = 0;//รวมคะแนน


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

    }//End setQuestion method

    public void choiceAns(View view){ //ตรวรคำถามจอง choiceAns
        Button button = (Button) view;
        String buttonString = button.getText().toString();
        if (buttonString.equals(answer)) {
            score++;

        }
        if (qID.isEmpty()) {//ถ้าทำครบทุกข้อ นั่นคือ qID เป็นค่าว่าง
            dialogboxScore();//เป็น method dialogboxScore() สำหรับแสดงคะแนนรวม

        } else {//ถ้ายังทำไม่ครบทุกข้อ
            setQuestion(qID.remove(0));//เรียก method setQuestion() แสดงคำถามถัดไป

        }

    }// End method choiceAns

    private void dialogboxScore() {// Method สำหรับแสดงคะแนน

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("สรุปคะแนน");
        builder.setMessage("ได้คะแนน " + score + " คะแนน")
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
        alertDialog.show();


    }


    public void playSound(View view) { //public =classอื่นสามารถเรียกใช้งานได้
        mediaPlayer.start();

    }//end playSound method

}//end class
