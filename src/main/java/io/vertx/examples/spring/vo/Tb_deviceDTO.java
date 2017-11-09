package io.vertx.examples.spring.vo;

import io.vertx.examples.spring.entity.Tb_device;

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
