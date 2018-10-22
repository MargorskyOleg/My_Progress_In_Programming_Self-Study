package Filosofia_Java;

//public class Main {
//    public static void main(String[] args) {
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//
//    }
//}

////стр.80
////Логические опираторы
//
//import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Random rand = new Random(47);
//        int i = rand.nextInt(100);
//        int j = rand.nextInt(100);
//        System.out.println("i = " + i);
//        System.out.println("i = " + j);
//        System.out.println("i > j is " + (i > j));
//        System.out.println("i < j is " + (i < j));
//        System.out.println("i >= j is " + (i >= j));
//        System.out.println("i <= j is " + (i <= j));
//        System.out.println("i == j is " + (i == j));
//        System.out.println("i != j is " + (i != j));
//        //В java целое число (int) не может
//        //интеретироваться как логический тип (boolean)
//        //!System.out.println("i && j is " + (i && j));
//        //!System.out.println("i || j is " + (i || j));
//        System.out.println("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
//        System.out.println("(i < 10) || (j < 10) is " + ((i < 10) || (j < 10)));
//        //i = 58
//        //i = 55
//        //i > j is true
//        //i < j is false
//        //i >= j is true
//        //i <= j is false
//        //i == j is false
//        //i != j is true
//        //(i < 10) && (j < 10) is false
//        //(i < 10) || (j < 10) is false
//    }
//}

//стр.79!!!!
class main{
    int i;
}
public class Main {
    public static void main(String[] args) {
        main m1 = new main();
        main m2 = new main();
        m1.i = m2.i = 100;
        System.out.println(m1.equals(m2));
    }
}

////стр.79
//public class Main {
//    public static void main(String[] args) {
//        Integer n1 = new Integer(47);
//        Integer n2 = new Integer(47);
//        System.out.println(n1 == n2); //сравнивает сылки
//        System.out.println(n1 != n2); //сравнивает сылки
//        //false
//        //true
//
//        Integer t1 = new Integer(47);
//        Integer t2 = new Integer(47);
//        System.out.println(t1.equals(t2)); //сравнивает содержания в скобках
//    }
//}

////стр.78
//public class Main {
//    public static void main(String[] args) {
//        int i = 1;
//        System.out.println("i:" + i);
//        System.out.println("++i:" + ++i);//Префиксный инкремент //++a   Эквивалентно   (a = a + 1)
//        System.out.println("i++:" + i++);//Постфиксный инкремент
//        System.out.println("i:" + i);
//        System.out.println("--i:" + --i);//Префиксный инкремент
//        System.out.println("i--:" + i--);//Постфиксный инкремент
//        System.out.println("i:" + i);
//        //i:1
//        //++i:2
//        //i++:2
//        //i:3
//        //--i:2
//        //i--:2
//        //i:1
//
//        //++a   Эквивалентно   (a = a + 1)
//    }
//}

////стр.77
//public class Main {
//    public static void main(String[] args) {
//
//        int x,a = 2,b = 2;
////        x = -a;
////        x = a * -b;
//        x = a * (-b);   //-b    унарный оператор плюс и минус
//        System.out.println(x);
//        //-4
//    }
//}

////стр.76
////:operators/MathOps.java
////Демострация математических операций.
//import java.util.*;
//
//public class Main{
//    public static void main(String [] args){
//        //Создание и раскрутка гкнератора случайных чисел
//        Random rand = new Random(47);
//        int i,j,k;
//        //Выбор значения от 1 до 100;
//        j = rand.nextInt(100) + 1;
//        System.out.println("j:" + j);
//        k = rand.nextInt(100) + 1;
//        System.out.println("k:" + k);
//        i = j + k;
//        System.out.println("j + k:" + i);
//        i = j - k;
//        System.out.println("j - k:" + i);
//        i = j / k;
//        System.out.println("j / k:" + i);
//        i = j * k;
//        System.out.println("j * k:" + i);
//        i = k % j;
//        System.out.println("k % j:" + i);
//        j %= k;
//        System.out.println("j %/ k:" + j);
//        //Тесты для вещественных чисел
//        float u,v,w; //такде можно использовать double
//        v = rand.nextFloat();
//        System.out.println("v:" + v);
//        w = rand.nextFloat();
//        System.out.println("w:" + w);
//        u = v + w;
//        System.out.println("v + w:" + u);
//        u = v - w;
//        System.out.println("v - w:" + u);
//        u = v * w;
//        System.out.println("v * w:" + u);
//        u = v / w;
//        System.out.println("v / w:" + u);
//        //следующее также относится к типам
//        //char, byte, short, int, long, и double:
//        u += v;
//        System.out.println("u += v:" + u);
//        u -= v;
//        System.out.println("u -= v:" + u);
//        u *= v;
//        System.out.println("u *= v:" + u);
//        u /= v;
//        System.out.println("u /= v:" + u);
//        //j:59
//        //k:56
//        //j + k:115
//        //j - k:3
//        //j / k:1
//        //j * k:3304
//        //k % j:56
//        //j %/ k:3
//        //v:0.5309454
//        //w:0.0534122
//        //v + w:0.5843576
//        //v - w:0.47753322
//        //v * w:0.028358962
//        //v / w:9.940527
//        //u += v:10.471473
//        //u -= v:9.940527
//        //u *= v:5.2778773
//        //u /= v:9.940527
//    }
//}

////стр.75
//// operatord/PassObjrct java
////Передача объектов методам может работать
////не так, как вы привыкли.
//
////import static sun.plugin2.uitoolkit.impl.awt.AWTClientPrintHelper.print;
//
//class Main2{
//    char c;
//}
//
//public class Main{
//    static void f(Main2 y){
//    y.c = 'z';
//    }
//    public static void main(String[] args) {
//
//        Main2 x = new Main2();
//        x.c = 'a';
//        System.out.println("1: x.c:" + x.c);
////        print("1: x.c:" + x.c);
//        f(x);
//        System.out.println("1: x.c:" + x.c);
////        print("2: x.c:" + x.c);
//        //1: x.c:a
//        //1: x.c:z
//    }
//}

////стр.74
////:oprators/Assignmet java
//// Присвоение обектов имеет ряд хитросткей
//
////import static sun.plugin2.uitoolkit.impl.awt.AWTClientPrintHelper.print;
//
//class Main2 {
//
//    int level;
//}
//    public class Main{
//    public static void main(String[] args) {
//
//        Main2 m1 = new Main2();
//        Main2 m2 = new Main2();
//
//        m1.level = 9;
//        m2.level = 47;
//
//        System.out.println("1 m1 level:" + m1.level + " m2 level:" + m2.level);
////        print("1 m1 level:" + m1.level + " m2 level:" + m2.level);
//
//        m1 = m2; //клонирования
//
//        System.out.println("1 m1 level:" + m1.level + " m2 level:" + m2.level);
////        print("2 m1 level:" + m1.level + " m2 level:" + m2.level);
//
//        m1.level = 27; //присвоение число 27 к m1.level
//
//        System.out.println("1 m1 level:" + m1.level + " m2 level:" + m2.level);
////        print("3 m1 level:" + m1.level + " m2 level:" + m2.level);
//        //1 m1 level:9  m2 level:47
//        //1 m1 level:47 m2 level:47
//        //1 m1 level:27 m2 level:27
//    }
//}

////стр.73!!!!
//public class Main {
//    public static void main(String[] args) {
//        int x = 1,y = 2,z = 3;      //(1)
//        int b = x +(y - 2)/(2 + z); //(2)
//        System.out.println(" a = " + a + " b = " + b);
//    }
//}

////стр.72
//
//import java.util.Date;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Привет, сегодня");
//        System.out.println(new Date());
//    }
//}
////Привет, сегодня
////Tue Oct 16 11:53:30 MSK 2018

                                                                                                                        //Глава 3 Операторы
//##############################################################

//стр.70
//class AllTheColorsOfTheRainbow{
//    int anIntegerRepresentngColors;
//    void changeTheHueOfTheColor(int newHue){
//        //...
//    }
//    //..
//}

//стр.69
//:object/HelloDate.java
//import java.util.*;
///**Первая программа-пример книги.
// * Выводит строку и текущее число.
// * @author Брюс Элккель
// * @author www.MindView.net
// * @version 4.0
// */
//public class Main{
//    /** Точка входа в класс и приложение
//     * @param args Массив строковых фргументов
//     * @throws exceptions Исключения не выдаются
//     */
//    public static void main(String[] args) {
//        System.out.println("Привет, сегодня: ");
//        System.out.println(new Date());
//
//    }
//}

//стр.66
//:object/Documentation2.java
///**
// * Можно <em>даже</em> встаыить список:
// * <ol>
// *     <li>Пункт первый</>
// *     <li>Пункт второй</>
// *     <li>Пункт третий</>
// * </ol>
// */
/////:~

//стр.66
//:object/Documentation2.java
///**
// *<>
// *     System.out.ptintln(new Date())
// *</>
// */

//стр.66
//.object/Documentationl.java
///**Комментарий к классу*/
//public class Main{
//    /**Комментарий к переменной*/
//    public int i;
//    /**Комментарий к методу*/
//    public void f(){}
//}///;~

//стр.62
//HelloDate.java
//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Привет, сегодня;");
//        System.out.println(new Date());

//стр.61
//Incremenrble.increment();     //Static

//стр.61
//Incrementable sf = new Incrementable();
//sf.increment();

//стр.61
//class Incremenrable{
//    static void increment(){StaticTest i++;}
//}

//стр.61
//        StaticTest i++;

//стр.61
//        StaticTest st1 = new StaticTest();
//        StaticTest st2 = new StaticTest();

//стр.60
//class StaticTest{
//    static int i = 47;
//}

//стр.58
//boolean flag(){return true;}
//float naturelLogBase(){return 2.718}
//void nothing(){return;}
//void nothung2(){}

//стр.58
//        int storage(String s){
//            return s.length()*2;
//        }

//стр.55
//        class DataOnly{
//            int i;
//            double d;
//            boolean b;
//        }

//стр.55
//        ATypeName a = new ATypeName();

//стр.55
//        class ATypeName{/*Тело класса*/}

//стр.54
//public class Main {
//    public static void main(String[] args) {
//        {
//            String s = new String("строка");
//        }        //конец области действия
//    }
//}

//стр.54
//public class Main {
//    public static void main(String[] args) {
//        {
//            int x = 12;
//            {
//                int x = 96;//неверно
//            }
//        }
//    }
//}

//стр.53
//public class Main {
//    public static void main(String[] args) {
//        {
//            int x = 12;
//            //доступно только x
//            {
//                int q = 96;
//                //доступны как x, так и q
//            }
//            //доступно только x
//            //q надится "за пределами видимости"
//        }
//    }
//}

//стр.52
//public class Main {
//    public static void main(String[] args) {
//        Character ch = 'x';
//        char c = ch;
//        System.out.println(c);
//        //x
//    }
//}

//стр.51
//public class Main {
//    public static void main(String[] args) {
//        char c = 'x';
//        Character ch = new Character(c);
//        System.out.println(ch);
//        //x
//    }
//}
