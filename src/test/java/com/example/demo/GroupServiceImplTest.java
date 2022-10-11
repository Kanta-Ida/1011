package com.example.demo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class GroupServiceImplTest {

	@MockBean
	private GroupRepository groupRepository;

	@Test
	public void findByNoTest() throws Exception {
		//groupRepositoryをモックにして、findByNoが機能するか？のテスト
		when(groupRepository.selectByNo("100")).thenReturn("佐藤");
		GroupService groupService = new GroupServiceimpl(groupRepository);
		String employee = groupService.findByNo("100");
		assertEquals(employee, "佐藤");

	}

}
