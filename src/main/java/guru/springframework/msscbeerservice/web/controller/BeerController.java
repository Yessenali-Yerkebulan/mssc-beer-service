package guru.springframework.msscbeerservice.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import guru.springframework.msscbeerservice.web.model.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
		//todo impl
		return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
	}
	
	@PostMapping
	pubilc ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
		//todo impl
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	
}
