package FindByPinCode.FindByPinCode.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import FindByPinCode.FindByPinCode.ApiResponce.PinCodeApiResponce;
import FindByPinCode.FindByPinCode.ApiResponce.CGHS.Root;
import FindByPinCode.FindByPinCode.Service.CGHSService;
import FindByPinCode.FindByPinCode.Service.PinService;

@Controller
public class CGHSController {
	 PinCodeApiResponce pinCodeResponce;
	 PinService pinService;
	 CGHSService cghsService;
	 
	 public CGHSController( PinCodeApiResponce pinCodeResponce, PinService pinService,CGHSService cghsService) {
		 this.pinCodeResponce=pinCodeResponce;
		 this.pinService=pinService;
		 this.cghsService=cghsService;
	 }
	 @GetMapping("/pin/{pin}/CGHSHospital")
	public ResponseEntity<?> getAllCGHSHospitalByState(){
		 Root data=cghsService.getState();
		 return new ResponseEntity<>(data,HttpStatus.ACCEPTED);
	 }
	 @GetMapping("/region/{regionName}/CGHSHospital")
		public ResponseEntity<?> getAllCGHSHospitalByStateByRegionName(){
			 Root data=cghsService.getState();
			 return new ResponseEntity<>(data,HttpStatus.ACCEPTED);
		 }
	 
	 
	 
}
