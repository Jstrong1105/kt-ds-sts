package com.ktdsuniversity.edu.replies.vo.response;

import java.util.List;

import lombok.Data;

@Data
public class ReplieListVO {
	
	private long replieCount;
	private List<RepliesVO> replieList;
}
