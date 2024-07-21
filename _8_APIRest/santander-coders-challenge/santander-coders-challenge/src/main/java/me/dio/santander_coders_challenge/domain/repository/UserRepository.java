package me.dio.santander_coders_challenge.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import me.dio.santander_coders_challenge.domain.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}