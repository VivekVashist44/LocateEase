package FindByPinCode.FindByPinCode.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import FindByPinCode.FindByPinCode.Entity.HospitalEntity;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalEntity, Long> {
	
	public List<HospitalEntity> findBypinCode(String pinCode);
}
