import java.util.Objects;

/**
 * Created by 张连芳 on 2016/11/3.
 */
public class Test {
    public static void main(String[] args) {
        Bag<String> strings1 = new Bag<String>();

        strings1.add("成");
        /*一个无序单位组(Bag)就像一个集合(Set)，
        它允许元素重复 类Bag必须有方法来插入和删除元素 测试Bag是否为空，
        得到Bag中的元素 能在Bag中搜索一个特定的元素。*/

        strings1.add("B");
        strings1.add("1");
        strings1.add("xxx");
        strings1.add("abc");
        strings1.add("888");
        strings1.add("A");
        strings1.add("A");
        System.out.println(strings1);
        System.out.print("Bag为空是true/false:"+strings1.isEmpty());
        System.out.println();
        strings1.remove("1");
        System.out.println("删除元素1："+strings1);
      strings1.add("K");
       System.out.println("增加元素K:"+strings1);
        strings1.contains("abc");
        System.out.println("是否存在元素abc："+strings1.contains("abc"));
        }
        }
