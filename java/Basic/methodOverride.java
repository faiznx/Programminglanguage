import module java.base;
abstract class father01{
    void meth(){
        System.out.println("I am a fther classs  first method ");
    }
     abstract void meth02();

}
class son01 extends father01{
    void meth02(){
        System.out.println("i am a method of class son and i am also second");

    }
}
 class son02 extends father01{
    void meth02(){
        System.out.println("l am okay done thik hai k nai boss aj uni a na hai k nai aur is nay repaly ");

    }

}
  public class methodOverride{
    // public static void main(String[] args)   no need wrote all stetment in java 20
    void main(){
    //     father01 f1=new son01();
        son01 s1=new son01();
        s1.meth02();
        // f1.meth02();
        

    }
}