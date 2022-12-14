package study.MoveCreationKnowledgetoFactory;

public class StringParser {
    public Node find(){
        StringBuffer textBuffer = new StringBuffer();
        int textBegin = 0;
        int textEnd = 10;
        Parser parser = new Parser();
        return parser.getNodeFactory().createStringNode(textBuffer, textBegin,textEnd);
    }
}
