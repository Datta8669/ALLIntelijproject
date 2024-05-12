public class SubStringUsingForLoop {
    public static void main(String[] args) {
        String str="asdd";
        char ch[]=str.toCharArray();

        for(int i=0;i<ch.length;i++){
              if(ch[i]==ch[i+1]){
                  System.out.println("if    "+ch[i]); //getting here a common element in  string
              }else{
                  System.out.print(ch[i]);
              }
        }
            }

    }

