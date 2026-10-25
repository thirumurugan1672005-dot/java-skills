package com.example.main;

public class Friend {
     private Long userId;
     private String mockName;
 public Friend() {
	 System.out.println("Friend is created");
 }
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getMockName() {
		return mockName;
	}
	public void setMockName(String mockName) {
		this.mockName = mockName;
	}
     
}
