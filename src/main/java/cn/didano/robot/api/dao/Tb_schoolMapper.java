package cn.didano.robot.api.dao;

import cn.didano.robot.api.model.Tb_school;
import cn.didano.robot.api.model.Tb_schoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_schoolMapper {
    long countByExample(Tb_schoolExample example);

    int deleteByExample(Tb_schoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_school record);

    int insertSelective(Tb_school record);

    List<Tb_school> selectByExample(Tb_schoolExample example);

    Tb_school selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_school record, @Param("example") Tb_schoolExample example);

    int updateByExample(@Param("record") Tb_school record, @Param("example") Tb_schoolExample example);

    int updateByPrimaryKeySelective(Tb_school record);

    int updateByPrimaryKey(Tb_school record);
}