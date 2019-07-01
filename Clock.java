public class Clock {
  private   int hour;       // 0-23 h
  private   int minute;     // 0-59 min
  private   int second;     // 0-59 sec

    public void setClock(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int h) {
        hour = (h >= 0 && h < 24) ? h : 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int m) {
        minute = (m >= 0 && m < 60) ? m : 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int s) {
        second = (s >= 0 && s < 60) ? s : 0;
    }
    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
