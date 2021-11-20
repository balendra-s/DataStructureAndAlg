public class Tries {
    private NodeTries rootNode;

    public Tries(){
        rootNode = new NodeTries(' ');
    }

    public void insertNewWord(String newWord){
        NodeTries current = rootNode;
        for(char ch : newWord.toCharArray() ){
            int index = ch - 'a';
            if(current.getChildren(index) == null){
                current.setChildren(index,ch);
                current = current.getChildren(index);
            }
            current.setEndOfWord(true);
        }
    }

    public static void main(String[] args) {
        Tries tries = new Tries();
        tries.insertNewWord("cat");
        tries.insertNewWord("dog");
        System.out.println("DONE");
    }
}
