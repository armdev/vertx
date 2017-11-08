package io.vertx.examples.spring.repository;

import io.vertx.examples.spring.entity.Tb_device;
import io.vertx.examples.spring.entity.Tb_deviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Tb_deviceMapper {
    long countByExample(Tb_deviceExample example);

    int deleteByExample(Tb_deviceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tb_device record);

    int insertSelective(Tb_device record);

    List<Tb_device> selectByExample(Tb_deviceExample example);

    Tb_device selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tb_device record, @Param("example") Tb_deviceExample example);

    int updateByExample(@Param("record") Tb_device record, @Param("example") Tb_deviceExample example);

    int updateByPrimaryKeySelective(Tb_device record);

    int updateByPrimaryKey(Tb_device record);
}