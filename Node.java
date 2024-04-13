import java.util.Map;

public class Node {

    private Map<String, Node> m1 ;
    private Node prevNode;
    private Node nextNode;



    public Map<String,Node> getM1() {
        return this.m1;
    }

    public void setM1(Map<String,Node> m1) {
        this.m1 = m1;
    }

    public Node getPrevNode() {
        return this.prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }


    @Override
    public boolean equals(Node){

    }

    @Override
    public void hashCode){
        
    }
    
}
