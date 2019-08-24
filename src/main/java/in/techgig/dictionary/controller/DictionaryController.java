package in.techgig.dictionary.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/API")
public class DictionaryController {

	
	@GetMapping(value="/find")
	public boolean isPresent(@RequestParam String word) {
		return false;
	}
	
	@PostMapping("/upload")
	public ResponseEntity<Object> uploadFile(){
		return new ResponseEntity<Object>(null);
	}
}
