package com.example.pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

	private final CompanyRepository companyRepository;

	@Autowired
	public CompanyService(CompanyRepository companyRepository) {
		super();
		this.companyRepository = companyRepository;
	}

	public PageableResource<Company> getCompaniesPageableResource(Integer page, Integer size) {

		Pageable pageable = PageRequest.of(page, size);
		Page<Company> companies = companyRepository.findAll(pageable);

		return new PageableResource<>(companies.getContent(),
				companies.getTotalPages(),
				(int) companies.getTotalElements(),
				companies.getNumber());
	}
}
