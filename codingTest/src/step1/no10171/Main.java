package step1.no10171;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\\    /\\");
//        System.out.println(" )  ( ')");
//        System.out.println("(  /  )");
//        System.out.println(" \\(__)|");

        //많은 문자열을 연결하면 많은 중간 문자열 객체가 생성되어 비효율적인 코드가 생성된다. E
        //따라서 StringBuilder 사용
        StringBuilder sb = new StringBuilder();

        sb.append("\\    /\\\n");
        sb.append(" )  ( ')\n");
        sb.append("(  /  )\n");
        sb.append(" \\(__)|\n");

        System.out.println(sb);
    }
}
