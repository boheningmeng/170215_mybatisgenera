package cn.wan.sdutoa.mapper;

import cn.wan.sdutoa.po.JsjUser;
import cn.wan.sdutoa.po.JsjUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JsjUserMapper {
    long countByExample(JsjUserExample example);

    int deleteByExample(JsjUserExample example);

    int deleteByPrimaryKey(Long uid);

    int insert(JsjUser record);

    int insertSelective(JsjUser record);

    List<JsjUser> selectByExample(JsjUserExample example);

    JsjUser selectByPrimaryKey(Long uid);

    int updateByExampleSelective(@Param("record") JsjUser record, @Param("example") JsjUserExample example);

    int updateByExample(@Param("record") JsjUser record, @Param("example") JsjUserExample example);

    int updateByPrimaryKeySelective(JsjUser record);

    int updateByPrimaryKey(JsjUser record);
}