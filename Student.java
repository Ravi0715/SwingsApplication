package practice.collectiontasks;

import java.util.List;

public class Student {
	
	List<String> subjectCodeList;
	List<String> subjectNameList;
	List<Double> marksList;
	List<Integer> creditsList;
	List<String> statusList;
	
	
	
	public List<String> getStatusList() {
		return statusList;
	}
	public void setStatusList(List<String> statusList) {
		this.statusList = statusList;
	}
	public List<String> getSubjectCodeList() {
		return subjectCodeList;
	}
	public void setSubjectCodeList(List<String> subjectCodeList) {
		this.subjectCodeList = subjectCodeList;
	}
	public List<String> getSubjectNameList() {
		return subjectNameList;
	}
	public void setSubjectNameList(List<String> subjectNameList) {
		this.subjectNameList = subjectNameList;
	}
	public List<Double> getMarksList() {
		return marksList;
	}
	public void setMarksList(List<Double> marksList) {
		this.marksList = marksList;
	}
	public List<Integer> getCreditsList() {
		return creditsList;
	}
	public void setCreditsList(List<Integer> creditsList) {
		this.creditsList = creditsList;
	}

}
