package com.example.vehicle_management.service;

import com.example.vehicle_management.model.Member;
import com.example.vehicle_management.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    public Member save(Member member) {
        return memberRepository.save(member);
    }

    public void deleteById(String userId) {
        memberRepository.deleteById(userId);
    }

    public Member findById(String userId) {
        return memberRepository.findById(userId).orElse(null);
    }
}