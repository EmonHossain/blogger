package com.shareknowledge.util;

import java.util.List;
/**
 * 
 * @author Emon Hossain
 * Software Engineer,
 * Computer Source Infotech,
 * Aug 24, 2017 -- 2:53:53 PM,
 */
public interface BaseService {
	/**
	 * 
	 * @author Emon Hossain
	 * @Date Aug 24, 2017 -- 2:52:05 PM
	 * @return List of generic type object
	 */
	public <T> List<T> getAll();

	/**
	 * 
	 * @author Emon Hossain
	 * @Date Aug 24, 2017 -- 2:52:56 PM
	 * @param id
	 * @return Single object
	 */
	public <T> T getOne(T id);

	/**
	 * 
	 * @author Emon Hossain
	 * @Date Aug 24, 2017 -- 2:53:19 PM
	 * @param object
	 */
	public <T> void save(T object);

	/**
	 * 
	 * @author Emon Hossain
	 * @Date Aug 24, 2017 -- 2:53:32 PM
	 * @param object
	 */
	public <T> void update(T object);

	/**
	 * 
	 * @author Emon Hossain
	 * @Date Aug 24, 2017 -- 2:53:36 PM
	 * @param id
	 */
	public <T> void delete(T id);
}
