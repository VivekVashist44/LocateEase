package FindByPinCode.FindByPinCode.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import FindByPinCode.FindByPinCode.ApiResponce.PinCodeApiResponce;
import FindByPinCode.FindByPinCode.ApiResponce.CGHS.Root;

@Service
public class CGHSService {
//	 private static final String API = "https://api.data.gov.in/resource/de59e770-2333-4eaf-9088-a3643de040c8?api-key=579b464db66ec23bdd000001cdd3946e44ce4aad7209ff7b23ac571b&format=json&limit=800&filters[cityName]=state'";
	private static final String API_TEMPLATE = "https://api.data.gov.in/resource/de59e770-2333-4eaf-9088-a3643de040c8" +
            "?api-key=%s" +
            "&format=json" +
            "&limit=900" +
            "&filters[cityName]=%s";

private static final String API_KEY = "579b464db66ec23bdd000001db55c57c1ea642e1716f81959b287e94";
	@Autowired
	PinCodeApiResponce pinCodeApiResponce;
	@Autowired
    RestTemplate restTemplate;
	
	 public Root getState() {
	        if (pinCodeApiResponce == null || pinCodeApiResponce.getPostOffice() == null || pinCodeApiResponce.getPostOffice().isEmpty()) {
	            throw new IllegalStateException("Invalid pin code API response");
	        }

	        String state = pinCodeApiResponce.getPostOffice().get(0).getState();
	        
	        String encodedState = java.net.URLEncoder.encode(state, java.nio.charset.StandardCharsets.UTF_8);
	        String url = String.format(API_TEMPLATE, API_KEY, encodedState);
	        System.out.println("Fetching data from URL: " + url);
//	        String url = API.replace("state", state);

	      //  System.out.println(url);

	        HttpHeaders headers = new HttpHeaders();
	        headers.set("Accept", "application/json");

	        // Create an HttpEntity with the headers
	        HttpEntity<String> entity = new HttpEntity<>(headers);

	        try {
	            ResponseEntity<Root> response = restTemplate.exchange(url, HttpMethod.GET, entity, Root.class);
	            Root data = response.getBody();

	            if (data != null) {
	                System.out.println(data.toString());
	            }

	            return data;

	        } catch (Exception e) {
	            // Handle exceptions such as HttpClientErrorException, HttpServerErrorException, etc.
	            e.printStackTrace();
	            // Return null or a default Root object, or rethrow the exception
	            return null;
	        }
	    }
	 }

