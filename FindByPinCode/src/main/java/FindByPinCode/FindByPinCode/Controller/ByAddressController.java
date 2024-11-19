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
@RequestMapping("/region")
public class ByAddressController {
	 PinCodeApiResponce pinCodeResponce;
	 PinService pinService;
	 
	 public ByAddressController( PinCodeApiResponce pinCodeResponce, PinService pinService) {
		 this.pinCodeResponce=pinCodeResponce;
		 this.pinService=pinService;
	 }
		
	 
	 @GetMapping("/{regionName}")
	 public ResponseEntity<?> getByRegion(@PathVariable("regionName") String regionName){
		 PinCodeApiResponce data=pinService.getPostOfficeByRegion(regionName);
		 pinCodeResponce.setPostOffice(data.postOffice);
		return new ResponseEntity<>(data,HttpStatus.ACCEPTED);

	 }
	 @GetMapping("/{regionName}/getAllPostOffice")
	 public ResponseEntity<?> getAllPostOfficeByRegion(@PathVariable("regionName") String regionName){
		 PinCodeApiResponce data=pinService.getPostOfficeByRegion(regionName);
		return new ResponseEntity<>(data.getPostOffice(),HttpStatus.ACCEPTED);
	 }
}
