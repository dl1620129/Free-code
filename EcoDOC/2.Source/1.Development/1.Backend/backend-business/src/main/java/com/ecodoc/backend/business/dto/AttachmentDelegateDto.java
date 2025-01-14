package com.ecodoc.backend.business.dto;

import com.ecodoc.backend.core.service.FilesStorageService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AttachmentDelegateDto {
	private Long id;
	private String name;
	private Long delegateId;

	public String getDisplayName() {
		return FilesStorageService.origin(this.name);
	}
}
