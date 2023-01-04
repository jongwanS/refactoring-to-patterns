package study.IntorucePolymorphicCreationwithFactoryMethod;

public class XMLBuilderTest extends AbstractBuilderTest{
    @Override
    protected OutputBuilder createBuilder(String rootName) {
        return new XMLBuilder();
    }
}
