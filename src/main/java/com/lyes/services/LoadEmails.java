package com.lyes.services;

import java.util.List;

import com.lyes.model.Email;

public interface LoadEmails {

	public List<Email> loadEmails(String name) throws Exception ;
	
}
