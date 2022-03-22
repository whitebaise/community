package com.nowcoder.community.service;

import com.nowcoder.community.dao.DiscussPostMapper;
import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface DiscussPostService {

    List<DiscussPost> findDiscussPosts(int userId,int offset,int limit);

     public int findDiscussPostRows(@Param("userId") int userId);

}
