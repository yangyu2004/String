/**
 * @author yangyu
 * @date 2025/3/27
 * @Description
 */
public class Main {
    public static void main(String[] args) {
        //定义一个字符串"JAVA 编程 基础"
        String str = "JAVA 编程 基础";
        //打印输出字符串的长度
        System.out.println("字符串长度为：" + str.length());
        //打印输出字符串的"程"字
        System.out.println("字符串的“程”字为：" + str.charAt(6));
        //取出字串并输出："编程 基础"
        System.out.println("字串为：" + str.substring(5));
        //取出字串编程并输出
        System.out.println("字串为：" + str.substring(5, 7));
    }
}
