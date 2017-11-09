package io.vertx.examples.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import io.vertx.examples.spring.common.Result;
import io.vertx.examples.spring.common.ResultGenerator;
import io.vertx.examples.spring.entity.Tb_device;
import io.vertx.examples.spring.entity.Tb_deviceExample;
import io.vertx.examples.spring.repository.Tb_deviceMapper;
import io.vertx.examples.spring.repository.Tb_deviceMapperDefined;
import io.vertx.examples.spring.vo.Tb_deviceDTO;

/**
 * Simple Spring service bean to expose the results of a trivial database call
 */
@Service
public class DeviceService {

	@Autowired
	private Tb_deviceMapper tb_deviceMapper;
	
	@Autowired
	private Tb_deviceMapperDefined tb_deviceMapperDefined;

	public PageInfo<Tb_device> getAll() {
		PageHelper.startPage(1, 10);
		Tb_deviceExample example = new Tb_deviceExample();
		return new PageInfo<Tb_device>(tb_deviceMapper.selectByExample(example));
	}

	/**
	 * 根据 设备编号获取 学校信息
	 * 
	 * @param device_no
	 */
	public Result getSchoolKey(String device_no) {
		Tb_deviceDTO tb_device = tb_deviceMapperDefined.getDevice(device_no);
		if (tb_device == null) {
			return ResultGenerator.genFailResult("Access deny");
		}
		
		return ResultGenerator.genSuccessResult(tb_device);
	}

}
