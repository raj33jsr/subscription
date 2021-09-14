/**
 * 
 */
package com.salesubscription.service.salesubscriptionservice.rest.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.salesubscription.service.salesubscriptionservice.exception.BadRequestException;
import com.salesubscription.service.salesubscriptionservice.exception.BusinessViolationException;
import com.salesubscription.service.salesubscriptionservice.exception.ResourceNotFoundException;

/**
 * @author mahanraj
 *
 */
@RestControllerAdvice
public class SubscriptionExceptionHandler {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(SubscriptionExceptionHandler.class);
	// @JsonTypeInfo(use = Id.NONE)
	    public class ErrorInfo {

	        public final String code;

	        public String message;

	        public ErrorInfo(String code, String message) {
	            this.code = code;
	            this.message = message;
	        }

	        public ErrorInfo(String code) {
	            this.code = code;
	        }

	        @Override
	        public String toString() {
	            return "Code:" + code + ", message:" + message;
	        }
	    }
	 
	 @ExceptionHandler(value = Exception.class)
	 public ResponseEntity<ErrorInfo> defaultErrorHandler(Exception e) throws Exception {
		 LOGGER.debug("In defaultErrorHandler()");
	        ResponseStatus ann = null;
	        ErrorInfo error = null;
	        ResponseEntity<ErrorInfo> response = null;
	        try {
	            ann = AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class);
	            LOGGER.debug("In defaultErrorHandler() ann:" + ann);
	            if (ann == null) {
	                if (e instanceof HttpMessageNotReadableException) {
	                    LOGGER.error("ResponseStatus is NULL !! HttpMessageNotReadableException occured !!");
	                } else {
	                    LOGGER.error("ResponseStatus is NULL", e);
	                }
	                error = new ErrorInfo("Internal Server Error", "500");
	                return new ResponseEntity<ErrorInfo>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	            } else if (e instanceof BusinessViolationException) {
	                BusinessViolationException exception = ((BusinessViolationException) e);
	                error = new ErrorInfo(exception.getErrorCode(), exception.getMessage());
	            } else if (e instanceof BadRequestException) {
	                BadRequestException exception = ((BadRequestException) e);
	                error = new ErrorInfo(exception.getErrorCode(), exception.getMessage());
	            } else if (e instanceof ResourceNotFoundException) {
	                ResourceNotFoundException exception = ((ResourceNotFoundException) e);
	                error = new ErrorInfo(exception.getErrorCode(), exception.getMessage());
	            } else {
	                LOGGER.info("In defaultErrorHandler() :: No exception type matched !!");
	            }
	            LOGGER.info("In defaultErrorHandler() error:" + error);
	            response = new ResponseEntity<ErrorInfo>(error, ann.value());
	            if (response != null) {
	                LOGGER.debug("In defaultErrorHandler() created responseEntity:" + response);
	            }
	        } catch (Exception e1) {
	            LOGGER.error("Exception In defaultErrorHandler()", e);
	        }
	        return response;
		 
	 }


}
