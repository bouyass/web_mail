package com.lyes.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Component;

import com.lyes.model.Email;

@Component("fileLoader")
public class LoadEmailsFromFile implements LoadEmails{

	@Override
	public List<Email> loadEmails(String name) throws Exception {

			List<Email> emails = new ArrayList<Email>();
			Email email;
			Scanner scanner = new Scanner(new File("files/"+name+".txt"));
			String line = "";
			String ligne = "";
			String message = "";
			String ligne1 = "";
			String ligne2 = "";
			boolean newEmail = true;
			boolean endMessage = false;
			SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
			Date date;
			String datee;

			while (scanner.hasNext()) {
				line = scanner.nextLine();
				// reciever and sender information
				if (line.startsWith("From")) {
					email = new Email();
					newEmail = true;
					email.setReciever("karim");
					email.setRecieverEmail("karim@lyes.dz");
					while (scanner.hasNext() && newEmail == true) {
						
							ligne2 = scanner.nextLine();
							String[] parts = line.split(" ");
							String[] parts1 = parts[1].split("@");
							email.setSender(parts1[0]);
							email.setSenderEmail(parts[1] + ".dz");
							
						
						while (scanner.hasNext() && newEmail == true) {
							
							ligne = scanner.nextLine();
							// Subject
							if (ligne.startsWith("Subject")) {
								String[] parts2 = ligne.split(":");
								email.setSubject(parts2[1]);
							}

							// date
							if (ligne.startsWith("Date")) {
								datee = (String) ligne.subSequence(6, ligne.length() - 7);
								date = (Date) sdf.parse(datee);
								email.setDate(date);
							}
							
							// message
							if(ligne.startsWith("From:")) {
								while( scanner.hasNext() && newEmail == true ) {
									ligne1 = scanner.nextLine();
									message += ligne1;
									if(ligne1.startsWith("From")) {
										break;
									}
								}
								email.setMessage(message);
								newEmail = false;
								emails.add(email);
							}
						}
					}
				}
			}
			return emails;
		}
}
