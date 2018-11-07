import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.LinkedList;

/**
 * @author  Gael  Bourne
 * @version V1.0
 * @ClassName: MenuTreeUtil
 * @Description: TODO ADD REASON(可选).
 * @date: 2018年11月06日 15:20
 * @since JDK 1.8
 */
public class MenuTreeUtil {
    public  Node head = new Node();
    public LinkedList<Node> menuCommon;

/**
*@Classname findChild    寻找子节点
*@Param [x   type：Node]
*@return Node
*
**/


    public Node findChild(Node x){
       x.setChild( menuChild(x.getpId()));
        return x;
    }
    /**
    *@Classname menuList  菜单树
    *@Param [menu    type：LinkedList<Node>   存放所有从数据库取出的节点</>]
    *@return Node
    *
    **/


    public Node menuList(LinkedList<Node> menu){
        this.menuCommon = menu;
        head.setChild(menuChild("0"));
        return head;
    }
    /**
    *@Classname menuChild  寻找菜单的节点的孩子
    *@Param [id   父节点的id号]
    *@return java.util.List<Node>
    *
    **/

    public List<Node> menuChild(String id){
        List<Node> lists = new ArrayList<Node>();
        for(Node a:menuCommon){
            if(a.getId() == id){
                lists.add(findChild(a));
            }
        }
        return lists;
    }
}
