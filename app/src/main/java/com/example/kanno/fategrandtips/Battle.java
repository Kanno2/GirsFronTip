package com.example.kanno.fategrandtips;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;


public class Battle {
    private ArrayList<Map> Origin;
    private ArrayList<Map> Elite;
    private ArrayList<Map> Night;
    private String Battle_Title;
    private String Description;

    public Battle(){
        Origin = new ArrayList<>();
        Elite = new ArrayList<>();
        Night =new ArrayList<>();
    }
    public Battle(ArrayList<Map> _Origin,ArrayList<Map> _Elite,ArrayList<Map> _Night,String title,String description){
        Description=description;
        Battle_Title=title;
        Origin=_Origin;
        Elite=_Elite;
        Night=_Night;
    }
    public String getBattle_Title(){
        return Battle_Title;
    }
    public String getDescription(){
        return Description;
    }
    public ArrayList<Map> getOrigin(){
        return Origin;
    }
    public ArrayList<Map> getElite(){
        return Elite;
    }
    public ArrayList<Map> getNight(){
        return Night;
    }
}


