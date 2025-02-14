public class Time {
    private int hour;
    private int minute;
    private int second;

    // Constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter cho hour
    public int getHour() {
        return hour;
    }

    // Setter cho hour
    public void setHour(int hour) {
        this.hour = hour;
    }

    // Getter cho minute
    public int getMinute() {
        return minute;
    }

    // Setter cho minute
    public void setMinute(int minute) {
        this.minute = minute;
    }

    // Getter cho second
    public int getSecond() {
        return second;
    }

    // Setter cho second
    public void setSecond(int second) {
        this.second = second;
    }

    // Phương thức setTime
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Phương thức nextSecond
    public Time nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
        return this;
    }

    // Phương thức previousSecond
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
