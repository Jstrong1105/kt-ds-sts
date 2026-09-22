package com.ktdsuniversity.edu.articles.vo.request;

import lombok.Data;

/**
 * 게시글 수정을 위한 데이터
 */
@Data
public class ModifyArticleVO {
	
	private String subject;
	private String content;
	private String email;
}
