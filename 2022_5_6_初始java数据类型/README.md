## 知识点
1.在一个java文件中只能有一个public class 且 类名需要和文件名相同
2.编程规范建议，左括号紧跟当前行
3.类名一定要大驼峰
4.文本文件(.java)--->编译(javac 文件名.java)--->字节码文件/二进制文件(.class)--->运行(java xxx.class)
5.一个**类**对应一个字节码文件
6.行注释、块注释、文档注释
7.Integer
8.int 类型在java中是4字节
9.如果一个**局部变量**没有进行初始化，那么就不能使用它
10.标识符：字母、数字、下划线、$
## 面试问题：
1.main方法为什么是static的？

2.JDK vs JRE vs JVM
- JDK:java开发工具
- JRE:java运行环境
- JVM:java虚拟机

3.双亲委派模型、类加载器


## 注意
java文件中有中文字符，如果是utf-8编码，就会出现字节码格式不匹配，因为javac默认是GBK编码，需要这样做：
```bash
javac xxx.java -encoding utf-8
```