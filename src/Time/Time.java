package Time;

public class Time {
  int hour;
  int minute;
  int second;
  public Time(){
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
  }
  public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public void setTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }


  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour >=0 && hour <= 23){
      this.hour = hour;
    }else {
      this.hour = 0;
    }

  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute >= 0 && minute <= 59){
      this.minute = minute;
    }else {
      this.minute = 0;
    }
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) {
    if (second >=0 && second <= 59){
      this.second = second;
    }else {
      this.second = 0;
    }

  }
  public void nextSecond(){
    this.setSecond(this.second + 1);
    if (this.second ==0){
      this.setMinute(this.minute + 1);
      if (this.minute ==0){
        this.setHour(this.hour + 1);
      }
    }
  }
  public void previousSecond(){
    if (this.second ==0){
      this.second = 60;
      this.setMinute(this.minute - 1);
      if (this.minute ==0){
        this.minute = 59;
        this.setHour(this.hour - 1);
      }
      if (this.hour == 0 && this.minute == 59 && second == 60){
        this.hour = 23;
      }
    }
    this.setSecond(this.second - 1);
  }

  @Override
  public String toString() {
    return "Time{" +
      "hour=" + hour +
      ", minute=" + minute +
      ", second=" + second +
      '}';
  }
  public void display(){
    String hour = this.hour + "";
    String minute = this.minute + "";
    String second = this.second + "";
    if (hour.length() == 1){
        hour = "0" + hour;
    }
    if (minute.length() == 1){
        minute = "0" + minute;
    }
    if (second.length() == 1){
        second = "0" + second;
    }
    System.out.println(hour + ":" + minute + ":" + second);
  }
}
