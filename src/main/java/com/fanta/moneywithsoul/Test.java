package com.fanta.moneywithsoul;

import com.fanta.database.PoolConfig;
import com.fanta.entity.User;
import com.fanta.repository.UserRepository;
import com.fanta.service.MoneyWithSoulRepositoryImpl;
import com.fanta.service.MoneyWithSoulRepositoryInterface;
import com.fanta.service.MoneyWithSoulService;

import java.util.Optional;

public class Test extends ActiveRecordBase{
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();
//        Test test = new Test();
//        test.testing(userRepository);
//        MoneyWithSoulRepositoryInterface repository = new MoneyWithSoulRepositoryImpl();
//        MoneyWithSoulService moneyWithSoulService = new MoneyWithSoulService();
//        User user = new User();
//        user.setEmail("Georg");
//        moneyWithSoulService.addUser(user);
//        PoolConfig pool = new PoolConfig();
//        pool.Test();

//       int id = 1;
//        Optional<User> userOptional = userRepository.getById(1L);
//        User user = userOptional.orElse(null); // получаем объект User или null
//        if (user != null) {
//            System.out.println("Успішно створено: " + user.getFirstName());
//        } else {
//            System.out.println("Не вдалось створити користувача");
//        }
    }

    public void testing(UserRepository userRepository) {
        User user = new User();
        user.setUserId(1L);
        user.setUserStatus("active");
        user.setFirstName("Jon");
        user.setEmail("@");
        user.setPasswordHash("pasw");
        userRepository.add(user);
    }
}
