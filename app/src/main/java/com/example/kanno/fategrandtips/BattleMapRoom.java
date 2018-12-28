package com.example.kanno.fategrandtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class BattleMapRoom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle_map_room);

        View title = findViewById(R.id.STitle);
        title.getBackground().setAlpha(150);

        View v0 = findViewById(R.id.battle0);
        v0.getBackground().setAlpha(150);

        View v1 = findViewById(R.id.battle1);
        v1.getBackground().setAlpha(150);

        View v2 = findViewById(R.id.battle2);
        v2.getBackground().setAlpha(150);

        View v3 = findViewById(R.id.battle3);
        v3.getBackground().setAlpha(150);

        View v4 = findViewById(R.id.battle4);
        v4.getBackground().setAlpha(150);

        View v5 = findViewById(R.id.battle5);
        v5.getBackground().setAlpha(150);

        View v6 = findViewById(R.id.battle6);
        v6.getBackground().setAlpha(150);

        View v7 = findViewById(R.id.battle7);
        v7.getBackground().setAlpha(150);

        View v8 = findViewById(R.id.battle8);
        v8.getBackground().setAlpha(150);

        View v9 = findViewById(R.id.battle9);
        v9.getBackground().setAlpha(150);

        View v10 = findViewById(R.id.battle10);
        v10.getBackground().setAlpha(150);
    }

    public void back(View view) {
        Intent i = new Intent(this, RoomList.class);
        startActivity(i);
        this.finish();
    }

    public void onClickM_1(View view){
        Intent i =new Intent(this,SingleBattleRoom.class);
        i.putExtra("Battle",1);
        startActivity(i);
    }
}
