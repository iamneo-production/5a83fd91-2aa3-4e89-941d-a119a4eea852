package com.examly.springapp;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
	@Transactional
    public void BE_Add_Booking() throws Exception {
        String newProduct = "{\"bookingId\":\"01\",\"patientDetail\":\"tester\",\"doctorDetail\":\"doctor1\",\"hospitalName\":\"XYZ\",\"date\":\"20.10.2021\",\"time\":\"03:00PM\",\"bookingStatus\":\"true\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/booking")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newProduct)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
	
	@Test
	@Transactional
    public void BE_Get_AllDoctors() throws Exception {
	 	mockMvc.perform(MockMvcRequestBuilders.get("/doctor")
		.contentType(MediaType.APPLICATION_JSON)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
		.andReturn();
    }

	@Test
	@Transactional
    public void BE_Add_Prescription() throws Exception {
        String newCart = "{\"prescriptionID\":\"PID001\",\"userId\":\"05\",\"date\":\"10.10.2021\",\"description\":\"fever\",\"issuedBy\":\"user1\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/doctor/prescription")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newCart)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }

	@Test
	@Transactional
    public void BE_Delete_Prescription() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/doctor/prescription")
		.param("prescriptionID","PID001")
		.contentType(MediaType.APPLICATION_JSON)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
	
}
