public class CustomException extends Exception {
    CustomException() {
        super("yess boss you cant vote>>>>>>>>>>>>>>");
    }

    CustomException(String message) {
        super(message);  //for non parametrised constructor
    }
}

class Test12 {
    public static void main(String[] args) throws CustomException {
        int age = 12;
        try {
            if (age < 18) {
                throw new CustomException();  //u call here parametrised or non parametrised...
               // throw new CustomException("u can t vote sir..");  //u call here parametrised or non parametrised...
            }
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }
    }
}