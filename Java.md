# Java 学习

## Java重要特点

1. Java语言是面向对象的(oop)
2. Java语言是健壮的。Java的强类型机制、异常处理、垃圾的自动收集等是Java程序健壮性的重要保证
3. Java语言是跨平台性的  [即:一个编译好的`.class`文件可以在多个系统下运行,这种特性称为跨平台]
4. Java语言是解释型的

解释性语言: JavaScript,PHP,Java
编译性语言: C / C++
区别是: 解释性语言,编译后的代码,不能直接被机器执行,需要解释器来执行。编译性语言,编译后的代码,可以直接被机器执行。

## Java运行机制及运行过程

+ Java核心机制-Java虚拟机 [JVM Java virtual Machine]

### 基本介绍

1. JVM是一个 虚拟的计算机,具有指令集并使用不同的存储区域。负责执行指令、管理数据、内存、寄存器包含在JDK中。
2. 对于不同的平台,有不同的虚拟机。
3. Java虚拟机机制屏蔽了底层运行平台的差别,实现了"一次编译,到处运行"

## 什么是JDK, JRE

### JDK 基本介绍

1. JDK的全称(Java Development Kit Java开发包)
   JDK = JRE + Java的开发工具[Java,Javac,Javadoc,Javap等]
2. JDK是提供给Java开发人员使用的,其中包含了Java的开发工具,也包含了JRE
   所以安装了JDK,就不用在单独安装JRE了。

### JRE 基本介绍

1. JRE(Java Runtime Environment Java运行环境)
   JRE = JVM + Java的核心类库
2. 包括Java虚拟机(JVM Java Virtual Machine)和Java程序所需的核心类库等,如果想要运行一个开发好的Java程序,计算机中只需安装JRE即可。

### JDK、JRE和JVM的包含关系

1. JDK = JRE + 开发工具集(例如Javac,Java编译工具等)
2. JRE = JVM + Java SE标准类库(Java核心类库)
3. JDK = JVM + Java SE标准类库 + 开发工具集
4. 如果只想运行开发好的`.class`文件 只需要JRE

# Java快速入门

+ 需求说明
  要求开发一个`hello.java`程序,可以输出`"hello,world"`
+ 开发步骤
  1. 将Java代码编写到扩展名为`hello.java`的文件中
  2. 通过`javac`命令对该Java文件进行编译,生成`.class`文件
  3. 通过`java`命令对生成的`class`文件进行运行

## 什么是编译

`javac Hello.java`

1. 有了Java源文件,通过编译器将其编译成JVM可以识别的字节码文件
2. 在该源文件目录下,通过`javac`编译工具对`Hello.java`文件进行编译
3. 如果程序没有错误,没有任何提示,但在当前目录下会出现一个`Hello.class`文件,该文件成为字节码文件,也是可以执行的java的程序

## 什么是运行

1. 有了可执行的Java程序(Hello.class字节码文件)
2. 通过运行工具`java.exe`对字节码文件进行执行,本质就是`.class`装在到JVM中执行

## Java程序开发注意事项和细节说明

对修改后的`Hello.java`源文件需要重新编译,生成新的class文件后,再进行执行,才能生效

1. Java源文件以`.java`为扩展名。源文件的基本组成部分是类(class),如本类中`Hello`类。
2. Java应用程序的执行入口是`main()`方法。它有固定的书写格式:
   `public static void main(String[] args) {...}`
3. Java语言严格区分大小写。
4. Java方法由一条条语句构成,每个语句以`;`结束。
5. 大括号都是成对出现的,缺一不可。[习惯,先写`{}`再写代码]
6. 一个源文件中最多只能有一个`public`类。其他类的个数不限
7. 如果源文件包含一个`public`类,则文件名必须按该类名命名!
8. 一个源文件最多只能有一个`public`类。其他类的个数不限,也可以将`main`方法写在非`public`类中,然后指定运行非`public`类,这样入口方法就是非`public`的`main`方法。

## Java转义字符

+ Java常用的转义字符
  1. `\t` 一个制表位,实现对齐的功能
  2. `\n` 换行符
  3. `\\` 一个`\`
  4. `\"` 一个`"`
  5. `\'` 一个`'`
  6. `\r` 一个回车 `System.out.println("韩顺平教育\r北京");`

## 初学Java易犯错误

1. 找不到文件
   解决方法:源文件名不存在或者写错,或者当前路径错误

2. 主类名和文件名不一致

   解决方法:声明为`public`的主类应与文件名一致,否则编译失败

3. 缺少分号
   解决方法:编译失败,注意错误出现的行数,再到源代码中指定位置改错

4. 常见错误总结
   学习编程最容易犯的错误是语法错误。Java要求你必须按照语法规则编写代码。如果你的程序违反了语法规则,例如:忘记了分号、大括号、引号,或者拼错了单词,Java编译器都会报语法错误。尝试着去看懂编译器会报告的错误信息。

## 注释(comment)

+ 介绍:
  用于注解说明解释程序的文字就是注释,注释提高了代码的阅读性(可读性);注释是一个程序员必须要具有的良好的编程习惯。将自己的思想通过注释先整理出来,再用代码去体现。

+ Java中的注释类型

  1. 单行注释
  2. 多行注释
  3. 文档注释

+ 单行注释
  格式: `//注释文字`

+ 多行注释
  格式: `/* 注释文字*/`

+ 使用细节

  1. 被注释的文字,不会被JVM解释执行
  2. 多行注释里面不允许有多行注释嵌套

+ 文档注释
  注释内容可以被JDK提供的工具`javadoc`所解析,生成一套以网页文件形式体现的该程序的说明文档,一般写在类
  `javadoc -d 文件夹名 -xx -yy Demo3.java`

## Java代码规范

1. 类、方法的注释,要以`javadoc`的方式来写
2. 非`javadoc`的注释,往往是给代码的维护者看的,着重告诉读者为什么这样写,如何修改,注意什么问题等
3. 使用`tab`操作,实现缩进,默认整体向右边移动,使用`shift+tab`整体向左移
4. 运算符和`=`两边习惯性各加一个空格。比如`2 + 4 * 5 + 345 - 89`
5. 源文件使用`utf-8`编码
6. 行宽度不要超过80字符
7. 代码编写使用行尾风格

## DOS命令

+ DOS介绍
  DOS: Disk Operating System 磁盘操作系统,简单说一下Windows的目录机构。

+ 相关的知识补充:相对路径,绝对路径
  相对路径:从当前目录开始定位,形成的一个路径
  绝对路径:从顶级目录(盘符),开始定位,形式的路径 

+ 常用的DOS命令
  1. 查看当前目录是有什么
     `dir d:\temp`
  2. 切换到其他盘下: `盘符号 cd`
     演示: 切换到C盘 `cd /D c:`
  3. 切换当前盘的其他目录下
     绝对路径: `cd d:\abc2\test200`
     相对路径: `cd ..\..\abc2\test200`
  4. 切换到上一级:`cd ..`
  5. 切换到根目录: `cd \`
  6. 查看指定目录下所有的子级目录 `tree`
  7. 清屏 `cls`
  8. 退出DOS `exit``
  9. ``md`[创建目录]     `rd`[删除目录]    `copy`[拷贝文件]    `del`[删除文件]    `echo`[输入内容到文件]    `type`    `move`[剪切]

# 变量

+ 概念
  变量相当于内存中一个数据存储空间的便是,你可以把变量看作是一个房间的门牌号,通过门牌号我们可以找到房间,而通过变量名可以访问到变量(值)。

+ 变量使用的基本步骤

  1. 声明变量
     `int a;`
  2. 赋值
     `a = 60;`
  3. 使用
     `System.out.println(a);`

  也可以一步到位`int a = 60;`

## 变量使用注意事项

1. 变量表示内存中的一个存储区域[不同的变量,类型不同,占用的空间大小不同。比如: `int`占4个字节, `double`占8个字节]
2. 该区域有自己的名称[变量名]和类型[数据类型]
3. 变量必须先声明,后使用,即有顺序
4. 该区域的数据可以在同一类型范围内不断变化
5. 变量在同一个作用域内不能重名
6. 变量=变量名+值+数据类型

  ## 程序中 + 号的使用

1. 当左右两边都是数值型时,则做加法运算
2. 当左右两边有一方为字符串,则做拼接运算

`System.out.println(100 + 98);` 输出: 198
`System.out.println("100" + 98);` 输出: 10098
`System.out.println(100 + 3 + "hello");` 输出: 103hello
`System.out.println("hello" + 100 + 3);` 输出: hello1003

# 数据类型

## 整数类型

+ 基本介绍
  Java的整数类型就是用于存放整数值的,比如 12,30,3456等等

+ 整数的类型
  | 类型          | 占用存储空间 | 范围                   |
  | :------------ | :----------- | :--------------------- |
  | byte[字节]    | 1字节        | -123~127               |
  | short[短整型] | 2字节        | -32768-32767           |
  | int[整型]     | 4字节        | -2147483648~2147483647 |
  | long[长整型]  | 8字节        | -2^63^~2^63^-1         |

+ 整型的使用细节

  1. Java各整数类型有固定的范围和字段长度,不受具体操作系统的影响,以保证Java程序的可以移植性。
  2. Java的整型常量默认为int型,声明long型常量须后加`l`或`L`
  3. Java程序中变量常声明为int型,除非不足以表示大数,才使用long
  4. `bit`:计算机中最小存储单位。`byte`:计算机中基本存储单元,`1byte = 8 bit `

## 浮点类型

+ 基本介绍
  Java的浮点类型可以表示一个小数,比如 123.4, 7.8, 0.12等等

+ 浮点型的分类
  | 类型        | 占用存储空间 | 范围                   |
  | ----------- | ------------ | ---------------------- |
  | 单精度float | 4字节        | -3.403E38 ~ 3.403E38   |
  | 双精度      | 8字节        | -1.798E308 ~ 1.798E308 |

+ 说明

  1. 关于浮点数在机器中存放形式的简单说明,浮点数 = 符号位 + 指数位 + 尾数位
  2. 尾数部分可能丢失,造成精度损失(小数都是近似值)。

+ 浮点型使用细节

  1. 与整数类型类似,Java浮点类型也有固定的范围和字段长度,不受具体操作系统的影响。[float 4个字节] [double 8个字节]
  2. Java的浮点型常量默认为double型,声明float型常量,须后加`f`或`F`
  3. 浮点型常量有两种形式
     十进制数形式: 如: 5.12    512.0f    .512    (必须有小数点,小数点前的整数位的0可以省略)
     科学计数法形式: 如: `5.12e2`  相当于5.12x10^2^     `5.12E-2`  相当于5.12x10^-2^
  4. 通常情况下,应该使用double型,因为它比float型更精确。
     `double num9 = 2.1234567851  //输出2.1234567851`
     `float num10 = 2.1234567851F  //输出2.1234567`
  5. 浮点数使用陷阱: `2.7` 和 `8.1 / 3`比较
  
  ```java
      //浮点数使用陷阱: 2.7 和 8.1 / 3 比较
      //看看一段代码
      double num11 = 2.7;
      double num12 = 8.1 / 3;
      System.out.println(num11); // 2.7
      System.out.println(num12); //2.6999999999999997 接近2.7的一个小数,而不是2.7
      //得到一个重要的使用点: 当我们对运算结果是小数的进行相等判断时,要小心
      //应该是以两个数的差值的绝对值,在某个精度范围类判断
      if (num11 == num12) {
          System.out.println("相等");
      }
      // 正确的写法
      if (Math.abs(num11 - num12) < 0.000001) {
          System.out.println("差值非常小,到了规定的精度认为相等...");
      }
      //可以通过Java API来看
          System.out.println(Math.abs(num11 - num12));
  
      //细节:如果是直接查询得到的小数或者直接赋值,是可以判断相等
  ```

## Java API文档

1. API(Application Programming Interface,应用程序编程接口)是Java提供的基本编程接口
2. Java语言提供了大量的基础类,因此 Oracle公司也为这些基础类提供了相应的API文档,用于告诉开发者如何使用这些类,以及这些类里包含的方法。
3. Java类的组织形式

## 字符类型(char)

+ 基本介绍
  字符类型可以表示单个字符,字符类型是`char`,char是两个字节(可以存放汉字),多个字符我们用字符串`String`
+ 字符类型使用细节
  1. 字符常量是用单引号`''`括起来的单个字符。例如`char c1 = 'a';  char c2 = '中';    char c3 = '9';`
  2. Java中还允许使用转义字符`'\'`来将其后的字符转变为特殊字符型常量。例如:`char c3 = '\n';  //'\n'表示换行符`
  3. 在Java中,`char`类型的本质是一个整数,在输出时,是`unicode`码对应的字符。
  4. 可以直接给`char`类型赋一个整数,然后输出时,会按照对应的`unicode`字符输出
  5. `char`类型是可以进行运算的,相当于一个整数,因为它都对应有`unicode`码。
+ 字符类型本质探讨
  1. 字符型存储到计算机中,需要将字符对应的码值(整数)找出来,比如`'a'`
     存储: `'a'`==> 码值 97 ==> 二进制 ==>存储
     读取: 二进制 ==> 97 ==> `'a'` ==> 显示
  2. 字符和码值的对应关系是通过字符编码表决定的(是规定好的)
+ 介绍一下字符编码表
  ASCII(ASCII编码表 一个字节表示,一共128个字符,实际上一个字节可以表示256个字符,只用了128个)
  Unicode(Unicode编码表 固定大小的编码 使用两个字节来表示字符,字母和汉字统一都是占用两个字节,这样浪费空间)
  utf-8(编码表,大小可变的编码 字母使用1个字节,汉字使用3个字节)
  gbk(可以表示汉字,而且范围广,字母使用1个字节,汉字2个字节)
  gb2312(可以表示汉字,gb2312<gbk)
  big5码(繁体中文,台湾,香港)

## 布尔类型: boolean

+ 基本介绍
  1. 布尔类型也叫`boolean`类型,`boolean`类型数据只允许取值`true`和`false`,无`null`
  2. `boolean`类型占1个字节
  3. `boolean`类型适用于逻辑运算,一般用于程序流程控制:`if`条件控制语句; `while`循环控制语句; `do-while`循环控制语句;`for`循环控制语句;
+ 使用细节说明
  不可以0或非0的整数替代`false`和`true`,这点和C语言不同



## 基本数据类型转换

### 自动类型转换

+ 介绍
  当Java程序在进行赋值或者运算时,精度小的类型自动转换为精度大的数据类型,这个就是自动类型转换。
+ 数据类型按精度(容量)大小排序为
  char < int <long < float < double
  byte < short < int < long < float < double
+ 自动类型转换注意和细节
  1. 有多种类型的数据混合运算时,系统首先自动将所有数据转换成容量最大的那种数据类型,然后再进行计算。
  2. 当我们把精度(容量)大的数据类型赋值给精度(容量)小的数据类型时,就会报错,反之就会进行自动类型转换。
  3. (`byte`,`short`)和`char`之间不会相互自动转换。
  4. `byte`,`short`,`char`它们三者可以计算,在计算时首先转换为int类型。
  5. `boolean`不参与运算
  6. 自动提升原则: 表达式结果的类型自动提升为操作数中最大的类型

### 强制类型转换

+ 介绍
  自动类型转换的逆过程,将容量的大的数据类型转换为容量小的数据类型。使用时要加上强制转换符`()`,但可能造成精度降低或溢出,格外要注意。

```Java
	int i = (int)1.9;
	System.out.println(i);
	int j = 100;
	byte b1 = (byte)j;
	System.out.println(b1);
```

+ 强制类型转换细节说明

  1. 当进行数据的大小从 大 --> 小, 就需要使用到强制转换

  2. 强制符号只针对于最近的操作数有效,往往会使用小括号提升优先级
     ```Java
     	//int x = (int)10 * 3.5 + 6 * 1.5;
     	int y = (int)(10 * 3.5 + 6 * 1.5);
     	System.out.println(y);
     ```

  3. `char`类型可以保存`int`的常量值,但不能保存`int`类型的变量值,需要强制转换

     ```java
     	char c1 = 100; //ok
     	int m = 100; //ok
     	char c2 = m; //错误
     	char c3 = (char)m; //可以
     	System.out.println(c2);
     ```

  4. `byte`类型和`short`类型在进行运算时,当作`int`类型处理。

### 基本数据量类型和String类型的转换

+ 介绍
  在程序开发中,我们经常需要将基本数据类型转成`String`类型。或者将`String`类型转成基本数据类型。

+ 基本类型转`String`类型
  语法:将基本类型的值 + `""`即可

+ `String`类型转基本数据类型
  语法:通过基本数据类型的包装类调用`parseXX`方法即可

  ```java
      //String --> 对应的基本数据类型
      String s5 = "123";
      //会在oop 讲对象和方法的时候详细说
      //使用 基本数据类型对应的包装类的相应方法,得到基本数据类型
      int num1 = Integer.parseInt(s5);
      double num2 = Double.parseDouble(s5);
      float num3 = Float.parseFloat(s5);
      long num4 = Long.parseLong(s5);
      byte num5 = Byte.parseByte(s5);
      boolean b = Boolean.parseBoolean("true");
      short num6 = Short.parseShort(s5);
      System.out.println(num1); //123
      System.out.println(num2); //123.0
      System.out.println(num3); //123.0
      System.out.println(num4); //123
      System.out.println(num5); //123
      System.out.println(num6); //123
      System.out.println(b); //true
  
      //怎么把字符串转成字符char
      //含义是 把字符串的第一个字符得到
      //解读 s5.charAr(0) 得到 s5字符串的第一个字符
      System.out.println(s5.charAt(0));
  ```

+ 注意事项

  1. 在将`String`类型转成基本数据类型时,要确保`String`类型能够转成有效的数据,比如 我们可以把"123",转成一个整数,但是不能把"hello"转成一个整数
  2. 如果格式不正确,就会抛出异常,程序就会终止,这个问题在异常处理章节中,会处理



# 运算符

+ 运算符介绍
  运算符是一种特殊的符号,用以表示数据的运算、赋值和比较等
  1. 算术运算符
  2. 赋值运算符
  3. 关系运算符[比较运算符]
  4. 逻辑运算符
  5. 位运算符
  6. 三元运算符

## 算术运算符

+ 介绍
  算术运算符是对数值类型的变量进行运算的,在Java程序中使用的非常多。

  | 运算符     | 运算                                             | 范例                                | 结果                           |
  | ---------- | ------------------------------------------------ | ----------------------------------- | ------------------------------ |
  | +          | 正号                                             | +7                                  | 7                              |
  | -          | 负号                                             | b = 11;<br />-b                     | -11                            |
  | +          | 加                                               | 9 + 9                               | 18                             |
  | -          | 减                                               | 10 - 8                              | 2                              |
  | *          | 乘                                               | 7 * 8                               | 56                             |
  | /          | 除                                               | 9 / 9                               | 1                              |
  | %          | 取模(取余)                                       | 11 % 9                              | 2                              |
  | ++<br />++ | 自增(前):先运算后赋值<br />自增(后):先赋值后运算 | a = 2; b = ++a;<br />a = 2; b= a++; | a = 3;b = 3<br />a = 3; b=2;   |
  | --<br />-- | 自减(前):先运算后赋值<br />自减(后):先赋值后运算 | a =2; b = --a;<br />a = 2; b = a--  | a = 1;b = 1;<br />a = 1; b = 2 |
  | +          | 字符串相加                                       | "hsp" + "edu"                       | "hspedu"                       |

  ```Java
      System.out.println(10 / 4); // 从数学角度来看是2.5, Java中是2
      System.out.println(10.0 / 4); //2.5
      double d = 10 / 4;
      System.out.println(d);
  
      // %取模,取余
      // 在Java中 %的本质 一个公式 a % b = a - a / b * b
      // -10 % 3 => -10 - (-10) / 3 * 3 = -10 + 9 = -1
      // 10 % -3 = 10 - 10 / (-3) * (-3) = 10 - 9 = 1
      System.out.println(10 % 3); //1
      System.out.println(-10 % 3); //-1
      System.out.println(10 % -3); //1
      System.out.println(-10 % -3); //-1
  
      //++的使用
      int i = 10;
      i++; //自增 等价于 i = i + 1
      ++i; //自增 等价于 i = i + 1
      System.out.println("i = " + i); //12
  
      //作为表达式使用
      //前++: ++i先自增后赋值
      //后++: i++先赋值后自增
      int j = 8;
      //int k = ++j; //等价于 j=j+1;k=j 9 9
      int k = j++; //等价于 k=j;j=j+1 8 9
      System.out.println("k=" + k + " j=" + j);
  ```

+ 自增和自减
  ```Java
      int i = 1; // i --> i
      i = i++; //(1)temp = i; (2) i=i+1; (3)i=temp;
      System.out.println(i); //1
  
      int k = 1;
      k = ++k; //规则使用临时变量:(1)k=k+1;(2)temp=k;(3)k=temp;
      System.out.println(k); //2
  
      int i1 = 10;
      int i2 = 20;
      int i3 = i1++;
      System.out.println("i3=" + i3); //10
      System.out.println("i2=" + i2); //20
      i3 = --i2;
      System.out.println("i3=" + i3); //19
      System.out.println("i2=" + i2); //19
  ```

+ 练习
  `ArithmeticOperatorExercise02.java`

  1. 假如还有59天放假,问:合多少个星期零几天
     ```java
         //1.需求:
         //假如还有59天放假,问:合xx个星期零xx天
         //2.思路分析
         //(1)使用int变量 days 保存 天数
         //(2)一个星期是7天 星期数:days / 7   零xx天leftDays days % 7
         //3.走代码
     
         int days = 59;
         int weeks = days / 7;
         int leftDays = days % 7;
         System.out.println(days + "天 合" + weeks +"个星期零" + leftDays +"天");
     ```

     

  2. 定义一个变量保存华氏温度,华氏温度转换摄氏温度的公式为:`5 / 9 * (华氏温度 - 100)`,请求出华氏温度对应的摄氏温度。[摄氏温度 234.5]
     ```java
         //1.需求
         //定义一个变量保存华氏温度,华氏温度转换摄氏温度的公式为
         //公式为: 5 / 9 * (华氏温度 - 100),请求出华氏温度对应的摄氏温度
         //2.思路分析
         //(1)先定义一个double变量 huaShi 保存华氏温度
         //(2)根据给出的公式,进行计算即可
         //	 考虑数学公式和java语言的特性
         //(3)将得到的结果保存到double sheShi
         //3.走代码
     
         double huaShi = 234.6;
         double sheShi = 5.0 / 9.0 * (huaShi - 100);
         System.out.println("华氏温度" + huaShi + "对应的摄氏温度=" + sheShi);
     ```

## 关系运算符

+ 介绍

  1. 关系运算符的结果都是`boolean`型,也就是要么是`true`,要么是`false`
  2. 关系表达式 经常用在`if`结构的条件中或循环结构的条件中

+ 关系运算符一览
  | 运算符     | 运算               | 范例                    | 结果  |
  | ---------- | ------------------ | ----------------------- | ----- |
  | ==         | 相等于             | 8 == 7                  | false |
  | !=         | 不等于             | 8 != 7                  | true  |
  | <          | 小于               | 8 < 7                   | false |
  | >          | 大于               | 8 > 7                   | true  |
  | <=         | 小于等于           | 8 <= 7                  | false |
  | >=         | 大于等于           | 8 >= 7                  | true  |
  | instanceof | 检查是否是类的对象 | "hsp" instanceof String | true  |

+ 细节说明

  1. 关系运算符的结果都是`boolean`型,也就是要么是`true`,要么是`false`
  2. 关系运算符组成的表达式,我们称之为关系表达式。`a > b`
  3. 比较运算符`==`不能写成`=`

## 逻辑运算符

+ 介绍
  用于连接多个条件(多个关系表达式),最终的结果也是一个`boolean`值

+ 逻辑运算符一览

  1. 短路与`&&`,短路或`||`,取反`!`

  2. 逻辑与`&`,逻辑或`|`,逻辑异或`^`
     | a     | b     | a & b | a && b | a \| b | a \|\| b | !a    | a ^ b |
     | ----- | ----- | ----- | ------ | ------ | -------- | ----- | ----- |
     | true  | true  | true  | true   | true   | true     | false | false |
     | true  | false | false | false  | true   | true     | false | true  |
     | false | true  | false | false  | true   | true     | true  | true  |
     | false | false | false | false  | false  | false    | true  | false |

  3. 逻辑运算规则

     1. `a & b` : `&`叫逻辑与。规则:当a和b同时为`true`,则结果为`true`,否则为`false`
     2. `a && b`: `&&`叫短路与。规则:当a和b同时为`true`,则结果为`true`,否则为`false`
     3. `a | b`: `|`叫逻辑或。规则:当a和b,有一个为`true`,则结果为`true`,否则为`false`
     4. `a || b`: `||`叫短路或。规则:当a和b,有一个为`true`.则结果为`true`,否则为`false`
     5. `!a`: `!`叫取反,或者非运算。规则:当a为`true`,则结果为`false`,当a为`false`时,结果为`true`
     6. `a ^ b`: `^`叫逻辑异或。规则:当a和b不同时,则结果为`true`,否则为`false`

+ `&&`和`&`基本规则

  | 名称      | 语法           | 特点                        |
  | --------- | -------------- | --------------------------- |
  | 短路与 && | 条件1 && 条件2 | 两个条件都为true,结果为true |
  | 逻辑与 &  | 条件1 & 条件2  | 两个条件都为true,结果为true |

+ `&&`和`&`使用区别

  1. `&&`短路与: 如果第一个条件为`false`,则第二个条件不会判断,最终结果为`false`,效率高

  2. `&`逻辑与: 不管第一个条件是否为`false`,第二个条件都要判断,效率低

  3. 开发中,我们使用的基本是短路与`&&`,效率高
     ```java
         int age = 50;
         //&&短路与的使用
         if (age > 20 && age < 90) {
             System.out.println("ok100");
         }
     
         //&逻辑与的使用
         if (age > 20 & age < 90) {
             System.out.println("ok200");
         }
     
         //逻辑与 和 短路与的区别
         int a = 4;
         int b = 9;
         //对于&&短路与而言,如果第一个条件为false,后面的条件不再判断
         if (a < 1 && ++b < 50) {
             System.out.println("ok300");
         }
         System.out.println("a=" + a + " b=" + b); // a=4 b=9
     
         //对于&逻辑与而言,如果第一个条件为false,后面的条件仍然会判断
         if (a < 1 & ++b < 50) {
             System.out.println("ok300");
         }
         System.out.println("a=" + a + " b=" + b); // a=4 b=10
     ```

+ `||`和`|`基本规则

  | 名称       | 语法             | 特点                                         |
  | ---------- | ---------------- | -------------------------------------------- |
  | 短路或\|\| | 条件1 \|\| 条件2 | 连个条件中只要有一个成立,结果为true,否则为假 |
  | 逻辑或\|   | 条件1 \| 条件2   | 只要有一个条件成立,结果为true,否则为假       |

+ `||`和`|`使用区别

  1. `||`短路或: 如果第一个条件为`true`,则第二个条件不会判断,最终结果为true,效率高
  2. `|`逻辑或: 不管第一个条件是否为`true`,则第二个条件都要判断,效率低
  3. 开发中,我们基本使用`||`

+ `!`取反 基本规则

  | 名称      | 语法  | 特点                                    |
  | --------- | ----- | --------------------------------------- |
  | !非(取反) | !条件 | 如果条件本身成立,结果为false,否则为true |

+ `^`逻辑异或
  `a^b`:叫逻辑异或,当a和b不同时,则结果为`true`,否则为`false`

## 赋值运算符

+ 介绍
  赋值运算符就是将某个运算后的值,赋给指定的变量。

+ 赋值运算符的分类

  基本赋值运算符: `=`

  复合赋值运算符: `+=`,`-=`,`*=` ,`/=`,`%=`等,重点讲解`+=`,其它的使用是一个道理
  `a += b;`[等价于: a = a + b]
  `a -= b;`[等价于: a = a - b]

+ 赋值运算符特点

  1. 运算顺序从右往左 `int num = a + b + c;`
  2. 赋值运算符的左边 只能是变量。右边,可以是变量、表达式、常量值
     `int num = 20; int num2 = 78 * 34 - 10; int num3 = a;`
  3. 复合赋值运算符等价于下面的效果
     比如: `a += 3;`等价于`a = a + 3;`
  4. 复合赋值运算符会进行类型转换
     `byte b = 2; b += 3; b++;`

## 三元运算符

+ 基本语法
  `条件表达式 ? 表达式1 : 表达式2;`

+ 运算规则

  1. 如果条件表达式为`true`,运算后的结果是表达式1;
  2. 如果条件表达式为`false`,运算后结果是表达式2;

+ 案例演示
  ```java
  int a = 10;
  int b = 99;
  int result a > b ? a++ : b--;
  ```

+ 使用细节

  1. 表达式1和表达式2要为可以赋给接收变量的类型(或可以自动转换)

  2. 三元运算符可以转成`if--else`语句

     `int res = a > b ? a ++ : --b;`

     ```java
     if (a > b) res = a++;
     else res = --b;
     ```

## 运算符优先级

1. 运算符有不同的优先级,所谓优先级就是表达式运算中的运算顺序。如下表,上一行运算符总是优先于下一行
2. 只有单目运算符、赋值运算符是从右向左运算的。

|         | `.` `()` `{}` `;` `,`              |
| :------ | :--------------------------------- |
| R --> L | `++` `--` `~`   `!(data type)`     |
| L --> R | `*`  `/`  `%`                      |
| L --> R | `+`  `-`                           |
| L --> R | `<<`  `>>`  `>>>`                  |
| L --> R | `<`  `>`  `<=`  `>=`  `instanceof` |
| L --> R | `==`  `!=`                         |
| L --> R | &                                  |
| L --> R | `^`                                |
| L --> R | `|`                                |
| L --> R | `&&`                               |
| L --> R | `||`                               |
| L --> R | `?`  `:`                           |
| R --> L | `=`  `*=`  `/=`  `%=`              |
|         | `+=`  `-=`  `<<=`  `>>=`           |
|         | `>>>=`  `&=`  `^=`  `|=`           |

梳理小结:

+ `()`  `{}` 等
+ 单目运算符 `++` `--`
+ 算术运算符
+ 位移运算符
+ 比较运算符
+ 逻辑运算符
+ 三元运算符
+ 赋值运算符





# 标识符、关键字和保留字

## 标识符的命名规则和规范

+ 标识符概念
  1. Java对各种变量、方法和类等命名时使用的字符序列称为标识符
  2. 凡是自己可以起名字的地方都叫标识符



+ 标识符的命名规则(必须遵守)
  1. 由26个英文字母大小写, 0~9, `_` 和`$` 组成
  2. 数字不可以开头
  3. 不可以使用关键字和保留字,但能包含关键字和保留字
  4. Java中严格区分大小写,长度无限制
  5. 标识符不能包含空格。



+ 标识符命名规范(更加专业)
  1. 包名: 多单词组成时所有字母都小写: aaa.bbb.ccc 比如 com.hsp.crm
  2. 类名、接口名:多单词组成时,所有单词的首字母大写: XxxYyyZzz[大驼峰]  比如: TankShotGame
  3. 变量名、方法名:多单词组成时,第一个单词首字母小写,第二个单词开始每个单词首字母大写: xxxYyyZzz[小驼峰] 比如: tankShotGame
  4. 常量名:所有字母都大写。多单词时每个单词用下划线连接: XXX_YYY_ZZZ 比如: 定义一个所得税率 TAX_RATE
  5. 后面学习到类、包、接口等时,命名规范要遵守,更加详细的看文档



## 关键字

关键字的定义和特点

定义: 被Java语言赋予了特殊含义,用做专门用途的字符串(单词)

特点: 关键字中所有字母都为小写

<b>用于定义数据类型的关键字</b>

|  class  | interface | enum  |  byte  | short |
| :-----: | :-------: | :---: | :----: | :---: |
|   int   |   long    | float | double | char  |
| boolean |   void    |       |        |       |



用于定义数据类型值的关键字

| true | false | null |      |      |
| :--: | :---: | :--: | ---- | ---- |



用于定义流程控制的关键字

|   if   | else | switch | case  | default  |
| :----: | :--: | :----: | :---: | :------: |
| while  |  do  |  for   | break | continue |
| return |      |        |       |          |



## 保留字

介绍:

Java保留字: 现有Java版本尚未使用,但以后版本可能会作为关键字使用。命名标识符时要避免使用这些保留字

| byValue  | cast  | future | generic | inner |
| -------- | ----- | ------ | ------- | ----- |
| operator | outer | rest   | var     | goto  |
| const    |       |        |         |       |





# 键盘输入语句

+ 介绍
  在编程中,需要接收用户输入的数据,就可以使用键盘输入语句来获取,需要一个扫描器(对象),就是`Scanner`
+ 步骤:
  1. 导入该类的所在包,`java.util`
  2. 创建该类对象(声明变量)
  3. 调用里面的功能





# 进制

+ 进制介绍
  对于整数,有四种表示方法:
  1. 二进制: 0,1 满2进1 以0b或者0B开头
  2. 十进制: 0~9 满10进1
  3. 八进制: 0~7 满8进1 以数字0开头表示
  4. 十六进制: 0~9及A(a)-F(f) 满16进1 以0x或0X开头表示。此处的A-F不区分大小写