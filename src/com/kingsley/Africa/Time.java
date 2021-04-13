package com.kingsley.Africa;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public void setTime(int hour,int minute,int second)  {
        boolean hourIsValid=hour >0 && hour<=24;
        if(!hourIsValid)throw new IllegalArgumentException("Hour is invalid");
        if(hourIsValid)this.hour=hour;
        boolean minuteIsValid=minute>0 && minute<=60;
        if (!minuteIsValid)throw new IllegalArgumentException("Minute is Invalid");
        if(minuteIsValid)this.minute=minute;
        boolean secondIsValid=second>0&& second<=60;
        if(!secondIsValid)throw new IllegalArgumentException("Second is Invalid");
        if(secondIsValid)this.second=second;
    }

    public int getHour(){
return hour;
        }
   public int getMinute(){
        return minute;
   }
   public int getSecond(){
        return second;
   }
    }
