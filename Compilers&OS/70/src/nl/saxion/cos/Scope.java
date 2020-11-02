package nl.saxion.cos;

import java.util.HashMap;

public class Scope {
    private HashMap<String, Symbol> symbols;
    private Scope parentScope;
    private int lastIndex;

    public Scope(Scope parentScope, int currentIndex) {
        this.parentScope = parentScope;
        symbols = new HashMap<>();
        this.lastIndex = currentIndex;

        //this is the top/global scope, we need to increment all indices with 1
        if(parentScope == null){
            symbols.put(null, null);
        }
    }

    public void declareVariable(VariableSymbol symbol) throws IdentifierAlreadyUsedException {
        try {
            lookupVariable(symbol.getName());
            throw new IdentifierAlreadyUsedException("Declared identifier \"" + symbol.getName() + "\" has already been used");
        } catch (CompilerException ce) {
            symbols.put(symbol.getName(), symbol);
        }
    }

    public void declareFunction(FunctionSymbol symbol) throws IdentifierAlreadyUsedException{
        try {
            lookupFunction(symbol.getName());
            throw new IdentifierAlreadyUsedException("Declared identifier \"" + symbol.getName() + "\" has already been used");
        } catch (CompilerException ce) {
            symbols.put(symbol.getName(), symbol);
        }
    }

    public FunctionSymbol lookupFunction(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol == null) {
            if (parentScope == null) {
                throw new CompilerException("Symbol with identifier \""+ name + "\" does not exist in the scope");
            } else return parentScope.lookupFunction(name);
        } else if (symbol instanceof FunctionSymbol) {
            return (FunctionSymbol) symbol;
        } else throw new CompilerException("Symbol with identifier \""+ name + "\" is not a function");
    }

    public VariableSymbol lookupVariable(String name) {
        Symbol symbol = symbols.get(name);
        if (symbol == null) {
            if (parentScope == null) {
                throw new CompilerException("Symbol with identifier \""+ name + "\" does not exist in the scope");
            } else return parentScope.lookupVariable(name);
        } else if (symbol instanceof VariableSymbol) {
            return (VariableSymbol) symbol;
        } else throw new CompilerException("Symbol with identifier \""+ name + "\" is not a variable");
    }

    public Scope openScope() {
        return new Scope(this, lastIndex);
    }

    public Scope closeScope() {
        parentScope.setLastIndex(lastIndex);
        return parentScope;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    public int getNextIndex() {
        return ++lastIndex;
    }
}
