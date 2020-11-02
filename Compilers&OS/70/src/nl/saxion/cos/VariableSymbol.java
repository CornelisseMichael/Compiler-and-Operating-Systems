package nl.saxion.cos;

public class VariableSymbol extends Symbol{
    private DataType type;
    private int index;

    public VariableSymbol(String name, int index, DataType type) {
        super(name);
        this.index = index;
        this.type = type;
    }

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
