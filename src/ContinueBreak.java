public class ContinueBreak {
    public static void main(String[] args) {
        String[] table={"aa","bb","cc","dd"};
        for(String ss:table) {
            if("bb".equals(ss)){
                continue;
            }
            System.out.println("2nd  >>>>"+ss); //aa cc
            if("cc".equals(ss)){
                System.out.println("inside break  >>>>"+ss); //aa cc
                break;
            }
        }
        System.out.println("=====>>Out of the loop.");
    }
}
