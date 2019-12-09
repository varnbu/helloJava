package varn.main.javaArray;

public enum WeekDay {
    SUN(0, "星期天"), MON(1, "星期一"), TUE(2, "星期二"),
    WED(3, "星期三"), THU(4, "星期四"), FRI(5, "星期五"),
    SAT(6, "星期六");
    public final int value;
    public final String names;

    private WeekDay(int value, String names) {
        this.value = value;
        this.names = names;
    }
}
