/*package com.cat1.demo;

import com.cat1.demo.cat1.models.Appointment;
import com.cat1.demo.cat1.models.AppointmentDto;
import com.cat1.demo.cat1.models.Student;
import com.cat1.demo.cat1.models.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "client", url = "http://localhost:1000")
public interface FeignMockClient {
    @RequestMapping(method = {RequestMethod.POST}, value = {"students"})
    Student registerStudent(@RequestBody Student student);

    Appointment createAppointment();

    Student findById(@RequestParam(name="studentNumber") String var1);

    @RequestMapping(method = {RequestMethod.POST}, value = {"/appointments"})
    AppointmentDto createAppointment(@RequestBody Teacher teacher_id, @RequestParam(name = "studentId") Long var1);

    Appointment confirmAppointment(@PathVariable(name = "id") Long var1, @RequestParam(name = "studentId") Long var2);
}
*/