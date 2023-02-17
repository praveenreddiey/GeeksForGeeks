package org.designpatterns;

public class SingletonPattern {
    public static void main(String[] args) {
        Singleton instance = Singleton.createInstance();
        System.out.println(instance.hashCode());
        System.out.println(instance.hashCode());
        System.out.println(instance.hashCode());
        System.out.println(instance.hashCode());
    }
}
class Singleton{

    //        private static Singleton singleton;
//    private Singleton(){
//
//    }
//    public static Singleton createInstance(){
//        if(singleton == null){
//            synchronized (Singleton.class){
//                singleton = new Singleton();
//            }
//        }
//        return singleton;
//    }
    private static final class BillFugSingleton{
        private static final Singleton instance = new Singleton();
    }
    public static Singleton createInstance(){
        return BillFugSingleton.instance;
    }
}

