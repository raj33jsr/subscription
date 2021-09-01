/**
 * 
 */
package com.salesubscription.service.salesubscriptionservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author mahanraj
 *
 */
@ResponseStatus(value = HttpStatus.CONFLICT , reason = "Business Violation")
public class BusinessViolationException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * This is the error code identifying the error.
     */
    private String errorCode = null;

    /**
     * Constructs a new exception with <code>null</code> as its detail message.
     */
    public BusinessViolationException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.
     * 
     * @param inErrorCode
     *            the error code identifying the error.
     * @param message
     *            the detail message. The detail message is saved for later retrieval by the Throwable.getMessage()
     *            method.
     */
    public BusinessViolationException(final String inErrorCode, final String message) {
        super(message);
        this.errorCode = inErrorCode;
    }

    /**
     * Constructs a new exception with the specified error code.
     * 
     * @param inErrorCode
     *            the error code.
     */
    public BusinessViolationException(final String inErrorCode) {
        super(inErrorCode);
        this.errorCode = inErrorCode;
    }

    /**
     * This method is responsible for returning the error code.
     * 
     * @return An int containing the error code.
     */
    public final String getErrorCode() {
        return errorCode;
    }

}