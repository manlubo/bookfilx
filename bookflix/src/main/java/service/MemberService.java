package service;

import org.apache.ibatis.session.SqlSession;

import domain.Member;
import mapper.MemberMapper;
import util.MybatisUtil;
import util.PasswordEncoder;

public class MemberService {
	public int register(Member member) {
		try(SqlSession session = MybatisUtil.getSqlSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			member.setPw(PasswordEncoder.encode(member.getPw()));
			return mapper.insert(member);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	
	public Member findById(String id) {
		try(SqlSession session = MybatisUtil.getSqlSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			if(mapper.findById(id) == null) {
				return null;
			}
			return mapper.findById(id);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public Member findByNo(Long mno) {
		try(SqlSession session = MybatisUtil.getSqlSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			if(mapper.findByNo(mno) == null) {
				return null;
			}
			return mapper.findByNo(mno);
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public boolean login(String id, String pw) {
		try(SqlSession session = MybatisUtil.getSqlSession()) {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			MemberService service = new MemberService();
			if(id == null || pw == null && service.findById(id) == null) {
				return false;
			}
			
			Member member = service.findById(id);
			
			return PasswordEncoder.matches(pw, member.getPw());
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	public static void main(String[] args) {
		MemberService service = new MemberService();
		
	}
}
