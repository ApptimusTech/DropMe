package com.apptimus.dropme.others;

public class ValueValidator {
	
	/**
	 * Method that validates plain text is it is empty or null
	 * @param value: Value to be validated
	 * @param label: Label to show which field is being validated
	 * @return: Generic reult with message and status
	 */
	public static GenericResult validateText(String value, String label)
	{
		GenericResult result = new GenericResult();
		
		if(value == null || "".equals(value))
		{
			result.setMessage(label + " " + MessageConstant.MSG_EMPTY);
			result.setStatus(false);
		}
		else
		{
			result.setMessage("");
			result.setStatus(true);
		}
		return result;
	}
}
