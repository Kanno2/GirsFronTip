package com.example.kanno.fategrandtips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.*;

public class Counter extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener{

    private Map currentMap;
    private Spinner mGunSpinner = null;
    private ArrayList<Map> data_list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_counter);

            View v1 = findViewById(R.id.counter_table);
            v1.getBackground().setAlpha(100);

        View v2 = findViewById(R.id.Counter_Title);
        v2.getBackground().setAlpha(100);

            mGunSpinner = (Spinner) findViewById(R.id.spinner);

            data_list = new ArrayList<>();
            Map B1_M1 = new Map("演习训练", getResources().getDrawable(R.drawable.b1_m1), "1-1", "200", "120", "11", "纳甘左轮、M1911、P38");
            Map B1_M2 = new Map("转移伤患", getResources().getDrawable(R.drawable.b1_m2), "1-2", "350", "150", "15", "纳甘左轮、PPK、M1911、P38");
            Map B1_M3 = new Map("调查异常", getResources().getDrawable(R.drawable.b1_m3), "1-3", "450", "160", "18", "P08、Spectre M4、纳甘左轮、PPK、M1911、P38");
            Map B1_M4 = new Map("失踪人口", getResources().getDrawable(R.drawable.b1_m4), "1-4", "550", "180", "20", "P08、阿斯特拉左轮、Spectre M4、M3、MP40、纳甘左轮、PPK、M1911、FNP-9、P38");
            Map B1_M5 = new Map("救援信号", getResources().getDrawable(R.drawable.b1_m5), "1-5", "650", "190", "22", "M9、阿斯特拉左轮、Spectre M4、M3、MP40、MP446、纳甘左轮、FNP-9、M1911、P38");
            Map B1_M6 = new Map("除草行动", getResources().getDrawable(R.drawable.b1_m6), "1-6", "800", "200", "25", "格洛克17、M9、阿斯特拉左轮、P08、蝎式、司登Mk2、C96、MP40、纳甘左轮、IDW");
            data_list.add(B1_M1);
            data_list.add(B1_M2);
            data_list.add(B1_M3);
            data_list.add(B1_M4);
            data_list.add(B1_M5);
            data_list.add(B1_M6);
            ArrayList<String> arr = new ArrayList<>();
            for (int i=0;i<data_list.size();i++){
                arr.add(data_list.get(i).getCode());
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);

            mGunSpinner.setAdapter(adapter);

            mGunSpinner.setOnItemSelectedListener(this);

    }
    @Override
    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String name=parent.getItemAtPosition(position).toString();
        for (int i=0;i<data_list.size();i++){
            if(data_list.get(i).getCode().equals(name))
                currentMap=data_list.get(i);
        }
        TextView v1=(TextView)findViewById(R.id.expView);
        v1.setText(currentMap.getXP()+"xp");
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView){

    }

    public void back(View view){
        Intent i = new Intent(this,RoomList.class);
        startActivity(i);
        this.finish();
    }

    public int[] uplevelexp={100,200,300,400,500,600,700,800,900,1000,1100,1200,1300,1400,1500,1600,1700,1800,1900,2000,
    2100,2200,2300,2400,2500,2600,2800,3100,3400,4200,4600,5000,5400,5800,6200,6700,7200,7700,8200,8800,9300,9900,10500,
    11100,11800,12500,13100,13900,14600,15400,16100,16900,17700,18600,19500,20400,21300,22300,23300,24300,25300,26300,
    27400,28500,29600,30800,32000,33200,34400,45100,46800,50400,52200,54000,55900,57900,59800,61800,63900,66000,68100,
    70300,72600,74800,77100,79500,81900,84300,112600,116100,119500,123100,126700,130400,134100,137900,141800,145700};

    public int caculateEXP(int low,int high) {
        int sum = 0;
        for (int i = low - 1; i < high-1; i++) {
            sum += uplevelexp[i];
        }
        return sum;
    }

    public void begin(View view){
        EditText et1 = (EditText)findViewById(R.id.first);
        EditText et2 = (EditText)findViewById(R.id.end);
        int low=Integer.parseInt(et1.getText().toString());
        int high=Integer.parseInt(et2.getText().toString());
        int times=0;
        int xp=Integer.parseInt(currentMap.getXP());
        if ((high-low)%xp!=0){
            times=caculateEXP(low,high)/xp+1;
        }
        else
            times=caculateEXP(low,high)/xp;
        TextView tv = findViewById(R.id.leftBattle);
        tv.setText(times+"");
    }
}
