package com.alti.ems.repository;

import com.alti.ems.entity.empEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import static javax.swing.SwingConstants.NEXT;
import static javax.swing.text.html.HTML.Tag.SELECT;
import static org.hibernate.grammars.hql.HqlParser.*;
import static org.springframework.data.domain.Sort.Direction.DESC;

    public interface EmpRepository extends JpaRepository<empEntity, Long> {

//        @Query("SELECT e FROM empEntity e WHERE e.projectName = :projectName " +
//                "AND e.totalExperienceInYears = (SELECT MAX(e2.totalExperienceInYears) " +
//                "FROM empEntity e2 WHERE e2.projectName = :projectName AND e2.totalExperienceInYears < (SELECT MAX(e3.totalExperienceInYears) " +
//                "FROM empEntity e3 WHERE e3.projectName = :projectName))")

        @Query(
                "SELECT e FROM empEntity e " + "WHERE (SELECT COUNT(DISTINCT e2.totalExperienceInYears) "
                        + "FROM empEntity e2 " + "WHERE e2.projectName = e.projectName AND e2.totalExperienceInYears >= e.totalExperienceInYears) = 2"
        )


        List<empEntity> findSecondMostExperiencedEmployeeInEachProject();

    }


