package com.shareknowledge.annotation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Emon Hossain on 8/27/2017.
 */
public class CustomEmailValidator implements ConstraintValidator<ValidEmail, String> {

	private Pattern pattern;
	private Matcher matcher;
	private static final String EMAIL_REGX = "^[_A-Za-z0-9-+]+(.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(.[A-Za-z0-9]+)*"
			+ "(.[A-Za-z]{2,})$";

	@Override
	public void initialize(ValidEmail validEmail) {

	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
		return isEmailValid(email);
	}

	private boolean isEmailValid(String email) {
		pattern = Pattern.compile(EMAIL_REGX);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}
}
