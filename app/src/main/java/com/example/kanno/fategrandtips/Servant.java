package com.example.kanno.fategrandtips;

import android.graphics.drawable.Drawable;

public class Servant {
    private Drawable image;
    private String name;
    private int Bingo;
    private int evade;
    private int ATK;
    private int HP;
    private String painter;
    private String CV;
    private String element;
    private String HowToGet;
    private String star;
    private int speed;
    private String skill;
    private String effect;

    public Servant(){

    }
    public Servant(String _name, String _star,int _ATK, int _HP, int _bingo, int _evade ,int _speed,String _painter, String _CV, String _element, String _HowToGet,String _skill,String _effect){
        name=_name;
        ATK=_ATK;
        Bingo=_bingo;
        evade=_evade;
        HP=_HP;
        painter=_painter;
        CV=_CV;
        element=_element;
        HowToGet=_HowToGet;
        star=_star;
        speed=_speed;
        skill=_skill;
        effect=_effect;

    }

    public int getSpeed() {
        return speed;
    }

    public int getBingo(){
        return Bingo;
    }

    public int getEvade() {
        return evade;
    }
    public String getStar(){
        return star;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable _image){
        image = _image;
    }

    public String getName(){
        return name;
    }
    public int getATK(){
        return ATK;
    }
    public int getHP(){
        return HP;
    }
    public String getPainter(){
        return painter;
    }
    public String getCV(){
        return CV;
    }
    public String getElement(){
        return element;
    }
    public String getHowToGet(){
        return HowToGet;
    }
    public String getSkill(){
        return skill;
    }

    public String getEffect(){
        return effect;
    }
}
