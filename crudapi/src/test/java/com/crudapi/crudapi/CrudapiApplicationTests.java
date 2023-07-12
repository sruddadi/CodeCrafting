package com.crudapi.crudapi;

import com.crudapi.crudapi.Controller.UserDetails;
import com.crudapi.crudapi.Resource.ResourceAPI;
import com.crudapi.crudapi.Service.ServiceAPI;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class CrudapiApplicationTests {

	private ResourceAPI resourceAPI;
	private List<UserDetails> dataList;

	@BeforeEach
	public void setUp() {
		dataList = new ArrayList<>();
		resourceAPI = new ResourceAPI(new ServiceAPI(dataList));
	}

	@Test
	public void testGetAllData() {
		List<UserDetails> result = resourceAPI.getAllData();
		assertEquals(dataList, result);
	}

	@Test
	public void testGetData() {
		UserDetails userDetails = new UserDetails("srikar", "01-01-2022", "sagar","teksystems", "mani",90,"java");
		dataList.add(userDetails);

		List<UserDetails> result = resourceAPI.getData("teksystems");
		assertEquals(List.of(userDetails), result);
	}

	@Test
	public void testAddData() {
		UserDetails userDetails = new UserDetails("srikar", "01-01-2022", "sagar","teksystems", "mani",90,"java");
		resourceAPI.addData(userDetails);

		assertEquals(List.of(userDetails), dataList);
	}

	@Test
	void testDeleteData_SuccessfulDeletion() {

		String idToDelete = "123";
		UserDetails user1 = new UserDetails("123", "srikar", "01-01-2022", "sagar","teksystems", "mani",90,"java");
		UserDetails user2 = new UserDetails("456", "srikar", "01-01-2022", "sagar","teksystems", "mani",90,"java");
		dataList.add(user1);
		dataList.add(user2);
		resourceAPI.deleteData(idToDelete);
		Assertions.assertEquals(1,dataList.size());
	}

	@Test
	public void testUpdateData() {
		UserDetails userDetails = new UserDetails("srikar", "01-01-2022", "sagar","teksystems", "mani",90,"java");
		dataList.add(userDetails);

		UserDetails updatedUserDetails = new UserDetails("manasa", "01-01-2022", "sagar","teksystems", "mani",90,"java");
		resourceAPI.updateData(0, updatedUserDetails);

		assertEquals(updatedUserDetails, dataList.get(0));
	}

}
