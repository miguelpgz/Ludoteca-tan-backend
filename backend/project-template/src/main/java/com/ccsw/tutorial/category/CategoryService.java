package com.ccsw.tutorial.category;

import java.util.List;

import com.ccsw.tutorial.category.model.Category;
import com.ccsw.tutorial.category.model.CategoryDto;

/**
 * @author ccsw
 *
 */
public interface CategoryService {

	/**
	 * Método para recuperar todas las
	 * {@link com.ccsw.tutorial.category.model.Category}
	 * 
	 * @return
	 */
	Category get(Long id);

	List<Category> findAll();

	/**
	 * Método para crear o actualizar una
	 * {@link com.ccsw.tutorial.category.model.Category}
	 * 
	 * @param dto
	 * @return
	 */
	void save(Long id, CategoryDto dto);

	/**
	 * Método para borrar una {@link com.ccsw.tutorial.category.model.Category}
	 * 
	 * @param id
	 */
	void delete(Long id);
}
