package com.cloudage.membercenter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudage.membercenter.entity.Article;
import com.cloudage.membercenter.entity.User;
import com.cloudage.membercenter.repository.IArticleRepository;

@Component
@Service
@Transactional
public class DefaultArticleService implements IArticleService{

	@Autowired
	IArticleRepository articleRepo;
	
	@Override
	public List<Article> findAllByAuthor(User user) {
		return articleRepo.findAllByAuthor(user);
	}

	@Override
	public List<Article> findAllByAuthorId(Integer userId) {
		return articleRepo.findAllByAuthorId(userId);
	}

	@Override
	public Article save(Article article) {
		
		return articleRepo.save(article);
	}

}
