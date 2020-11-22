package smsdemoapp.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import smsdemoapp.DTO.SmsDemoDTO;
import smsdemoapp.entity.SmsDemoDetail;
import smsdemoapp.repo.SmsDemoRepository;

@Service
public class SmsDemoService {
	
	@Autowired
	public SmsDemoRepository smsDemoRepository;
	
	public List<SmsDemoDTO> getDetails(){
		List<SmsDemoDetail> smsDemoDetails= new ArrayList<SmsDemoDetail>();
		List<SmsDemoDTO> smsDemoDTOs= new ArrayList<SmsDemoDTO>();
		try {
			smsDemoDetails= smsDemoRepository.findAll();
			for(SmsDemoDetail sms: smsDemoDetails) {
				SmsDemoDTO smsDemoDTO= new SmsDemoDTO();
				smsDemoDTO = toDTO(sms);
				smsDemoDTOs.add(smsDemoDTO);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return smsDemoDTOs;
	}
	
	private SmsDemoDTO toDTO(SmsDemoDetail smsDemoDetail){
		SmsDemoDTO smsDemoDto = new SmsDemoDTO();
		smsDemoDto.setId(smsDemoDetail.getId());
		smsDemoDto.setCity(smsDemoDetail.getCity());
		smsDemoDto.setPrice(smsDemoDetail.getPrice());
		smsDemoDto.setStartDate(smsDemoDetail.getStartDate());
		smsDemoDto.setEndDate(smsDemoDetail.getEndDate());
		smsDemoDto.setStatus(smsDemoDetail.getStatus());
		smsDemoDto.setColor(smsDemoDetail.getColor());
		return smsDemoDto;
	}

}
