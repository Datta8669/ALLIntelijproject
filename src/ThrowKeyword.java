class Test extends RuntimeException{
 Test( String str){
     super(str);
 }
}
public class ThrowKeyword {
    public static void main(String[] args) {
        int age = 34;
        if (age < 89) {
                  throw new Test(" OK BOSS  I WILL  HANDLE IT ");
        }
    }
}