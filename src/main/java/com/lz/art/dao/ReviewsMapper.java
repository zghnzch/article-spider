package com.lz.art.dao;

import com.lz.art.pojo.Reviews;
import com.lz.art.pojo.ReviewsExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface ReviewsMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	int countByExample(ReviewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	int deleteByExample(ReviewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	int insert(Reviews record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	int insertSelective(Reviews record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */List<Reviews> selectByExample(ReviewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	Reviews selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */int updateByExampleSelective(@Param("record") Reviews record,@Param("example") ReviewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */int updateByExample(@Param("record") Reviews record,@Param("example") ReviewsExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(Reviews record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table reviews
	 * @mbggenerated
	 */
	int updateByPrimaryKey(Reviews record);

	/** start manaul programer **/
	List<Reviews> pageOfReviews();

	/**************************
	 * start mamual programing
	 * @param date 
	 *************************/
	List<Reviews> selectByFullText(Map<String, String> map);
}