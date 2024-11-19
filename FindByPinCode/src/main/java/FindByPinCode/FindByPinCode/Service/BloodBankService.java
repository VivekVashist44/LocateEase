package FindByPinCode.FindByPinCode.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FindByPinCode.FindByPinCode.Entity.BloodBank;
import FindByPinCode.FindByPinCode.Repository.BloodBankRepository;

@Service
public class BloodBankService {

	@Autowired
	BloodBankRepository repo;;
	
	
	public List<BloodBank> getAllBloodBankByPincode(String pinCode){
		 return repo.findBypincode(pinCode);
	}
}
