package com.main.code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IPValidationRegex {

	    // Text file located in resources folder.
		private static final String FILE_NAME = "src/com/main/resources/Sample.txt";
		// Regular Expression
		private static final String IPADDRESS_PATTERN =
				"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
				"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		
		public static void main(String[] args) {
					
			List<String> invalidIpList = new ArrayList<String>();

			try (Stream<String> stream = Files.lines(Paths.get(FILE_NAME))) {

				// Filter all invalid ip addresses
				// and add to invalidIpList
				invalidIpList = stream.filter(line -> !line.matches(IPADDRESS_PATTERN))
						.collect(Collectors.toList());


			} catch (IOException e) {
				e.printStackTrace();
			}
			
			for (String ip: invalidIpList) {
				System.out.println(ip + " : Invalid");
			}

			
		}
}
