//package com.ll.member;
//
//import com.ll.Container;
//
//public class MemberService {
//    Member member;
//
//    public MemberService() {
//        member = new Member();
//    }
//
//    public int join (String userId, String password) {
//        return this.member.signup(userId, password);
//    }
//
//
//    public Member memberFindByUserId(String userId) {
//        return this.member.memberFindByUserId(userId);
//    }
//
//    public Member memberFindById (int id) {
//        return this.member.memberFindById(id);
//    }
//
//    public void login(Member checkedMember) {
//        Container.setLoginedMember(checkedMember);
//    }
//
//    public void logout() {
//        Container.setLoginedMember(null);
//    }
//}