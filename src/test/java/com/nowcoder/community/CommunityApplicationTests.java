package com.nowcoder.community;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;


@SpringBootTest
class CommunityApplicationTests {


	@Autowired
	public DiscussPostMapper discussPostMapper;
	@Test
	void contextLoads() {

	}
	@Test
	void DiscussPoseTest(){
		List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPost(0, 0, 5);
		for (DiscussPost post:discussPosts) {
			System.out.println(post);
		}
		int i = discussPostMapper.selectDiscussPostRows(0);
		System.out.println(i);

	}

}
