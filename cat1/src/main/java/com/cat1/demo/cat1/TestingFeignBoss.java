package com.cat1.demo.cat1;

import com.cat1.demo.cat1.models.Company;
import com.cat1.demo.cat1.models.Student;
import org.springframework.stereotype.Component;

@Component
public class TestingFeignBoss {
    private final FeignBoss feignBoss;

    public TestingFeignBoss(FeignBoss feignBoss) {
        this.feignBoss = feignBoss;
    }

    public void run(String... args) throws Exception{
        Student student = new Student("092209", "Nicole");
        feignBoss.createStudent(student);

        Company company = new Company(student,"Naturals");
        feignBoss.createCompany(company, "092209");
    }

}
