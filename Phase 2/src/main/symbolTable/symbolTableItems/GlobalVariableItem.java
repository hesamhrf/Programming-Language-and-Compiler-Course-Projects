package main.symbolTable.symbolTableItems;

import main.ast.node.declaration.GlobalVarDeclaration;
import main.ast.node.declaration.VarDeclaration;
import main.ast.type.Type;

public class GlobalVariableItem extends SymbolTableItem {

    protected Type type;
    protected GlobalVarDeclaration globalVarDeclaration;
    public static final String START_KEY = "global_";

    public GlobalVariableItem(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public GlobalVariableItem(GlobalVarDeclaration globalVarDeclaration)
    {
        this.name = globalVarDeclaration.getIdentifier().getName();
        this.type = globalVarDeclaration.getType();
        this.globalVarDeclaration = globalVarDeclaration;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
        globalVarDeclaration.getIdentifier().setName(name);
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public GlobalVarDeclaration getGlobalVarDeclaration()
    {
        return globalVarDeclaration;
    }

    public void setGlobalVarDeclaration(GlobalVarDeclaration globalVarDeclaration)
    {
        this.globalVarDeclaration = globalVarDeclaration;
    }

    @Override
    public String getKey() {
        return GlobalVariableItem.START_KEY + this.name;
    }
}







