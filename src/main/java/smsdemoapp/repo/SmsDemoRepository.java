package smsdemoapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import smsdemoapp.entity.SmsDemoDetail;

@Component
public interface SmsDemoRepository extends JpaRepository<SmsDemoDetail, Long>{

	
	
}
