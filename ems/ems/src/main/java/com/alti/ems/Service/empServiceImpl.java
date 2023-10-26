package com.alti.ems.Service;

import com.alti.ems.entity.empEntity;
import com.alti.ems.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empServiceImpl implements IEmpService {


        @Autowired

        private EmpRepository empRepository;


    @Override
        public List<empEntity> getEmployeeAllocationByExperience() {
            return empRepository.findSecondMostExperiencedEmployeeInEachProject();
        }
}

