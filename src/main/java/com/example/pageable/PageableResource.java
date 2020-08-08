package com.example.pageable;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PageableResource<T> {

	private final List<T> content;
	private final Integer totalPages;
	private final Integer totalElements;
	private final Integer page;

	public PageableResource(List<T> content, Integer totalPages, Integer totalElements, Integer page) {
		super();
		this.content = content;
		this.totalPages = totalPages;
		this.totalElements = totalElements;
		this.page = page;
	}

	public List<T> getContent() {
		return content;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public Integer getTotalElements() {
		return totalElements;
	}

	public Integer getPage() {
		return page;
	}

	@Override
	public String toString() {
		return "PageableResource [content=" + content + ", totalPages=" + totalPages + ", totalElements="
				+ totalElements + ", page=" + page + "]";
	}

}
