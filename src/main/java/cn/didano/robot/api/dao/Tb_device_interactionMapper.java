package cn.didano.robot.api.dao;

import cn.didano.robot.api.model.Tb_device_interaction;
import cn.didano.robot.api.model.Tb_device_interactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_device_interactionMapper {
    long countByExample(Tb_device_interactionExample example);

    int deleteByExample(Tb_device_interactionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_device_interaction record);

    int insertSelective(Tb_device_interaction record);

    List<Tb_device_interaction> selectByExample(Tb_device_interactionExample example);

    Tb_device_interaction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_device_interaction record, @Param("example") Tb_device_interactionExample example);

    int updateByExample(@Param("record") Tb_device_interaction record, @Param("example") Tb_device_interactionExample example);

    int updateByPrimaryKeySelective(Tb_device_interaction record);

    int updateByPrimaryKey(Tb_device_interaction record);
}