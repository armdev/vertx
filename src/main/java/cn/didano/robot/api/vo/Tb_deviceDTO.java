package cn.didano.robot.api.vo;

import cn.didano.robot.api.model.Tb_device;

public class Tb_deviceDTO extends Tb_device {

	private Integer schoolId;
	private String schoolTitle;
	private String occasion;

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolTitle() {
		return schoolTitle;
	}

	public void setSchoolTitle(String schoolTitle) {
		this.schoolTitle = schoolTitle;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

}
