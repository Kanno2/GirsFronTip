package com.example.kanno.fategrandtips;

import android.content.DialogInterface;
import android.support.v4.app.LoaderManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.AlertDialog;

import org.w3c.dom.Text;

public class ConstructionRoom extends AppCompatActivity {

    public int ManPower=0;
    public int Ammunition=0;
    public int Ration=0;
    public int Part=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_construction_room);

        View v1= findViewById(R.id.addResource);//找到你要设透明背景的layout 的id
        v1.getBackground().setAlpha(100);//0~255透明度值

        View v2= findViewById(R.id.BuildSort);//找到你要设透明背景的layout 的id
        v2.getBackground().setAlpha(100);//0~255透明度值
    }

    public void onClickShowFuc(View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("公式一览");
        ImageView table = null;
        table.setImageDrawable(getResources().getDrawable(R.drawable.drawing));
        dialog.setView(table);
        dialog.setPositiveButton("退出", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();

    }

    public void StartBuild(View view){
        String Result = "低保：手枪 冲锋枪 ";
        loadRation();
        loadPart();
        loadAmmunition();
        loadManPower();
        if(Ration>=90&&Ammunition>=90&&Part>=90&&ManPower>=90){
            Result="高星手枪 二星冲锋枪 二星突击步枪 ";
            if(Ration>=400&&Ammunition>=400){
                Result+="高星突击步枪 ";
            }
            if(ManPower>=400&&Ration>=400){
                Result+="步枪 ";
            }
            if(ManPower>=400&&Ammunition>=400){
                Result+="高星冲锋枪 ";
            }
            if (ManPower>=600&&Ammunition>=400&&Ration>=400){
                Result+="机枪";
            }
        }
        TextView v1 = (TextView)findViewById(R.id.BuildSort);
        v1.setText(Result);
    }
    public void loadManPower(){
        TextView v1= (TextView)findViewById(R.id.manPower0);
        TextView v2= (TextView)findViewById(R.id.manPower1);
        TextView v3= (TextView)findViewById(R.id.manPower2);
        this.ManPower=Integer.parseInt(v1.getText()+"")+Integer.parseInt(v2.getText()+"")*10+Integer.parseInt(v3.getText()+"")*100;
    }

    public void loadAmmunition(){
        TextView v1= (TextView)findViewById(R.id.Ammunition0);
        TextView v2= (TextView)findViewById(R.id.Ammunition1);
        TextView v3= (TextView)findViewById(R.id.Ammunition2);
        this.Ammunition=Integer.parseInt(v1.getText()+"")+Integer.parseInt(v2.getText()+"")*10+Integer.parseInt(v3.getText()+"")*100;
    }

    public void loadRation(){
        TextView v1= (TextView)findViewById(R.id.Ration0);
        TextView v2= (TextView)findViewById(R.id.Ration1);
        TextView v3= (TextView)findViewById(R.id.Ration2);
        this.Ration=Integer.parseInt(v1.getText()+"")+Integer.parseInt(v2.getText()+"")*10+Integer.parseInt(v3.getText()+"")*100;
    }

    public void loadPart(){
        TextView v1= (TextView)findViewById(R.id.Part0);
        TextView v2= (TextView)findViewById(R.id.Part1);
        TextView v3= (TextView)findViewById(R.id.Part2);
        this.Part=Integer.parseInt(v1.getText()+"")+Integer.parseInt(v2.getText()+"")*10+Integer.parseInt(v3.getText()+"")*100;
    }



    public void Manadd0(View view){
        TextView v1= (TextView)findViewById(R.id.manPower0);
        Add(v1);
    }

    public void Manadd1(View view){
        TextView v1= (TextView)findViewById(R.id.manPower1);
        Add(v1);
    }

    public void Manadd2(View view){
        TextView v1= (TextView)findViewById(R.id.manPower2);
        Add(v1);
    }

    public void Aadd0(View view){
        TextView v1= (TextView)findViewById(R.id.Ammunition0);
        Add(v1);
    }

    public void Aadd1(View view){
        TextView v1= (TextView)findViewById(R.id.Ammunition1);
        Add(v1);
    }

    public void Aadd2(View view){
        TextView v1= (TextView)findViewById(R.id.Ammunition2);
        Add(v1);
    }

    public void Radd0(View view){
        TextView v1= (TextView)findViewById(R.id.Ration0);
        Add(v1);
    }

    public void Radd1(View view){
        TextView v1= (TextView)findViewById(R.id.Ration1);
        Add(v1);
    }

    public void Radd2(View view){
        TextView v1= (TextView)findViewById(R.id.Ration2);
        Add(v1);
    }

    public void Padd0(View view){
        TextView v1= (TextView)findViewById(R.id.Part0);
        Add(v1);
    }

    public void Padd1(View view){
        TextView v1= (TextView)findViewById(R.id.Part1);
        Add(v1);
    }

    public void Padd2(View view){
        TextView v1= (TextView)findViewById(R.id.Part2);
        Add(v1);
    }

    public void Add(TextView view){
        int value = Integer.parseInt(view.getText()+"");
        if(value<9){
            value++;
            view.setText(value+"");
        }
        else{
            value=0;
            view.setText(value+"");
        }
    }

    public void Mandec0(View view){
        TextView v1=(TextView)findViewById(R.id.manPower0);
        Dec(v1);
    }

    public void Mandec1(View view){
        TextView v1=(TextView)findViewById(R.id.manPower1);
        Dec(v1);
    }

    public void Mandec2(View view){
        TextView v1=(TextView)findViewById(R.id.manPower2);
        Dec(v1);
    }

    public void Adec0(View view){
        TextView v1=(TextView)findViewById(R.id.Ammunition0);
        Dec(v1);
    }

    public void Adec1(View view){
        TextView v1=(TextView)findViewById(R.id.Ammunition1);
        Dec(v1);
    }

    public void Adec2(View view){
        TextView v1=(TextView)findViewById(R.id.Ammunition2);
        Dec(v1);
    }

    public void Rdec0(View view){
        TextView v1=(TextView)findViewById(R.id.Ration0);
        Dec(v1);
    }

    public void Rdec1(View view){
        TextView v1=(TextView)findViewById(R.id.Ration1);
        Dec(v1);
    }

    public void Rdec2(View view){
        TextView v1=(TextView)findViewById(R.id.Ration2);
        Dec(v1);
    }

    public void Pdec0(View view){
        TextView v1=(TextView)findViewById(R.id.Part0);
        Dec(v1);
    }

    public void Pdec1(View view){
        TextView v1=(TextView)findViewById(R.id.Part1);
        Dec(v1);
    }

    public void Pdec2(View view){
        TextView v1=(TextView)findViewById(R.id.Part2);
        Dec(v1);
    }

    public void Dec(TextView view){

        int value = Integer.parseInt(view.getText()+"");
        if(value>0){
            value--;
            view.setText(value+"");
            loadManPower();
            loadAmmunition();
            loadPart();
            loadRation();
            if(this.ManPower<30||this.Ammunition<30||this.Part<30||this.Ration<30){
                value++;
            }
            view.setText(value+"");
        }
        else{
            value=9;
            view.setText(value+"");
        }
    }

    public void back(View view){
        Intent i = new Intent(this,RoomList.class);
        startActivity(i);
        this.finish();
    }
}
