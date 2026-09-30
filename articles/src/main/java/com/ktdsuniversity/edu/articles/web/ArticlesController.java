package com.ktdsuniversity.edu.articles.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ktdsuniversity.edu.articles.service.ArticlesService;
import com.ktdsuniversity.edu.articles.vo.request.ModifyArticleVO;
import com.ktdsuniversity.edu.articles.vo.request.RegistArticleVO;
import com.ktdsuniversity.edu.articles.vo.response.ArticleListVO;
import com.ktdsuniversity.edu.articles.vo.response.ArticlesVO;
import com.ktdsuniversity.edu.commons.util.ApiResponse;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ArticlesController {

//	/**
//	 * @Autowired => BeanContainer 에서 같은 타입의 객체가 있다면 그것을 멤버변수에게 할당시켜라
//	 */
//	@Autowired
//	/**
//	 * @Qualifier => BeanContainer 에 ArticlesService 타입의 객체가 여러 개 있을 경우
//	 * 객체 명이 articlesServiceImpl 인 객체를 멤버변수에 할당시켜라
//	 */
//	@Qualifier("articlesServiceImpl")
//	private ArticlesService articleService;
	
	private ArticlesService articleService;
	
	/**
	 * Spring Framework 7.0 이상 
	 * Spring Boot 4.0 이상 에서는 @Autowired 사용을 권장하지 않는다.
	 * 대신, 생성자를 이용한 DI를 권장한다.
	 * ==> 이유: Lombok Library 때문 (Getter, Setter, Constructor, toString 자동생성)
	 */
//	public ArticlesController(ArticlesService articleService) {
//		this.articleService = articleService;
//	}
	
	@GetMapping("/articles")
	// 컨트롤러가 반환 시키는 "객체"를 "JSON" 으로 변환시키는 View를 사용해라. ==> @ResponseBody
	@ResponseBody
	public ApiResponse<ArticleListVO> getArticles() {
		
		// System.out.println(this.articleService);
		try {
			return ApiResponse.OK(this.articleService.readAllArticles());
		} catch (Exception e) {
			return ApiResponse.ERROR(e.getMessage());
		}
	}
	
	@PostMapping("/articles")
	@ResponseBody
	public ApiResponse<ArticlesVO> makeNewArticle(
			                       // Command Object
			                       // 클라이언트가 컨트롤러로 전송한 파라미터(폼파라미터, 쿼리스트링파라미터)를
			                       // 자동으로 받아오는 역할
			                       RegistArticleVO registArticleVO
			                       // 클라이언트가 컨트롤러로 전송한 파라미터(폼파라미터, 쿼리스트링파라미터)를
			                       // 하나씩 받아오는 역할
			                       // , @RequestParam List<MultipartFile> file
			                       ) {
		
		try {
			return ApiResponse.CREATED(this.articleService.createNewArticle(registArticleVO));	
		} catch (IllegalArgumentException e) {
			return ApiResponse.ERROR(e.getMessage());
		}
	}
	
	@PutMapping("/articles/{articleId}")
	@ResponseBody
	public ApiResponse<ArticlesVO> updateArticle(@PathVariable String articleId
			                      , ModifyArticleVO modifyArticleVO) {
		try {
			return ApiResponse.OK(this.articleService.updateArticle(articleId, modifyArticleVO));
		} catch (Exception e) {
			return ApiResponse.ERROR(e.getMessage());
		}
	}
	
	@DeleteMapping("/articles/{articleId}")
	@ResponseBody
	public ApiResponse<String> deleteArticle(@PathVariable String articleId) {
		try {
			return ApiResponse.OK(this.articleService.deleteArticle(articleId));
		} catch (Exception e) {
			return ApiResponse.ERROR(e.getMessage());
		}
	}
	
	@GetMapping("/articles/{articleId}")
	@ResponseBody
	public ApiResponse<ArticlesVO> getOneArticle(@PathVariable String articleId) {
		try {
			return ApiResponse.OK(this.articleService.readOneArticle(articleId));
		} catch (Exception e) {
			return ApiResponse.ERROR(e.getMessage());
		}
	}
	
	@PutMapping("/articles/recommend/{articleId}")
	@ResponseBody
	public ApiResponse<Long> recommendOneArticle(@PathVariable String articleId) {
		try {
			return ApiResponse.OK(this.articleService.recommendOneArticle(articleId));
		} catch (Exception e) {
			return ApiResponse.ERROR(e.getMessage());
		}
	}
}
















