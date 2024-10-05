package com.example.vehicle_management.repository;

import com.example.vehicle_management.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

    // Tìm kiếm thành viên theo ID
    Optional<Member> findById(String userId);

    // Xóa thành viên theo ID
    void deleteById(String userId);

    // Bạn có thể thêm các phương thức tùy chỉnh khác nếu cần
}