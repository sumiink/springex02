package co.micol.ex02.member.serviceImpl;


import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.micol.ex02.member.service.MemberService;
import co.micol.ex02.member.vo.MemberVO;

@Repository("memberDao")
public class MemberServiceImpl implements MemberService {
//	@Autowired		//자동주입(연결된 한줄만)
//	private DataSource dataSource;
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<MemberVO> memberSelectList() {
		return sqlSession.selectList("memberListSelect");
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int memberInsert(MemberVO vo) {
	
		return sqlSession.insert("memberInsert", vo);
	}

	@Override
	public int memberDelete(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
