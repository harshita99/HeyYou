package com.example.android.shreya_boss;

public class UseriInfo {
    String Userid;
    String Uname;
    String pass;
    String email;
    String mob1;
    String mob2;
    int maxspeed;
    int rewards=100;
    int distance=0;
    public UseriInfo(){

    }
    public UseriInfo(String Userid,String Uname,String pass,String email,String mob1,String mob2){
        this.Userid=Userid;
        this.Uname=Uname;
        this.pass=pass;
        this.email=email;
        this.mob1=mob1;
        this.mob2=mob2;
    }

    public String getUserid() {
        return Userid;
    }
    public void setMaxspeed(int m){
        maxspeed=m;
    }
    public int getMaxspeed(){
        return maxspeed;
    }
    public String getUname() {
        return Uname;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getMob1() {
        return mob1;
    }

    public String getMob2() {
        return mob2;
    }

    public int getRewards() {
        return rewards;
    }

    public int getDistance() {
        return distance;
    }
}

