package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvalidEmailExceptionTest {

	 @Test
	    public void testIsValidEmail_ValidEmail() {
	        String validEmail = "aravind@gmail.com";
	        Assertions.assertDoesNotThrow(() -> EmailValidator.isValidEmail(validEmail));
	    }

	    @Test
	    public void testIsValidEmail_EmptyEmail() {
	        Assertions.assertThrows(InvalidEmailException.class, () -> EmailValidator.isValidEmail(""));
	    }

	    @Test
	    public void testIsValidEmail_InvalidFormat() {
	        Assertions.assertThrows(InvalidEmailException.class, () -> EmailValidator.isValidEmail("aravind.ram"));
	    }
	    
}
