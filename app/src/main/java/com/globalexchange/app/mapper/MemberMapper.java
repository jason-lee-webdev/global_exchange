package com.globalexchange.app.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public int checkId(String memberId, String memberPwd);



}
