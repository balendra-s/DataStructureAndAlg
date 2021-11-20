public class NodeTries {

    private char value;
    private NodeTries[] children;
    private boolean isEndOfWord;

    public NodeTries(char value) {
        this.value = value;
        this.children = new NodeTries[26];
        this.isEndOfWord = false;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public NodeTries getChildren(int index) {
        return children[index];
    }

    public void setChildren(int index,char value) {
        this.children[index] = new NodeTries(value);
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    @Override
    public String toString() {
        return "value=" + value ;
    }
}
