package com.ktdsuniversity.edu.members.vo.response;

import java.util.List;

public class MembersListVO {
	
	private long count;
	private List<MembersVO> members;
	
	@Override
	public String toString() {
		return "MembersListVO [count=" + count + ", members=" + members + "]";
	}
	public long getCount() {
		return this.count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public List<MembersVO> getMembers() {
		return this.members;
	}
	public void setMembers(List<MembersVO> members) {
		this.members = members;
	}
}
