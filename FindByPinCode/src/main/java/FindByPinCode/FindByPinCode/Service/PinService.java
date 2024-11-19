package FindByPinCode.FindByPinCode.Service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import FindByPinCode.FindByPinCode.ApiResponce.PinCodeApiResponce;

@Service
public class PinService {

    @Autowired
    private RestTemplate restTemplate;
    private static final  String ApiPostoffice="https://api.postalpincode.in/postoffice/";

    private static final String API = "https://api.postalpincode.in/pincode/"; // Replace with your actual API

    public PinCodeApiResponce getPostOffice(String pin) {
        String url = API  + pin;
        System.out.println(url);

        ResponseEntity<PinCodeApiResponce[]> response = restTemplate.exchange(url, HttpMethod.GET, null, PinCodeApiResponce[].class);
        System.out.println("Raw Response: " + Arrays.toString(response.getBody()));

        PinCodeApiResponce[] dataArray = response.getBody();
        if (dataArray != null && dataArray.length > 0) {
        	return dataArray[0];
        	
            
        } else {
            return null;
        }
    }
    public PinCodeApiResponce getPostOfficeByRegion(String regionName) {
        String url = ApiPostoffice  + regionName;
       // System.out.println(url);

        ResponseEntity<PinCodeApiResponce[]> response = restTemplate.exchange(url, HttpMethod.GET, null, PinCodeApiResponce[].class);
       // System.out.println("Raw Response: " + Arrays.toString(response.getBody()));

        PinCodeApiResponce[] dataArray = response.getBody();
        if (dataArray != null && dataArray.length > 0) {
        	return dataArray[0];
        	
            
        } else {
            return null;
        }
    }

	
}

