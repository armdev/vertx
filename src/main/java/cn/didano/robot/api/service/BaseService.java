package cn.didano.robot.api.service;

import cn.didano.robot.api.dao.Tb_deviceMapper;
import cn.didano.robot.api.dao.Tb_device_interactionMapper;
import cn.didano.robot.api.dao.Tb_schoolMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 公共 mapper ,避免所有service 注入大量 mapper
 */
@Component
public class BaseService {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected Tb_deviceMapper tb_deviceMapper;

    @Autowired
    protected Tb_device_interactionMapper tb_device_interactionMapper;

    @Autowired
    protected Tb_schoolMapper tb_schoolMapper;

}
