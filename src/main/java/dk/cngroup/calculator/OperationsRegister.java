package dk.cngroup.calculator;

import dk.cngroup.calculator.operations.IOperation;

import java.util.HashMap;

/**
 * Storage for all possible operations
 */
public class OperationsRegister {

    private HashMap<String, IOperation> storage;

    public OperationsRegister() {
        storage = new HashMap<String, IOperation>();
    }

    public void register(IOperation operation) {
        storage.put(operation.getOperation(), operation);
    }

    public IOperation findOperation(String order) {
        return storage.get(order);
    }
}
