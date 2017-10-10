package com.example.request;

public class LoginRequest extends BaseRequest {

	private String account;
	private String password;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean isValid() {
		return account != null && password != null && !account.isEmpty()
				&& !password.isEmpty();
	}

}
