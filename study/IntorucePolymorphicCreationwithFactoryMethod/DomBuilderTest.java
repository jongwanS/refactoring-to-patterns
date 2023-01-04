package study.IntorucePolymorphicCreationwithFactoryMethod;

public class DomBuilderTest extends AbstractBuilderTest{

    @Override
    protected OutputBuilder createBuilder(String rootName) {
        return new XMLBuilder();
    }
}
