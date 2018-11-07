import java.util.ArrayList;
import java.util.List;

/**
 * @author Bourne
 * @version V1.0
 * @ClassName: Node
 * @Description: TODO ADD REASON(可选).
 * @date: 2018年11月06日 15:19
 * @since JDK 1.8
 */
public class Node {
    private String id;
    private String pId;
    private String name;
    private List<Node> child;

    Node(){
        child = new ArrayList<Node>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tree [id=" + id + ", pId=" + pId + ", name=" + name + "]";
    }


    public List<Node> getChild() {
        return child;
    }

    public void setChild(List<Node> child) {
        this.child = child;
    }
}
