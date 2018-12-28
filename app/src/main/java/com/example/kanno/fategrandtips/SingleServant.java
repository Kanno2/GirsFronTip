package com.example.kanno.fategrandtips;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SingleServant extends AppCompatActivity {
    static int Servant_id=1;
    static int pagenumber =0; //默认显示第一张图片

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        pagenumber =0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_servant);

        Intent i =getIntent();
        Servant_id=i.getIntExtra("Servant",2);
        Servant currentServant=new ServantMessage().getServantMessage(Servant_id);
        ShowMessage(Servant_id,currentServant);

        View title = findViewById(R.id.SSTitle);
        title.getBackground().setAlpha(100);

        View v1 = findViewById(R.id.SCView);
        v1.getBackground().setAlpha(100);

        View v2 = findViewById(R.id.NameView);
        v2.getBackground().setAlpha(150);

        View v3 = findViewById(R.id.HPView);
        v3.getBackground().setAlpha(150);

        View v4 = findViewById(R.id.AttackView);
        v4.getBackground().setAlpha(150);

        View v5 = findViewById(R.id.EvadeView);
        v5.getBackground().setAlpha(150);

        View v6 = findViewById(R.id.BingoView);
        v6.getBackground().setAlpha(150);

        View v7 = findViewById(R.id.SpeedView);
        v7.getBackground().setAlpha(150);

        View v8 = findViewById(R.id.mmmmm);
        v8.getBackground().setAlpha(150);

        View v9 = findViewById(R.id.effectView);
        v9.getBackground().setAlpha(150);

        View v10 = findViewById(R.id.StarView);
        v10.getBackground().setAlpha(150);

        View v11 = findViewById(R.id.CVView);
        v11.getBackground().setAlpha(150);

        View v12 = findViewById(R.id.PaintView);
        v12.getBackground().setAlpha(150);

    }

    public void nextPage(View view){
        if (pagenumber!=1){//如果不是最后一张图
            ArrayList<ArrayList<Drawable>> ImageList=onCreateImageResource();
            ImageView iv =(ImageView)findViewById(R.id.Photo_Show);
            pagenumber++;
            iv.setImageDrawable(ImageList.get(Servant_id-1).get(pagenumber));
        }
    }
    public void previousPage(View view){
        if(pagenumber>0){
            ArrayList<ArrayList<Drawable>> ImageList=onCreateImageResource();
            ImageView iv =(ImageView)findViewById(R.id.Photo_Show);
            pagenumber--;
            iv.setImageDrawable(ImageList.get(Servant_id-1).get(pagenumber));
        }
    }
    public void back(View view){
        Intent i =new Intent(this,ServantRoom.class);
        startActivity(i);
        this.finish();
    }

    private ArrayList<ArrayList<Drawable>> onCreateImageResource(){
        ArrayList<ArrayList<Drawable>> ImageList = new ArrayList<ArrayList<Drawable>>();
        ArrayList<Drawable> S_1ImageList = new ArrayList<Drawable>();

        S_1ImageList.add(getResources().getDrawable(R.drawable.simage_1));
        S_1ImageList.add(getResources().getDrawable(R.drawable.simage_2));

        ImageList.add(S_1ImageList);

        ArrayList<Drawable> S_2ImageList = new ArrayList<Drawable>();

        ImageList.add(S_2ImageList);

        S_2ImageList.add(getResources().getDrawable(R.drawable.simage_3));
        S_2ImageList.add(getResources().getDrawable(R.drawable.simage_4));

        return ImageList;
    }

    public void ShowMessage(int servantID,Servant s){
        ArrayList<ArrayList<Drawable>> ImageList=onCreateImageResource();
        ImageView iv = (ImageView)findViewById(R.id.Photo_Show);
        iv.setImageDrawable(ImageList.get(servantID-1).get(pagenumber));
        TextView tv1=(TextView)findViewById(R.id.servant_name);
        tv1.setText(s.getName());
        TextView tv2=(TextView)findViewById(R.id.servant_atk);
        tv2.setText(s.getATK()+"");
        TextView tv3=(TextView)findViewById(R.id.servant_hp);
        tv3.setText(s.getHP()+"");
        TextView tv4=(TextView)findViewById(R.id.servant_painter);
        tv4.setText(s.getPainter());
        TextView tv5=(TextView)findViewById(R.id.servant_cv);
        tv5.setText(s.getCV());
        TextView tv6=(TextView)findViewById(R.id.servant_element);
        tv6.setText(s.getElement());
        TextView tv7=(TextView)findViewById(R.id.servant_htg);
        tv7.setText(s.getHowToGet());
        TextView tv8=(TextView)findViewById(R.id.servant_speed);
        tv8.setText(s.getSpeed()+"");
        TextView tv9=(TextView)findViewById(R.id.servant_evade);
        tv9.setText(s.getEvade()+"");
        TextView tv10=(TextView)findViewById(R.id.servant_bingo);
        tv10.setText(s.getBingo()+"");
        TextView tv11=(TextView)findViewById(R.id.servant_star);
        tv11.setText(s.getStar());
        TextView tv12=(TextView)findViewById(R.id.servant_skill);
        tv12.setText(s.getSkill());
        TextView tv13=(TextView)findViewById(R.id.effect);
        tv13.setText(s.getEffect());


    }
}
