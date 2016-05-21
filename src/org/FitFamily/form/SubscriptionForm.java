package org.FitFamily.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.FitFamily.model.User;

public class SubscriptionForm {
	private static final String FIELD_PSEUDO = "pseudo";
	private static final String FIELD_EMAIL = "email";
	private static final String FIELD_PASSWORD = "password";
	private static final String FIELD_CONFIRM = "password-confirmation";
	private static final String FIELD_GTU = "gtu";
	private String result;
    private Map<String, String> errors = new HashMap<String, String>();
    
    public String getResult() {
    	return result;
    }
    public Map<String, String> getErrors() {
    	return errors;
    }
    
    public User addUser(HttpServletRequest request){
    	String pseudo = getFieldValue(request, FIELD_PSEUDO);
    	String email = getFieldValue(request, FIELD_EMAIL);
		String password = getFieldValue(request, FIELD_PASSWORD);
		String confirmation = getFieldValue(request,FIELD_CONFIRM);
		
		User user = new User();
		
		try {
			validatePseudo(pseudo);
		} catch(Exception e) {
			setError(FIELD_PSEUDO, e.getMessage());
		}
		user.setPseudo(pseudo);
		
		try {
			validateEmail(email);
		} catch(Exception e) {
			setError(FIELD_EMAIL, e.getMessage());
		}
		user.setEmail(email);
		
		try {
			validatePassword(password, confirmation);
		} catch(Exception e) {
			setError(FIELD_PASSWORD, e.getMessage());
			setError(FIELD_CONFIRM, null);
		}
		user.setPassword(password);
		
		if(errors.isEmpty()) {
			result = "Success!";
		} else {
			result = "Subscription failed!";
		}
		
		return user;
    }
    
    
    /* Field validation functions */
    private void validatePseudo(String pseudo) throws Exception {
    	if(pseudo == null || pseudo.trim().length() == 0){
    		throw new Exception("Please enter a pseudo.");
    	}
    	else {
    		if(pseudo != null && pseudo.trim().length() < 3){
    			throw new Exception("Pseudo should be at least 3 characters long.");
    		}
    	}
    }
    
    private void validateEmail(String email) throws Exception {
    	if ( email != null && email.trim().length() != 0 ) {
            if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
                throw new Exception( "Please enter a valid email address." );
            }
        } else {
            throw new Exception( "Please enter an email address." );
        }
    }
    
    private void validatePassword(String password, String confirmation) throws Exception {
    	if (password != null && password.trim().length() != 0 && confirmation != null && confirmation.trim().length() != 0) {
            if (!password.equals(confirmation)) {
                throw new Exception("Typed passwords are different. Please try again.");
            } else if (password.trim().length() < 3) {
                throw new Exception("Password should be at least 3 characters long.");
            }
        } else {
            throw new Exception("Please enter and confirm your password.");
        }
    }
    
    
    /* Tools */
    private void setError( String field, String message ) {
        errors.put( field, message );
    }
    
    private static String getFieldValue( HttpServletRequest request, String fieldName ) {
        String value = request.getParameter( fieldName );
        if ( value == null || value.trim().length() == 0 ) {
            return null;
        } else {
            return value.trim();
        }
    }
}
