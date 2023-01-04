package study.IntorucePolymorphicCreationwithFactoryMethod;

public abstract class AbstractBuilderTest extends TestCase{
    protected OutputBuilder builder;
    protected abstract OutputBuilder createBuilder(String rootName);

    public String testAddAboveRoot(){
        String invalidResult = "<order></order><customer></customer>";
        return invalidResult;
    }
}
