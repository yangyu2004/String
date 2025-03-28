/**
 * @author yangyu
 * @date 2025/3/27
 * @Description
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //定义一个字符串"JAVA编程基础，我喜欢java编程"
        String str = new String("JAVA编程基础，我喜欢JAVA编程");

        //查找字符"A"在字符串中第一次出现的位置
        System.out.println("字符A在字符串中第一次出现的位置为：" + str.indexOf("A"));

        //查找子串"编程"在字符串中第一次出现的位置
        System.out.println("子串“编程”在字符串中第一次出现的位置为：" + str.indexOf("编程"));

        //查找字符"A"在字串中最后一次出现的位置
        System.out.println("字符A在字符串中最后一次出现的位置为：" + str.lastIndexOf("A"));

        //查找子串"编程"在字串中最后一次出现的位置
        System.out.println("子串“编程”在字符串中最后一次出现的位置为：" + str.lastIndexOf("编程"));


        //在字符串index值为8之后寻找子串"编程"第一次出现的位置
        System.out.println("子串“编程”在字符串中第一次出现的位置为：" + str.indexOf("编程", 8) );

    }

}
