package FindByPinCode.FindByPinCode.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import FindByPinCode.FindByPinCode.Entity.BloodBank;

@Repository
public interface BloodBankRepository extends JpaRepository<BloodBank, Long> {

	public List<BloodBank> findBypincode(String pinCode);
}
