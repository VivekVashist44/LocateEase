package FindByPinCode.FindByPinCode.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import FindByPinCode.FindByPinCode.Entity.BloodBank;
import FindByPinCode.FindByPinCode.Service.BloodBankService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500") // Your frontend URL
public class BloodBankController {

	@Autowired
	BloodBankService service;
	
	@GetMapping("/pin/{pincode}/getAllBloodBank")
	public ResponseEntity<?> getAllBloodBankByPincode(@PathVariable("pincode") String pincode){
		
		List<BloodBank> list= service.getAllBloodBankByPincode(pincode);
		
		return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
		
		
	}
}
