package com.example.kanno.fategrandtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import java.util.ArrayList;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleBattleRoom extends AppCompatActivity {

    static int Battle_id=1;
    static Battle currentBattle=null;
    static boolean[] AbleToShowMap={true,true,true,true,true,true,true};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_battle_room);

        View title = findViewById(R.id.Btitle);
        title.getBackground().setAlpha(100);


        View v1 = findViewById(R.id.Text_drawable);
        v1.getBackground().setAlpha(100);


        Intent i =getIntent();
        Battle_id=i.getIntExtra("Battle",1);
        ArrayList<Battle> LoadBattle= onCreateBattles();
        currentBattle = LoadBattle.get(Battle_id);
        DisplayBattleMassage(currentBattle);
    }

    public void ShowMap1(View view){
        if (AbleToShowMap[0]){
            ImageView M1_image=(ImageView)findViewById(R.id.Map1_image);
            M1_image.setImageDrawable(currentBattle.getOrigin().get(0).getMapimage());
            AbleToShowMap[0]=false;
        }
        else{
            ImageView M1_image=(ImageView)findViewById(R.id.Map1_image);
            M1_image.setImageDrawable(null);
            AbleToShowMap[0]=true;
        }
    }

    public void ShowMap2(View view){
        if (AbleToShowMap[1]) {
            ImageView M2_image = (ImageView) findViewById(R.id.Map2_image);
            M2_image.setImageDrawable(currentBattle.getOrigin().get(1).getMapimage());
            AbleToShowMap[1]=false;

        }
        else{
            ImageView M2_image=(ImageView)findViewById(R.id.Map2_image);
            M2_image.setImageDrawable(null);
            AbleToShowMap[1]=true;
        }
    }

    public void ShowMap3(View view){
        if (AbleToShowMap[2]) {
            ImageView M3_image = (ImageView) findViewById(R.id.Map3_image);
            M3_image.setImageDrawable(currentBattle.getOrigin().get(2).getMapimage());
            AbleToShowMap[2]=false;
        }
        else{
            ImageView M3_image=(ImageView)findViewById(R.id.Map3_image);
            M3_image.setImageDrawable(null);
            AbleToShowMap[2]=true;
        }
    }

    public void ShowMap4(View view){
        if (AbleToShowMap[3]) {
            ImageView M4_image = (ImageView) findViewById(R.id.Map4_image);
            M4_image.setImageDrawable(currentBattle.getOrigin().get(3).getMapimage());
            AbleToShowMap[3]=false;
        }
        else{
            ImageView M4_image=(ImageView)findViewById(R.id.Map4_image);
            M4_image.setImageDrawable(null);
            AbleToShowMap[3]=true;
        }
    }

    public void ShowMap5(View view){
        if (AbleToShowMap[4]) {
            ImageView M5_image = (ImageView) findViewById(R.id.Map5_image);
            M5_image.setImageDrawable(currentBattle.getOrigin().get(4).getMapimage());
            AbleToShowMap[4]=false;
        }
        else{
            ImageView M5_image=(ImageView)findViewById(R.id.Map5_image);
            M5_image.setImageDrawable(null);
            AbleToShowMap[4]=true;
        }
    }

    public void ShowMap6(View view){
        if (AbleToShowMap[5]) {
            ImageView M6_image = (ImageView) findViewById(R.id.Map6_image);
            M6_image.setImageDrawable(currentBattle.getOrigin().get(5).getMapimage());
            AbleToShowMap[5]=false;
        }
        else{
            ImageView M6_image=(ImageView)findViewById(R.id.Map6_image);
            M6_image.setImageDrawable(null);
            AbleToShowMap[5]=true;
        }
    }

    public void DisplayBattleMassage(Battle battle){

        TextView title=(TextView)findViewById(R.id.Btitle);
        title.setText(battle.getBattle_Title());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(battle.getDescription());

        TextView M1_Title = (TextView)findViewById(R.id.map_1title);
        M1_Title.setText(battle.getOrigin().get(0).getCode()+" "+battle.getOrigin().get(0).getName());


        TextView M1_drop = (TextView)findViewById(R.id.Map1_drop);
        M1_drop.setText(battle.getOrigin().get(0).getDrop());

        TextView M1_enemy = (TextView)findViewById(R.id.enemy1);
        M1_enemy.setText(battle.getOrigin().get(0).getEnemy());

        TextView M1_exp = (TextView)findViewById(R.id.exp1);
        M1_exp.setText(battle.getOrigin().get(0).getXP());

        TextView M1_level = (TextView)findViewById(R.id.level1);
        M1_level.setText(battle.getOrigin().get(0).getReduce());



        TextView M2_Title = (TextView)findViewById(R.id.map_2title);
        M2_Title.setText(battle.getOrigin().get(1).getCode()+" "+battle.getOrigin().get(1).getName());



        TextView M2_drop = (TextView)findViewById(R.id.Map2_drop);
        M2_drop.setText(battle.getOrigin().get(1).getDrop());

        TextView M2_enemy = (TextView)findViewById(R.id.enemy2);
        M2_enemy.setText(battle.getOrigin().get(1).getEnemy());

        TextView M2_exp = (TextView)findViewById(R.id.exp2);
        M2_exp.setText(battle.getOrigin().get(1).getXP());

        TextView M2_level = (TextView)findViewById(R.id.level2);
        M2_level.setText(battle.getOrigin().get(1).getReduce());



        TextView M3_Title = (TextView)findViewById(R.id.map_3title);
        M3_Title.setText(battle.getOrigin().get(2).getCode()+" "+battle.getOrigin().get(2).getName());



        TextView M3_drop = (TextView)findViewById(R.id.Map3_drop);
        M3_drop.setText(battle.getOrigin().get(2).getDrop());

        TextView M3_enemy = (TextView)findViewById(R.id.enemy3);
        M3_enemy.setText(battle.getOrigin().get(2).getEnemy());

        TextView M3_exp = (TextView)findViewById(R.id.exp3);
        M3_exp.setText(battle.getOrigin().get(2).getXP());

        TextView M3_level = (TextView)findViewById(R.id.level3);
        M3_level.setText(battle.getOrigin().get(2).getReduce());




        TextView M4_Title = (TextView)findViewById(R.id.map_4title);
        M4_Title.setText(battle.getOrigin().get(3).getCode()+" "+battle.getOrigin().get(3).getName());



        TextView M4_drop = (TextView)findViewById(R.id.Map4_drop);
        M4_drop.setText(battle.getOrigin().get(3).getDrop());

        TextView M4_enemy = (TextView)findViewById(R.id.enemy4);
        M4_enemy.setText(battle.getOrigin().get(3).getEnemy());

        TextView M4_exp = (TextView)findViewById(R.id.exp4);
        M4_exp.setText(battle.getOrigin().get(3).getXP());

        TextView M4_level = (TextView)findViewById(R.id.level4);
        M4_level.setText(battle.getOrigin().get(3).getReduce());




        TextView M5_Title = (TextView)findViewById(R.id.map_5title);
        M5_Title.setText(battle.getOrigin().get(4).getCode()+" "+battle.getOrigin().get(0).getName());



        TextView M5_drop = (TextView)findViewById(R.id.Map5_drop);
        M5_drop.setText(battle.getOrigin().get(4).getDrop());

        TextView M5_enemy = (TextView)findViewById(R.id.enemy5);
        M5_enemy.setText(battle.getOrigin().get(4).getEnemy());

        TextView M5_exp = (TextView)findViewById(R.id.exp5);
        M5_exp.setText(battle.getOrigin().get(4).getXP());

        TextView M5_level = (TextView)findViewById(R.id.level5);
        M5_level.setText(battle.getOrigin().get(4).getReduce());




        TextView M6_Title = (TextView)findViewById(R.id.map_6title);
        M6_Title.setText(battle.getOrigin().get(5).getCode()+" "+battle.getOrigin().get(0).getName());



        TextView M6_drop = (TextView)findViewById(R.id.Map6_drop);
        M6_drop.setText(battle.getOrigin().get(5).getDrop());

        TextView M6_enemy = (TextView)findViewById(R.id.enemy6);
        M6_enemy.setText(battle.getOrigin().get(5).getEnemy());

        TextView M6_exp = (TextView)findViewById(R.id.exp6);
        M6_exp.setText(battle.getOrigin().get(5).getXP());

        TextView M6_level = (TextView)findViewById(R.id.level6);
        M6_level.setText(battle.getOrigin().get(5).getReduce());
    }

    public void back(View view) {
        Intent i = new Intent(this, BattleMapRoom.class);
        startActivity(i);
        this.finish();
    }

    public ArrayList<Battle> onCreateBattles() {

        ArrayList<Battle> Battles = new ArrayList<>();

        ArrayList<Map> Battle1_MapList = new ArrayList();
        Map B1_M1 = new Map("演习训练", getResources().getDrawable(R.drawable.b1_m1), "1-1", "200", "120", "11", "纳甘左轮、M1911、P38");
        Map B1_M2 = new Map("转移伤患", getResources().getDrawable(R.drawable.b1_m2), "1-2", "350", "150", "15", "纳甘左轮、PPK、M1911、P38");
        Map B1_M3 = new Map("调查异常", getResources().getDrawable(R.drawable.b1_m3), "1-3", "450", "160", "18", "P08、Spectre M4、纳甘左轮、PPK、M1911、P38");
        Map B1_M4 = new Map("失踪人口", getResources().getDrawable(R.drawable.b1_m4), "1-4", "550", "180", "20", "P08、阿斯特拉左轮、Spectre M4、M3、MP40、纳甘左轮、PPK、M1911、FNP-9、P38");
        Map B1_M5 = new Map("救援信号", getResources().getDrawable(R.drawable.b1_m5), "1-5", "650", "190", "22", "M9、阿斯特拉左轮、Spectre M4、M3、MP40、MP446、纳甘左轮、FNP-9、M1911、P38");
        Map B1_M6 = new Map("除草行动", getResources().getDrawable(R.drawable.b1_m6), "1-6", "800", "200", "25", "格洛克17、M9、阿斯特拉左轮、P08、蝎式、司登Mk2、C96、MP40、纳甘左轮、IDW");

        Battle1_MapList.add(B1_M1);
        Battle1_MapList.add(B1_M2);
        Battle1_MapList.add(B1_M3);
        Battle1_MapList.add(B1_M4);
        Battle1_MapList.add(B1_M5);
        Battle1_MapList.add(B1_M6);

        ArrayList<Map> Battle1_EliteMapList = new ArrayList<>();
        ArrayList<Map> Battle1_NightMapList = new ArrayList<>();

        Battle Battle0 = new Battle();
        Battle Battle1 = new Battle(Battle1_MapList,Battle1_EliteMapList,Battle1_NightMapList,"第一战役：苏醒","        你一定很想知道，\n                你昏迷了多长时间");

        Battles.add(Battle0);
        Battles.add(Battle1);

        return Battles;

    }
}