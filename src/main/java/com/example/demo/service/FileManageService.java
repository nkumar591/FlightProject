/**
 * 
 */
package com.example.demo.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import com.example.demo.exception.FileException;

/**
 * @author AAdarsh
 *
 */
@Service
public class FileManageService {

	public String downloadFile() {
		String message = "";
		try (BufferedInputStream in = new BufferedInputStream(
				new URL("https://file-examples-com.github.io/uploads/2017/02/file_example_CSV_5000.csv").openStream());
				FileOutputStream fileOutputStream = new FileOutputStream("D:/sampleFile.csv")) {
			byte dataBuffer[] = new byte[1024];
			int bytesRead;
			while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
				fileOutputStream.write(dataBuffer, 0, bytesRead);
			}
			message = "File downloaded successfully in 'D:/' folder";
		} catch (IOException e) {
			e.printStackTrace();
			// Custom Exception
			throw new FileException("Exception occured, please check the logs.");
		}
		return message;
	}

	public String deleteFile() {
		String message = "";
		try {
			File f = new File("D:/sampleFile.csv");
			if (f.delete()) {
				message = "File: "+ f.getName() + " deleted";
			} else {
				message = "File not found.";
			}
		} catch (Exception e) {
			e.printStackTrace();
			// Custom Exception
			throw new FileException("Exception occured, please check the logs.");
		}
		return message;
	}

	public String copyFile() {
		String message = "";
		File original = new File("D:/sampleFile.csv");
		File copied = new File("D:/sampleFile_copy.csv");
		try {
			FileUtils.copyFile(original, copied);
			message = "File copied successfully in 'D:/' folder. OriginalFileName - "
					+ "sampleFile.csv :: CopiedFileName - sampleFileCopied.csv";
		} catch (IOException e) {
			e.printStackTrace();
			// Custom Exception
			throw new FileException("Exception occured, please check the logs.");
		}
		return message;
	}
}
