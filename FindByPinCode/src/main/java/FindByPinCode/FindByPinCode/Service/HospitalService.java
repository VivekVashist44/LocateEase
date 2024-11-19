package FindByPinCode.FindByPinCode.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FindByPinCode.FindByPinCode.Entity.HospitalEntity;
import FindByPinCode.FindByPinCode.Repository.HospitalRepository;


@Service
public class HospitalService {

	@Autowired
	HospitalRepository repo;
	
	public List<HospitalEntity>getHospitalBypincode(String pincode) {
		List<HospitalEntity> list= repo.findBypinCode(pincode);
		return list;
		
	}
	
}
