# 字符串

# String

String：本身其实是一个类

- ## 如何创建String对象
  
  String s1="imooc"; 创建一个字符串对象imooc，名为s1
  
  String s2=new Stirng(); 创建一个空字符串对象，名为s2
  
  String s3=new String("imooc"); 创建一个字符串对象imooc，名为s3
  
- ## String对象的常用方法

![屏幕截图 2025-03-27 155530](https://github.com/user-attachments/assets/f40849b8-8dd9-4d9c-ba01-daa0c8815702)


- ## ==和equals方法的区别
  
  在Object类型中，equals()相当于==，比较的是地址，是否为同一对象。
  String类对equals方法进行了重写，比较的是所指向的对象的内容是否相等。
  
- ## String的不可变性
  
  String从底层看是用final关键字修饰的一个数组，由于final关键字的特性，被修饰的不能被继承，不能被重写，也不能被修改，所以引用的字符串不能被改变，一经定义，无法再增删改。每次对String的操作都会生成新的String对象。
  

# StringBuilder

- String和StringBuilder的区别：
  
  1. String具有不可变性，而StringBuilder不具备，因此建议：但需要频繁操作字符串时，使用StringBuilder。
    
  2. StringBuilder和StringBuffer
    
    - 二者基本相似
      
    - StringBuffer线程安全，但是性能较低；而StringBuilder线程不安全，性能较高。
