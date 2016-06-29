package com.app.dprokopiuk.module04.sample3;

/**
 * Created by Администратор on 25.06.2016.
 */
public class App3 {

    public static void main(String[] args){
        Phone a = new Phone();
        Phone b = new Phone();
        System.out.println(a.equals(b));
        a.setName("HTC");
        b.setName("HTC");
        System.out.println(a.equals(b));
        System.out.println("a.hashCode="+a.hashCode());
        System.out.println("b.hashCode="+b.hashCode());
        System.out.println("a==b-->"+(a==b));

        System.out.println("----------");
        Phone apple = new Phone();
        apple.setName("Apple");
        Phone android = null;
        System.out.println(apple.equals(new Object()));
        System.out.println(apple.equals(android));
        System.out.println(apple.equals(apple));
        android = new Phone();
        android.setName("Android");
        System.out.println(apple.equals(android));
        android.setName("Apple");
        System.out.println(apple.equals(android));

        //Picture test
        System.out.println("------Picture test----");
        Phone samsung = new Phone();
        samsung.setName("Samsung");
        Phone samsung1 = new Phone();
        samsung1.setName("Samsung");
        Phone samsung2 = new Phone();
        samsung2.setName("Samsung");
        System.out.println("samsung.hashCode()="+samsung.hashCode());
        System.out.println("samsung1.hashCode()="+samsung1.hashCode());
        System.out.println("samsung2.hashCode()="+samsung2.hashCode());
        System.out.println("samsung1==samsung2-->"+(samsung1==samsung2));
        System.out.println("samsung2==samsung1-->"+(samsung2==samsung1));
        System.out.println("samsung1==samsung1-->"+(samsung1==samsung1));
        System.out.println("samsung.equals(samsung1)-->"+(samsung1.equals(samsung2)));
        System.out.println("samsung1.equals(samsung2)-->"+(samsung1.equals(samsung2)));
        System.out.println("samsung.equals(samsung2)-->"+(samsung1.equals(samsung2)));
        System.out.println("samsung2.equals(samsung1)-->"+(samsung2.equals(samsung1)));
        System.out.println("samsung1.equals(samsung1)-->"+(samsung1.equals(samsung1)));







       // System.out.println("-----------Equals---------------------");
        //-------
        /*String s = "Denis";
        String s1 = "Denis";
        String s2 = new String("Denis");
        String s3 = new String("Denis");
        System.out.println(s.equals(s1));
        System.out.println("s.hashCode="+s.hashCode());
        System.out.println("s1.hashCode="+s1.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println("s1.hashCode="+s1.hashCode());
        System.out.println("s2.hashCode="+s2.hashCode());
        System.out.println(s2.equals(s3));
        System.out.println("s2.hashCode="+s2.hashCode());
        System.out.println("s3.hashCode="+s3.hashCode());
        System.out.println("--------------==------------------");
        System.out.println(s==s1);
        System.out.println("s.hashCode="+s.hashCode());
        System.out.println("s1.hashCode="+s1.hashCode());
        System.out.println(s1==s2);
        System.out.println("s1.hashCode="+s1.hashCode());
        System.out.println("s2.hashCode="+s2.hashCode());
        System.out.println(s2==s3);
        System.out.println("s2.hashCode="+s2.hashCode());
        System.out.println("s3.hashCode="+s3.hashCode());
    */
    }
}
