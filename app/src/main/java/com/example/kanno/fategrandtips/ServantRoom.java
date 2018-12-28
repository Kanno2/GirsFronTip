package com.example.kanno.fategrandtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class ServantRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servant_room);

        View title = findViewById(R.id.SeTitle);
        title.getBackground().setAlpha(150);
    }
    public void back(View view){
        Intent i =new Intent(ServantRoom.this,RoomList.class);
        startActivity(i);
    }
    public void onClickS_1(View view){
        Intent i=new Intent(ServantRoom.this,SingleServant.class);
        i.putExtra("Servant",1);
        startActivity(i);
    }
    public void onClickS_2(View view){
        Intent i=new Intent(ServantRoom.this,SingleServant.class);
        i.putExtra("Servant",2);
        startActivity(i);
    }
}
