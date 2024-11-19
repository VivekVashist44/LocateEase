package FindByPinCode.FindByPinCode.ApiResponce;


import java.util.ArrayList;


import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonProperty;

@Component
public class PinCodeApiResponce {
	 @JsonProperty("Message") 
	    public String message;
	    @JsonProperty("Status") 
	    public String status;
	    @JsonProperty("PostOffice") 
	    public ArrayList<PostOffice> postOffice;
	

		   public String getMessage() {
			return message;
		}


		public void setMessage(String message) {
			this.message = message;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public ArrayList<PostOffice> getPostOffice() {
			return postOffice;
		}


		public void setPostOffice(ArrayList<PostOffice> postOffice) {
			this.postOffice = postOffice;
		}


		@Override
		    public String toString() {
		        return "PinCodeApiResponce{" +
		                "message='" + message + '\'' +
		                ", status='" + status + '\'' +
		                ", postOffice=" + postOffice +
		                '}';
		    }
}






