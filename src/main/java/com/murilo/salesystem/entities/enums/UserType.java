package com.murilo.salesystem.entities.enums;

public enum UserType {

	ADMIN(0, "Administrador"), CLIENT(1, "Cliente"), COMPANY(2, "Empresa");

	private int code;
	private String description;

	private UserType(int code, String description) {
		this.code = code;
		this.description = description;
	}

	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public static UserType toEnum(Integer code) {
		if (code == null) {
			return null;
		}

		for (UserType type : UserType.values()) {
			if (code.equals(type.getCode())) {
				return type;
			}
		}
		throw new IllegalArgumentException("Código inválido para tipo de usuário" + code);
	}

}
