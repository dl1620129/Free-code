package com.ecodoc.backend.core.repository;

public interface ICategoryRepositoryCustom {
	void updateOrdersAfterCurrentOrder(Integer orderNumber, Long categoryId, Long categoryTypeId);
}
