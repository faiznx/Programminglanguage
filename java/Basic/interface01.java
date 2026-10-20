interface father{
    void printdetail();
}
class son03 implements father{
   public  void printdetail(){
        System.out.println("I am a father son:");

    }
}


public class interface01 {
    void main(){
        son03 s1 =new son03();
        s1.printdetail();

    }
    
}
