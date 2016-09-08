package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
	
	public final String value;
	private boolean isPrivate;

	public Contact(String contact, boolean isPrivate, String CONTACT_MESSAGE_CONSTRAINTS, String CONTACT_VALIDATION_REGEX) throws IllegalValueException {
		this.isPrivate = isPrivate;
		contact = contact.trim();
		if(!isValidContact(contact, CONTACT_VALIDATION_REGEX)) {
			throw new IllegalValueException(CONTACT_MESSAGE_CONSTRAINTS);
		}
		this.value = contact;
	}
	
	public static boolean isValidContact(String test, String CONTACT_VALIDATION_REGEX) {
		return test.matches(CONTACT_VALIDATION_REGEX);
	}
	
	@Override
	public String toString() {
		return value;
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean isPrivate() {
		return isPrivate;
	}
}
