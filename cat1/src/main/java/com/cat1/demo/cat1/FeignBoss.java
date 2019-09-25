package com.cat1.demo.cat1;

import com.cat1.demo.cat1.models.Company;
import com.cat1.demo.cat1.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "client", url = "http://10.51.10.111:2000")
public interface FeignBoss {
    @RequestMapping(method = {RequestMethod.POST}, value = {"students"})
    Student createStudent(@RequestBody Student student);

    @RequestMapping(method = {RequestMethod.POST}, value = {" companies/{companyId}/attachments"})
    Company createCompany(@RequestBody Company company, @RequestParam (name="studentNumber") String number);

    @RequestMapping
    Company confirmCompany(@PathVariable(name = "id") Long var1, @RequestParam(name = "studentId") Long var2);

    @RequestMapping(method = {RequestMethod.PATCH}, value = {" companies/{companyId}/attachments"})
    Company createDepartment();
}
