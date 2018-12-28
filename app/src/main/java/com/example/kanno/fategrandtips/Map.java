package com.example.kanno.fategrandtips;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class Map {

    private String name;
    private Drawable mapimage;
    private String code;
    private String enemy;
    private String XP;
    private String reduce;
    private String drop;

    public Map(){
    }
    public Map(String _name,Drawable _mapimage,String _code,String _enemy,String _XP,String _reduce,String _drop){
        name=_name;
        mapimage=_mapimage;
        code=_code;
        enemy=_enemy;
        XP=_XP;
        reduce=_reduce;
        drop=_drop;

    }

    public String getName(){
        return name;
    }
    public Drawable getMapimage(){
        return mapimage;
    }
    public String getCode(){
        return code;
    }
    public String getEnemy(){
        return enemy;
    }
    public String getXP(){
        return XP;
    }
    public String getReduce(){
        return reduce;
    }
    public String getDrop(){
        return drop;
    }
}
