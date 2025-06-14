package mapper;

import java.util.List;

import domain.Member;

public interface MemberMapper {
//	멤버 찾기
	List<Member> list();
	Member findById(String id);
	Member findByNo(Long mno);	
	
//	멤버 생성
	int insert(Member member);
	
}
