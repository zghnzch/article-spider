package com.lz.art.pojo;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.id
	 * @mbggenerated
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.title
	 * @mbggenerated
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.author
	 * @mbggenerated
	 */
	private String author;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.data
	 * @mbggenerated
	 */
	private Date data;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.key_words
	 * @mbggenerated
	 */
	private String keyWords;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column article.content
	 * @mbggenerated
	 */
	private String content;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.id
	 * @return  the value of article.id
	 * @mbggenerated
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.id
	 * @param id  the value for article.id
	 * @mbggenerated
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.title
	 * @return  the value of article.title
	 * @mbggenerated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.title
	 * @param title  the value for article.title
	 * @mbggenerated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.author
	 * @return  the value of article.author
	 * @mbggenerated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.author
	 * @param author  the value for article.author
	 * @mbggenerated
	 */
	public void setAuthor(String author) {
		this.author = author == null ? null : author.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.data
	 * @return  the value of article.data
	 * @mbggenerated
	 */
	public Date getData() {
		return data;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.data
	 * @param data  the value for article.data
	 * @mbggenerated
	 */
	public void setData(Date data) {
		this.data = data;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.key_words
	 * @return  the value of article.key_words
	 * @mbggenerated
	 */
	public String getKeyWords() {
		return keyWords;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.key_words
	 * @param keyWords  the value for article.key_words
	 * @mbggenerated
	 */
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords == null ? null : keyWords.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column article.content
	 * @return  the value of article.content
	 * @mbggenerated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column article.content
	 * @param content  the value for article.content
	 * @mbggenerated
	 */
	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}
}