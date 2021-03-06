package com.cxyz.check.entity;

/**
 * Created by 夏旭晨 on 2018/9/23.
 */

public class College {
	
	private Integer id;//学院编号
    private String name;//学院名称
    private School school;//所属学校
    private Teacher manager;//系部管理员
    
    public College(){}
    
    public College(Integer id){
    	this.id = id;
    }
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer _id) {
		this.id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		this.name = _name;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Teacher getManager() {
		return manager;
	}
	public void setManager(Teacher manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "College [_id=" + id + ", _name=" + name + ", school="
				+ school + ", manager=" + manager + "]";
	}
}
