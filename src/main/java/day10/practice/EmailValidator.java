package day10.practice;

import java.util.regex.Pattern;

class InvalidEmailException extends Exception {

	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public InvalidEmailException(String msg) {
		super(msg);
	}

	public InvalidEmailException(Throwable te) {
		super(te);
	}

	public InvalidEmailException(String msg, Throwable te) {
		super(msg, te);
	}
}

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		
		String pattern = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        boolean isMatch = pattern.matches(emailId);

		
		if(emailId == null || "".equals(emailId)) {
			throw new InvalidEmailException("Email Id Can Not Be Null Or Empty");
		}
		if(!isMatch) {
			throw new InvalidEmailException("Email Id Can Not Be Null Or Empty");
		}
		return true;
	}
}
