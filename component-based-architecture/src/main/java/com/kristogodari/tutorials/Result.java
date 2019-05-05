package com.kristogodari.tutorials;

import java.io.InvalidClassException;
import java.util.function.Supplier;

public final class Result<OPERATION_RESULT> {

    private OPERATION_RESULT operationResult = null;

    private Exception exception = null;

    private boolean isSuccess = false;

    public Result(OPERATION_RESULT operationResult) {
        this.operationResult = operationResult;
        this.isSuccess = true;
    }

    public Result(Exception exception) {
        this.exception = exception;
    }

    public static <OPERATION_RESULT> Result<OPERATION_RESULT> of(Supplier<OPERATION_RESULT> supplier) {

        try {
            return new Result<>(supplier.get());
        } catch (Exception e) {
            return new Result<>(e);
        }
    }

    public OPERATION_RESULT getOperationResult() {
        return operationResult;
    }

    public boolean isSuccess() {

        return isSuccess && null == exception;

    }

    public Exception getException() {

        return (null != exception && !isSuccess) ? exception : new InvalidClassException("dfasd");

    }
}
