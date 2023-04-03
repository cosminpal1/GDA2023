package basics;

public class Main {
    static void copyArrayExample(){
        char[] copyFrom={'a','b','c','d','e','f','g','h','i'};
        char[] copyTo= new char[7];
        System.arraycopy(copyFrom,2,copyTo,0,7);
        System.out.println(copyTo);
    }

    static void compareString(){
        String firstString=newString("FirstString");
        String secondString=newString("SecondString");

        if(firstString.equals(secondString)){
            System.out.println("nu");
        }

    }

    public static void main(String[] args){
        copyArrayExample();
    }
}
