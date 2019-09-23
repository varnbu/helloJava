package varn.main.javaObject;

public class JavaObject {
//     final 修饰的 被设置后不能进行修改
    private final String name = "小明";


    public static int nexId = 1;
    private int id;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nexId;
        nexId++;
    }


}
