package com.ktdsuniversity.edu.members.service;

import java.util.List;

import com.ktdsuniversity.edu.members.vo.response.MembersVO;

public interface MembersService {
	
	long getCount();
	
	List<MembersVO> getMembers();
}
