package com.example.kanno.fategrandtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class RoomList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_list);
        View v1= findViewById(R.id.Button_Servant);//找到你要设透明背景的layout 的id
        v1.getBackground().setAlpha(150);//0~255透明度值

        View v2= findViewById(R.id.Button_Craft);//找到你要设透明背景的layout 的id
        v2.getBackground().setAlpha(150);//0~255透明度值


        View v3= findViewById(R.id.Strategy);//找到你要设透明背景的layout 的id
        v3.getBackground().setAlpha(150);//0~255透明度值

        View v4= findViewById(R.id.Counter);//找到你要设透明背景的layout 的id
        v4.getBackground().setAlpha(150);//0~255透明度值

        View v5= findViewById(R.id.Button_Singular);//找到你要设透明背景的layout 的id
        v5.getBackground().setAlpha(150);//0~255透明度值

        View v6= findViewById(R.id.Produce);//找到你要设透明背景的layout 的id
        v6.getBackground().setAlpha(150);//0~255透明度值

    }

    public void onClickCounter(View view){
        Intent i = new Intent(RoomList.this,Counter.class);
        startActivity(i);
    }

    public void onClickServant(View view){
        Intent i = new Intent(RoomList.this,ServantRoom.class);
        startActivity(i);

    }

    public void onClickSingular(View view){
        Intent i=new Intent(this,BattleMapRoom.class);
        startActivity(i);
    }

    public void GoConstruct(View view){
        Intent i = new Intent(this,ConstructionRoom.class);
        startActivity(i);

    }
}
