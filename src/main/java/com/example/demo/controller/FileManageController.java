/**
 * @author AAdarsh
 *
 */
package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FileManageService;

/**
 * @author AAdarsh
 *
 */
@RestController
@RequestMapping(value = "/file")
public class FileManageController {

	@Autowired
	private FileManageService fileManageService;

	@GetMapping("/download")
	public String downloadFile() {
		
		return this.fileManageService.downloadFile();
	}
	
	@GetMapping("/delete")
	public String deleteFile() {
		
		return this.fileManageService.deleteFile();
	}

	@GetMapping("/copy")
	public String copyFile() {
		
		return this.fileManageService.copyFile();
	}
	
}
