package FindByPinCode.FindByPinCode.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import FindByPinCode.FindByPinCode.ApiResponce.PinCodeApiResponce;
import FindByPinCode.FindByPinCode.Service.PinService;




@Controller
@RequestMapping("/pin")
public class pinCodeController {
 PinCodeApiResponce pinCodeResponce;
 PinService pinService;
 
 public pinCodeController( PinCodeApiResponce pinCodeResponce, PinService pinService) {
	 this.pinCodeResponce=pinCodeResponce;
	 this.pinService=pinService;
 }
	
 
 @GetMapping("/{pin}")
 public ResponseEntity<?> getByPincode(@PathVariable("pin") String pin){
	 PinCodeApiResponce data=pinService.getPostOffice(pin);
	 pinCodeResponce.setPostOffice(data.postOffice);
	return new ResponseEntity<>(data,HttpStatus.ACCEPTED);

 }
 @GetMapping("/{pin}/getAllPostOffice")
 public ResponseEntity<?> getAllPostOffice(@PathVariable("pin") String pin){
	 PinCodeApiResponce data=pinService.getPostOffice(pin);
	return new ResponseEntity<>(data.getPostOffice(),HttpStatus.ACCEPTED);
 }

}
