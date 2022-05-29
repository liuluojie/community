package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author liuluojie
 * @date 2022/5/24 14:03
 */
@Mapper
public interface DiscussPostMapper {

    /**
     *
     * @param userId
     * @param offset
     * @param limit
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * (@Param)注解用于给参数取别名,
     * 如果只有一个参数, 并且在<if>里使用,则必须加别名.
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

}
