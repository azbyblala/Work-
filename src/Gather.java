import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by 张连芳 on 2016/10/30.
 */
public class Gather {
    public static void main(String[] args) {
        // 创建⼀个集合，添加⼀些数据，数据内容自己定义，用尽可能多的方式去遍历这个集合，输出数据。
        List<String> Strings = new ArrayList<String>();//定义list接口对象并实例化list对象只能为string类型
        Strings.add("B");
        Strings.add("A");//用尽可能多的方式输出 strings 的所有内容
        Strings.add("C");//List中可以保存各个重复的内容，要使用此接口需要通过其子类实例化
        Strings.add("C");//子类有arraylist linkedlist vector
        Strings.add("E");
        Strings.add("D");
        String str[]=Strings.toArray(new String[]{});
        System.out.print("指定数组类型：");
        for (int j=0;j<str.length;j++){
            System.out.print(str[j]+",");
        }
        System.out.print("\n返回对象数组：");
        Object str1[]=Strings.toArray();
        for(int j=0;j<str1.length;j++){
            String str2=(String) str1[j];
            System.out.print(str2+",");
        }
        System.out.print("\n由前向后输出：");
        for (int i = 0; i < Strings.size(); i++) {
            System.out.print(Strings.get(i) + ",");

        }

        System.out.print("\n由后向前输出：");
        for (int i = Strings.size() - 1; i>= 0; i--)
        {
            System.out.print(Strings.get(i) + ",");

    }
        System.out.println();
        Iterator<String> Str= Strings.iterator();
        while (Str. hasNext()){
            System.out.print(Str.next()+",");
        }
}}
