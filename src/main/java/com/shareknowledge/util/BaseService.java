package com.shareknowledge.util;

import java.util.List;

public interface BaseService {
	public <T> List<T> getAll();

	public <T> T getOne(T id);

	public <T> void save(T object);

	public <T> void update(T object);

	public <T> void delete(T id);
}
