package cn.didano.robot.api.service;

import cn.didano.robot.api.DateTimeUtils;
import cn.didano.robot.api.model.Tb_school;
import cn.didano.robot.api.model.Tb_schoolExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.didano.robot.api.common.Result;
import cn.didano.robot.api.common.ResultGenerator;
import cn.didano.robot.api.model.Tb_device;
import cn.didano.robot.api.model.Tb_deviceExample;
import cn.didano.robot.api.dao.Hand_Tb_deviceMapper;
import cn.didano.robot.api.vo.Tb_deviceDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Simple Spring service bean to expose the results of a trivial database call
 */
@Service
public class DeviceService extends BaseService{



	@Autowired
	private Hand_Tb_deviceMapper tb_deviceMapperDefined;

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
		if (tb_device.getSchoolId() == null) {
			return ResultGenerator.genFailResult("学校ID为空");
		}
		Tb_school tb_school = getSchoolKey(tb_device.getSchoolId(),tb_device.getId());

		if (tb_school == null){
			return ResultGenerator.genFailResult("找不到学校: "+tb_device.getSchoolId());
		}else{
			Map<String,Object> map = new HashMap<>();
			map.put("school_id",tb_school.getId());
			map.put("school_title",tb_school.getTitle());
			map.put("key",tb_school.getKey());
			map.put("key_time",DateTimeUtils.parse(DateTimeUtils.YYYYMMDDHHMMSS,tb_school.getKeyActiveTime()));
			return ResultGenerator.genSuccessResult(map);
		}
	}

	public Tb_school getSchoolKey(Integer school_id, Integer device_id){
		logger.error("获取学校 key ");

		Tb_schoolExample schoolExample = new Tb_schoolExample();
		Tb_schoolExample.Criteria criteria = schoolExample.createCriteria();
		criteria.andIdEqualTo(school_id);
		criteria.andDeletedEqualTo(false);

		List<Tb_school> schoolList = tb_schoolMapper.selectByExample(schoolExample);

		String today = DateTimeUtils.now(DateTimeUtils.YYYYMMDD);

		if (!schoolList.isEmpty()){
			return schoolList.get(0);
		}else{
			logger.error("未找到学校{}",school_id);
			return null;
		}
	}

}
