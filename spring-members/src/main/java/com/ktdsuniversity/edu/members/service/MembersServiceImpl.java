package com.ktdsuniversity.edu.members.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ktdsuniversity.edu.members.dao.MembersMapper;
import com.ktdsuniversity.edu.members.vo.response.MembersVO;

@Service
public class MembersServiceImpl implements MembersService {
	
	public MembersServiceImpl(MembersMapper membersMapper) {
		this.membersMapper = membersMapper;
	}
	
	private MembersMapper membersMapper;
	
	@Override
	public long getCount() {
		return this.membersMapper.getCount();
	}
	
	@Override
	public List<MembersVO> getMembers() {
		return this.membersMapper.getMembers();
	}
}
