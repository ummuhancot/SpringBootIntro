package com.tpe.repository;

import com.tpe.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //opsiyone yani : JPA REPOSITORY kullanıldığında repository kullanmaya gerek kalmaz ama yinede kullarınırız.
public interface SturdentRepository extends JpaRepository<Student,Long> {//STUDENT VE ID SİNİ VERDİK

    //override etmeye gerek yok
    //JpaRepositorydeki metodlar sprin tarafından otomatik olarak implemente edilir.





}
