package com.techelevator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Category;


@Component
public class JDBCCategoryDao implements CategoryDao {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public JDBCCategoryDao(DataSource datasource) {
        this.jdbcTemplate = new JdbcTemplate(datasource);
    }

	@Override
	public List<Category> getAllCategories() {
		
		List<Category> allCategories = new ArrayList<>();
		String sqlGetCategories = "SELECT category_id, name FROM category ORDER BY category_id ";
		
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetCategories);
		while (results.next()) {
			allCategories.add(mapRowToCategory(results));
		}
		
		return allCategories;
	}
	
	private Category mapRowToCategory(SqlRowSet results) {
		return new Category(results.getInt("category_id"), results.getString("name"));
	}
	

}
