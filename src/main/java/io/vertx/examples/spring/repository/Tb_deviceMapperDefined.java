package io.vertx.examples.spring.repository;

import io.vertx.examples.spring.vo.Tb_deviceDTO;


/**
 * 用户自定义SQL 方便
 * 
 * @author sheng.he@didano.cn
 *
 */
public interface Tb_deviceMapperDefined {

	/**
	 * 根据设备编号  获取设备信息
	 * @param deviceNo
	 * @return
	 */
    Tb_deviceDTO getDevice(String deviceNo);

}