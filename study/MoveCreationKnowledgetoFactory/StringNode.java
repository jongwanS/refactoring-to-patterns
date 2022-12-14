package study.MoveCreationKnowledgetoFactory;

public class StringNode extends Node{
    private StringBuffer textBuffer;
    private int textBegin;
    private int textEnd;

    public StringNode(StringBuffer textBuffer, int textBegin, int textEnd) {
        this.textBuffer = textBuffer;
        this.textBegin = textBegin;
        this.textEnd = textEnd;
    }
}
