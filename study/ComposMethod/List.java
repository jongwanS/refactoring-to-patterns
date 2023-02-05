package study.ComposMethod;

public class List {
    private boolean readOnly = false;
    private int size = 0;
    private final static int GROWTH_INCREMENT = 5;
    private Object[] elements = new Object[GROWTH_INCREMENT];

    public void add(Object element){
        if(readOnly)
            return;
        if(atCapacity()){
            grow();
        }
        addElement(element);
    }

    private void addElement(Object element) {
        elements[size++] = element;
    }

    private void grow() {
        Object[] newElemetns = new Object[elements.length + GROWTH_INCREMENT];
        for(int i=0;i<size;i++){
            newElemetns[i] = elements[i];
        }
        elements = newElemetns;
    }

    private boolean atCapacity() {
        return (this.size+1) > elements.length;
    }

    public int getSize(){
        return elements.length;
    }
}
