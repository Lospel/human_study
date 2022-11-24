package com.study.springboot;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class ContentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return ContentDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		ContentDto dto = (ContentDto)target;
		
//		String sWriter = dto.getWriter();
//		if(sWriter == null || sWriter.trim().isEmpty()) {
//			System.out.println("Writer is null or empty");
//			errors.rejectValue("writer", "trouble");
//		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "writer", "writer is empty");
		String sWriter = dto.getWriter();
		if (sWriter.length() < 3) {
			errors.rejectValue("writer", "writer필드가 너무 짧습니다.");
		}
		
//		String sContent=dto.getContent();
//		if(sContent==null || sContent.trim().isEmpty()) {
//			System.out.println("Content is null or empty");
//			errors.rejectValue("content", "trouble");
//		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "content", "content가 비어있습니다.");
		
	}

}
