package com.rajputLife.controller;

import com.rajputLife.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
	public class SearchController {
    @Autowired
	SearchService searchService;

//    http://localhost:8080/name?id=1

//    @RequestMapping(value = "/name", method=RequestMethod.GET, produces = {"application/json"})
//    @ResponseBody
//    public ResponseEntity<String> getName(int id) throws UserNotFoundException {
////        if(id == 1) throw new UserNotFoundException("user not found");
//        String name = searchService.findFirstNameOfPerson(id);
//		Integer.parseInt("432432dd");
//        return new ResponseEntity<String>(name, HttpStatus.OK);
////        return searchService.findFirstNameOfMale(id);
//    }



	//    http://localhost:8080/name?id=1
//	@RequestMapping(value = "/name", method=RequestMethod.GET, produces = {"application/json"})
//	@ResponseBody
//	public ResponseEntity<String> getName(int id) throws UserNotFoundException {
////        if(id == 1) throw new UserNotFoundException("user not found");
//		String name = searchService.findFirstNameOfPerson(id);
//		Integer.parseInt("432432dd");
//		return new ResponseEntity<String>(name, HttpStatus.OK);
////        return searchService.findFirstNameOfMale(id);
//
//		try {
//			Foo resourceById = RestPreconditions.checkFound(searchService.findFirstNameOfPerson(id));
//			return resourceById;
//		}
//		catch (MyResourceNotFoundException exc) {
//			throw new ResponseStatusException(
//					HttpStatus.NOT_FOUND, "Foo Not Found", exc);
//		}
//	}



}
