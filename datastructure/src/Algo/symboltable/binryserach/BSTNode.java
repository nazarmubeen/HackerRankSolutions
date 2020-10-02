package Algo.symboltable.binryserach;

public class BSTNode<Key, Value> {

    private Key key;
    private Value value;
    private BSTNode left, right;

    public BSTNode(Key key, Value value) {
        this.key = key;
        this.value = value;
    }

}
