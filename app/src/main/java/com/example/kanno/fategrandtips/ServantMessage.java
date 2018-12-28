package com.example.kanno.fategrandtips;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import java.util.*;
public class ServantMessage {
    private ArrayList<Servant> Servant_List =new ArrayList<Servant>();
    public ServantMessage(){
        Servant_List.add(new Servant("柯尔特左轮","4星",36,400,49,76,47,"Saru","田中爱美","手枪","普通建造、掉落","火力号令:提升我方全体伤害22%,持续8s","影响格内所有抢种命中+25%,伤害+15%"));
        Servant_List.add(new Servant("M1911","2星",27,365,50,74,57,"spirtie","松井惠理子","手枪","普通建造、掉落","烟雾弹:投掷烟雾弹对半径2.5范围内的敌人,降低其36%的攻击速度和45%的移动速度，持续4s","影响格内所有枪种命中+25%,射速+10%"));
    }
    public Servant getServantMessage(int n){
        return Servant_List.get(n-1);
    }
    public ArrayList<Servant> getList(){
        return Servant_List;
    }
}
