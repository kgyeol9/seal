package com.myspring.vampir.member.vo;

import java.sql.Date;
import org.springframework.stereotype.Component;

@Component("memberVO")
public class MemberVO {

    // 내부 기준 (카멜케이스)
    private String memId;
    private String memPwd;
    private String nickname;
    private String email;
    private Date   joinDate;

    public MemberVO() { }

    public MemberVO(String memId, String memPwd, String nickname, String email, Date joinDate) {
        this.memId = memId;
        this.memPwd = memPwd;
        this.nickname = nickname;
        this.email = email;
        this.joinDate = joinDate;
    }

    // ====== 공식 프로퍼티 (매퍼/신규 폼에서 사용) ======
    public String getMemId() { return memId; }
    public void setMemId(String memId) { this.memId = memId; }

    public String getMemPwd() { return memPwd; }
    public void setMemPwd(String memPwd) { this.memPwd = memPwd; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Date getJoinDate() { return joinDate; }
    public void setJoinDate(Date joinDate) { this.joinDate = joinDate; }

    // ====== 폼 호환 (snake 케이스 name=mem_id/mem_pwd 바인딩용) ======
    public String getMem_id() { return memId; }
    public void setMem_id(String mem_id) { this.memId = mem_id; }

    public String getMem_pwd() { return memPwd; }
    public void setMem_pwd(String mem_pwd) { this.memPwd = mem_pwd; }

    // ====== JSP 호환 (예전 ${id}, ${pwd}, ${name} 지원) ======
    public String getId() { return memId; }
    public void setId(String id) { this.memId = id; }

    public String getPwd() { return memPwd; }
    public void setPwd(String pwd) { this.memPwd = pwd; }

    public String getName() { return nickname; }
    public void setName(String name) { this.nickname = name; }

    @Override
    public String toString() {
        return "MemberVO{" +
                "memId='" + memId + '\'' +
                ", memPwd='" + memPwd + '\'' +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }
}
