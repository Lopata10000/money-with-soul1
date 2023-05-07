package com.fanta.entity;

import java.time.LocalDateTime;

public class User {
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
    private LocalDateTime registeredAt;
    private String userStatus;

    public static class Builder {
        private final User user = new User();

        public Builder userId(Long userId) {
            user.setUserId(userId);
            return this;
        }

        public Builder firstName(String firstName) {
            user.setFirstName(firstName);
            return this;
        }

        public Builder lastName(String lastName) {
            user.setLastName(lastName);
            return this;
        }

        public Builder email(String email) {
            user.setEmail(email);
            return this;
        }

        public Builder passwordHash(String passwordHash) {
            user.setPasswordHash(passwordHash);
            return this;
        }

        public Builder registeredAt(LocalDateTime registeredAt) {
            user.setRegisteredAt(registeredAt);
            return this;
        }

        public Builder userStatus(String userStatus) {
            user.setUserStatus(userStatus);
            return this;
        }

        public User build() {
            return user;
        }
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public LocalDateTime getRegisteredAt() {
        return registeredAt;
    }

    public void setRegisteredAt(LocalDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
