# Java 中的数据类型
  java 一共有 8 种基本的数据类型
   4 种整型 ；
   2 种浮点型 ；
   1 种用于表示 Unicode 编码的字符单元 的字符类型 char；
   boolean 类型；
 
## 整型
- int 4 字节 
- short 2 字节
- long 8 字节
- byte 1 字节

## 浮点型
- float 4字节 有效数字 6-7 位
- double 8字节 有效数字 15 位

## char 类型

## boolean 类型
整型值与 boolean 不能相互转换

## 强制类型转换 
```java
 class A{
    double x = 9.92;
    int nx = (int) x;
// 依然需要强制类型转换，Math.round() 返回结果为 long 类型的， 
// 存在信息丢失的可能性，所以只有显示的强制类型转换才能将 long 类型 转换为 int 类型
// 类型转换是注意不要超出该类型的表示范围
    int nx2 = (int) Math.round(x); 
}
```



