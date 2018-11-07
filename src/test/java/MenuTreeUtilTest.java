import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class MenuTreeUtilTest {


    private MenuTreeUtil menuTreeUtil = new MenuTreeUtil();
    @org.junit.Test
    public void menuList() {
        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node1.setId("0");
        node1.setpId("0.1");
        node1.setName("kfjf");
        node2.setId("0");
        node2.setpId("0.2");
        node2.setName("dufhieu");
        node3.setId("0.1");
        node3.setpId("0.1.2");
        node3.setName("jglrkjg");
        LinkedList<Node> list = new LinkedList<Node>();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        Node head = menuTreeUtil.menuList(list);
        System.out.print(head.getChild().get(0).getChild().get(0).getName());
    }
}