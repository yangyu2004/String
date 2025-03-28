/**
 * @author yangyu
 * @date 2025/3/27
 * @Description
 */
public class SpringBuilder {
    public static void main(String[] args) {
        //定义一个字符串
        StringBuilder str = new StringBuilder("你好");
//        //在你好后面添加内容，变为：你好，世界
//        str.append("，世界");
//        System.out.println(str);
//
        System.out.println("str="+str.append("，世界"));


        //将字符串变成你好，新世界
        str.replace(2,5,",新");
        System.out.println("str="+str.append("世界"));

        //使用delete方法删除后插入
        str.delete(2,5).insert(2,"新");
        System.out.println("str="+str.append("界"));


        //使用replace方法替换
        str.replace(2,5,"新");
        System.out.println("str="+str.append("世界"));


    }
}
