package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Doc;
import com.example.demo.entity.facture;
import com.example.demo.service.DocStorageService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class DocController {

	@Autowired 
	private DocStorageService docStorageService;
	
	@GetMapping("/files")
	public List<Doc> get() {
		return docStorageService.getFiles();
		
		 
	}
	
	
	@RequestMapping(value="/uploadFiles",method=RequestMethod.POST)
	public ResponseEntity<String>  uploadMultipleFiles(@RequestParam("files") MultipartFile[] files){
		for (MultipartFile file: files) {
			docStorageService.saveFile(file);
			System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+file.getOriginalFilename());
			
		}
		return null;
	}
	
	/*@RequestMapping(value="/uploadFiles",method=RequestMethod.POST,consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<String>  uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
		
		String msg = "Files uploaded successfully";
	    return ResponseEntity.status(HttpStatus.OK).body(msg);
	}*/
	
	@GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId){
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+fileId);
		Doc doc = docStorageService.getFile(fileId).get();
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(doc.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getDocName()+"\"")
				.body(new ByteArrayResource(doc.getData()));
	}
	
}

