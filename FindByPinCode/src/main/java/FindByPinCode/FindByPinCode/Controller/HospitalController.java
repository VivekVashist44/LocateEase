package FindByPinCode.FindByPinCode.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import FindByPinCode.FindByPinCode.Entity.HospitalEntity;
import FindByPinCode.FindByPinCode.Service.HospitalService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500") // Your frontend URL
public class HospitalController {
    @Autowired
	HospitalService service;
    
    @GetMapping("/pin/{pinCode}/getHospital")
    @ResponseBody
    public ResponseEntity<?> getHospitalByPincode(@PathVariable("pinCode") String pinCode)  {
    	
    	List<HospitalEntity> list=service.getHospitalBypincode(pinCode);
    	
    	return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    	
    	
    }
	
}
