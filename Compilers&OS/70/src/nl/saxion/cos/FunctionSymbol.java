package nl.saxion.cos;

public class FunctionSymbol extends Symbol {
    private DataType[] parameterTypes;
    private DataType returnType;

    public FunctionSymbol(String name, DataType[] parameterTypes, DataType returnType) {
        super(name);
        this.parameterTypes = parameterTypes;
        this.returnType = returnType;
    }

    public DataType[] getParameterTypes() {
        return parameterTypes;
    }

    public void setParameterTypes(DataType[] parameterTypes) {
        this.parameterTypes = parameterTypes;
    }

    public DataType getReturnType() {
        return returnType;
    }

    public void setReturnType(DataType returnType) {
        this.returnType = returnType;
    }
}
